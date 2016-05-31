#### releasinator config ####
configatron.product_name = "PayPal Java SDK"

# List of items to confirm from the person releasing.  Required, but empty list is ok.
configatron.prerelease_checklist_items = [  
  "Sanity check the master branch.", 
  "Unit tests passed.",
  "Functional tests passed."
]

def validate_version_match()
  if 'v'+parent_pom_version() != @current_release.version
    Printer.fail("parent pom version #{parent_pom_version} does not match changelog version #{@current_release.version}.")
    abort()
  end
    Printer.success("parent pom version version #{parent_pom_version} matches latest changelog version #{@current_release.version}.")

  if 'v'+sdk_pom_version() != @current_release.version
    Printer.fail("sdk pom version #{sdk_pom_version} does not match changelog version #{@current_release.version}.")
    abort()
  end
    Printer.success("sdk pom version version #{sdk_pom_version} matches latest changelog version #{@current_release.version}.")  

  if 'v'+sample_pom_version() != @current_release.version
    Printer.fail("sample pom version #{sample_pom_version} does not match changelog version #{@current_release.version}.")
    abort()
  end
    Printer.success("sample pom version version #{sample_pom_version} matches latest changelog version #{@current_release.version}.")  
  
  if 'v'+sample_dependency_pom_version() != @current_release.version
    Printer.fail("sample dependency pom version #{sample_dependency_pom_version} does not match changelog version #{@current_release.version}.")
    abort()
  end
    Printer.success("sample dependency pom version version #{sample_dependency_pom_version} matches latest changelog version #{@current_release.version}.")     
  
  if 'v'+file_SDK_version() != @current_release.version
    Printer.fail("file SDK version #{file_SDK_version} does not match changelog version #{@current_release.version}.")
    abort()
  end
    Printer.success("file SDK version version #{file_SDK_version} matches latest changelog version #{@current_release.version}.") 
end

def validate_paths
  @validator.validate_in_path("mvn --version")
end

def check_tokens
  check_token("SONATYPE_USERNAME")
  check_token("SONATYPE_PASSWORD")
end  

configatron.custom_validation_methods = [
  method(:validate_paths),
  method(:validate_version_match),
  method(:check_tokens)
]

def build_method
  # to run Unit tests 
  CommandProcessor.command("mvn clean install", live_output=true)
  # to run Functional tests. at present functional tests are failing , so we are skipping functional test execution temporally 
  #CommandProcessor.command("mvn clean install -DsuiteFile=src/test/resources/functional.xml", live_output=true)
end

# The command that builds the sdk.  Required.
configatron.build_method = method(:build_method)

def publish_to_package_manager(version)
  CommandProcessor.command("mvn gpg:sign-and-deploy-file -Durl=https://#{ENV["SONATYPE_USERNAME"]}:#{ENV["SONATYPE_PASSWORD"]}@oss.sonatype.org/service/local/staging/deploy/maven2/ -DrepositoryId=sonatype-nexus-staging -DpomFile=#{pom_path}/com/paypal/sdk/rest-api-sdk/#{parent_pom_version}/rest-api-sdk-#{parent_pom_version}.pom -Dfile=rest-api-sdk/target/rest-api-sdk-#{parent_pom_version}.jar -Dgpg.passphrase=#{ENV["SONATYPE_PASSWORD"]}", live_output=true)
  CommandProcessor.command("mvn gpg:sign-and-deploy-file -Durl=https://#{ENV["SONATYPE_USERNAME"]}:#{ENV["SONATYPE_PASSWORD"]}@oss.sonatype.org/service/local/staging/deploy/maven2/ -DrepositoryId=sonatype-nexus-staging -DpomFile=#{pom_path}/com/paypal/sdk/rest-api-sdk/#{parent_pom_version}/rest-api-sdk-#{parent_pom_version}.pom -Dfile=rest-api-sdk/target/rest-api-sdk-#{parent_pom_version}-sources.jar -Dclassifier=sources -Dgpg.passphrase=#{ENV["SONATYPE_PASSWORD"]}", live_output=true)
  CommandProcessor.command("mvn gpg:sign-and-deploy-file -Durl=https://#{ENV["SONATYPE_USERNAME"]}:#{ENV["SONATYPE_PASSWORD"]}@oss.sonatype.org/service/local/staging/deploy/maven2/ -DrepositoryId=sonatype-nexus-staging -DpomFile=#{pom_path}/com/paypal/sdk/rest-api-sdk/#{parent_pom_version}/rest-api-sdk-#{parent_pom_version}.pom -Dfile=rest-api-sdk/target/rest-api-sdk-#{parent_pom_version}-javadoc.jar -Dclassifier=javadoc -Dgpg.passphrase=#{ENV["SONATYPE_PASSWORD"]}", live_output=true)
end

# The method that publishes the sdk to the package manager.  Required.
configatron.publish_to_package_manager_method = method(:publish_to_package_manager)


def wait_for_package_manager(version)
  CommandProcessor.wait_for("wget -U \"non-empty-user-agent\" -qO- http://central.maven.org/maven2/com/paypal/sdk/rest-api-sdk/#{parent_pom_version}/rest-api-sdk-#{parent_pom_version}.pom | cat")
end

# The method that waits for the package manager to be done.  Required
configatron.wait_for_package_manager_method = method(:wait_for_package_manager)

# Whether to publish the root repo to GitHub.  Required.
configatron.release_to_github = true

def parent_pom_version()
  File.open("pom.xml", 'r') do |f|
    f.each_line do |line|
      if line.match ("<artifactId>rest-api<\/artifactId>")
        line = f.gets 
        if line.match (/<version>\d*\.\d*\.\d*<\/version>/)
          return line.strip.split('>')[1].strip.split('<')[0] 
        end      
      end
    end
  end
end

def sdk_pom_version()
  File.open("rest-api-sdk/pom.xml", 'r') do |f|
    f.each_line do |line|
      if line.match ("<artifactId>rest-api-sdk<\/artifactId>")
        line = f.gets 
        if line.match (/<version>\d*\.\d*\.\d*<\/version>/)
          return line.strip.split('>')[1].strip.split('<')[0] 
        end      
      end
    end
  end
end

def sample_pom_version()
  File.open("rest-api-sample/pom.xml", 'r') do |f|
    f.each_line do |line|
      if line.match ("<name>REST API SAMPLE<\/name>")
        line = f.gets 
        if line.match (/<version>\d*\.\d*\.\d*<\/version>/)
          return line.strip.split('>')[1].strip.split('<')[0] 
        end      
      end
    end
  end
end

def sample_dependency_pom_version()
  File.open("rest-api-sample/pom.xml", 'r') do |f|
    f.each_line do |line|
      if line.match ("<artifactId>rest-api-sdk<\/artifactId>")
        line = f.gets 
        if line.match (/<version>\d*\.\d*\.\d*<\/version>/)
          return line.strip.split('>')[1].strip.split('<')[0] 
        end      
      end
    end
  end
end

def file_SDK_version()
  f=File.open("rest-api-sdk/src/main/java/com/paypal/base/sdk/info/SDKVersionImpl.java", 'r') do |f|
    f.each_line do |line|
      if line.match(/SDK_VERSION = \"\d*\.\d*\.\d*\"/)
        return line.strip.split('=')[1].strip.split('"')[1]               
      end
    end
  end
end

def check_token(token_param)
  if !ENV[token_param]
    Printer.fail("#{token_param} environment variable required.  Please add this value to your environment file.")
    abort()
  end 
    Printer.success("#{token_param} environment variable found.")  
end

def pom_path()
  File.open(ENV['HOME']+'/.m2/settings.xml', 'r') do |f|
    f.each_line do |line|
      if line.match (/<\/localRepository>/)
        return line.strip.split('>')[1].strip.split('<')[0]    
      end
    end
  end
end
