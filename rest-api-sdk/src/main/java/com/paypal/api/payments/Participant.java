package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Participant extends PayPalModel {

    /**
     * The participant email address.
     */
    private String email;

    /**
     * The participant first name. 256 characters max.
     */
    private String firstName;

    /**
     * The participant last name. 256 characters max.
     */
    private String lastName;

    /**
     * The participant company business name. 256 characters max.
     */
    private String businessName;

    /**
     * Representation of a phone number.
     */
    private Phone phone;

    /**
     * Representation of a phone number.
     */
    private Phone fax;

    /**
     * The participant website. 4000 characters max. URI format.
     */
    private String website;

    /**
     * Additional information, such as business hours. 400 characters max.
     */
    private String additionalInfo;

    /**
     * Base Address object used as billing address in a payment or extended for Shipping Address.
     */
    private ParticipantAddress address;

    /**
     * Default Constructor
     */
    public Participant() {
    }

    /**
     * Parameterized Constructor
     */
    public Participant(String email) {
        this.email = email;
    }
}
