package com.cztffa.objects;

import lombok.Data;

@Data
public class Funding {

    private String fundingSource;

    private String fundingAmount;

    private String bank;

    private String achUserId;

    private String achPassword;

    private String fundingType;

    private String cardNumber;

    private String cardHolderName;

    private String paypalID;
    private String paypalPwd;
    private String term;

    private String expiryDate;

    private String cvv;

    private String zipCode;

    private String streetAddress;

    private String submissionId;

}
