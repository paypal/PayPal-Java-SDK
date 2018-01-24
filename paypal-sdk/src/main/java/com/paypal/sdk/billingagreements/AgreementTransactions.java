// This class was generated on Tue, 23 Jan 2018 17:16:08 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// AgreementTransactions.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/+xYUW/kNBB+51eMwgsnpclB4RD7VlEhFXTXqrc6CZVqd9aebAyOnbMnXQLqf0dONrvJJqUcVwpC+1R5PDvzfTPz2U5/j+Z1SdEsOls7ooIMw9yh8ShYWeOjOHqHTuFK0xssgl8URz9QvV+ckxdOlcE7RDGAzmENNgPcReRexCSKo7Pg0uZ9GUfXhPLS6DqaZag9BcP7SjmSO8OVsyU5VuSj2c0E4l78MeAdjEXPbaGV5wGVP3X7QJJgVz+T4EOur/4+19fWUA1clwQbxTmIyjkyogZhJcH7CrXKFEm4Q13RRA0KW5kDvp3pgFubJLMOUGvIlEEjFOo28okjjUwSMkVa+gS+sw7oVyxKTTGsUKMRFEOJdVMSWVEMaCR4C9Y8Xec9O2XWY5pdVQZEe8Yh1XlOcMO5IzoROToUTA4u3l6efPnF518PK3z7Wc5c+lmaSrojHTAlJdYl6kTYIpVW+FQZprXDEDyVypHg1JHntAt0EgL59MUHlYFddVAFU2l9Hz9aim4Q9nXoLOMi7Kg2Lgm8VuucYUWABhpW5JqB2Pop8qDVLwTL769+XALnyICOwFgOw6MEal1D5lotoIYwS9AWutQoCCQJVaDe+UxHn78570X31UqqOyVJBkwWOLeVRyM5344h5wRuWzgwVbEiFwTa5Woy+3awh82NwRPBzcXbSwidb3s9S9PNZpMobxPr1qnyNs1tQalnNBKd9Lu+Lpq+JjkXT9La215zP1L1GdFiQvkD81H9R/Uf1f9/VL8hnlL/wHxU/1H9R/X/J9X/UHNLrMktqEClBy0e2seNbnbg4jzUhZvGe7YFuY9V5l+cyRaeCYsx6q15DHpVeWXIewge/xJyz8iVH6DemR7SE0Pr0kHufRsm8C4oDZSf/VS9fHkqKt38pXalVbtafmvDwcoklwnMhyFAeRDb7eaIDSmK5rbI0cOKyLTuGQU9NIKhcDATJW2WtEtzkPQKHasg4cU1ZZWRTfYzKNHxBBVo75F9Urf9UT+leywlGanMeppl2W6CJ2bdfGY/Eq0He/4PgD0noyaD76LKxmM6TNq1+nkGl1VBC89YlIPhHZjHAyyxGypVEGzyMEsHZK1oplzGoAzcXBgmZ4gPfplZVyDvL0+2VvtEEWfNoZpzoVOXidPT028+9dQEPvkqefUiecbi/GYNjWuztY5L0/AKu50WllUZSC/CxrJ9Fz0X/N7/qJQccjjcGhPZ3wL9g+n5kYfn5oPYt5sTbQiP1IC/f6jOu8dHDMtrCvMZzo2r9jG6fBJut/e395/8AQAA//8=
// DO NOT EDIT
package com.paypal.sdk.billingagreements;

import java.util.List;

import com.braintreepayments.http.annotations.*;
/**
 * An array of agreement transactions.
 */
@Model
public class AgreementTransactions {

    // Required default constructor
    public AgreementTransactions() {}

	/**
	* An array of agreement transaction objects.
	*/
	@SerializedName(value = "agreement_transaction_list", listClass = AgreementTransaction.class)
	private List<AgreementTransaction> agreementTransactionList;

	public List<AgreementTransaction> agreementTransactionList() { return agreementTransactionList; }
	
	public AgreementTransactions agreementTransactionList(List<AgreementTransaction> agreementTransactionList) {
	    this.agreementTransactionList = agreementTransactionList;
	    return this;
	}
}
