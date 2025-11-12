package com.cztffa.xpath.business;

public class SmbFundingPageXpath {
    public static final String FUNDINGAMOUNT = "//tf-money[@t-model='Submission__c.Applications__r.%s.Amount__c']";
    public static final String FUNDINGTYPE = "//tfcz-funding[@t-model='Submission__c']//tf-dropdown[@t-model='CZSubType__c']";
    public static final String TERMVALUE = "//tf-dropdown[@t-model='TermCode__c']//input";
    public static final String PLAID = "//button[normalize-space()='Verify with']";
    public static final String CONTINUEASGUEST = "//button[normalize-space()='Continue as guest']";
    public static final String BTNLOGIN = "//button[normalize-space()='Continue to login']";
    public static final String TXTUSERNAME = "//input[@placeholder='Username']";

    public static final String TXTPASSWORD = "//input[@placeholder='Password']";
    public static final String BTNAUTHSUBMIT = "//button[normalize-space()='Sign in']";
    public static final String BTNAUTHCONTINUEAFTER = "//button[normalize-space()='Get code']";
    public static final String BTNAUTHCONTINUEAFTERSUCCESS = "//button[normalize-space()='Submit']";
    public static final String PLAIDCHECKINGCHECKBOX = "//div[contains(text(),'Plaid Checking')]";
    public static final String BTNCONTINUE = "//button[normalize-space()='Continue']";
    public static final String BTNPAYPAL = "//div[@class='paypal-button']";
    public static final String CHECKBOXTERMS = "//div[contains(text(),'I have read and accept the Terms and Conditions')]";
    public static final String BTNSUBMITCONFIRM = "//button[normalize-space()='Connect account information']";
    public static final String BTNCONTINUE_1 = "//button[normalize-space()='Finish without saving']";
    public static final String FUNDDISC = "//tf-checkbox[@t-model='Accepted__c']";
    public static final String FUNDINGNEXTBUTTON = "//button[normalize-space()='Next']";
    public static final String BTNCONTINUE_3 = "//button[normalize-space()='Continue']";
    public static final String CHECKBOXTERMS_1 = "//tf-checkbox//input";
    public static final String PAYPALID = "//div//input[@placeholder='Email or mobile number']";
    public static final String PAYPALPWD = "//div//input[@placeholder='Password']";
    public static final String PAYPALIDNXT = "//button[normalize-space()='Next']";
    public static final String PAYPALGN = "//button[normalize-space()='Log In']";
    public static final String CMPURCH = "//button[normalize-space()='Complete Purchase']";
    public static final String FUNDINGSAVEMYPROGRESS = "//button[normalize-space()='Save My Progress']";

}


//    public static final String FUNDINGAMOUNT = "//tf-money[@t-model='Submission__c.Applications__r.%s.Amount__c']";
//    public static final String FUNDINGTYPE = "//tfcz-funding[@t-model='Submission__c']//tf-dropdown[@t-model='CZSubType__c']";
//    public static final String PLAID = "//button[normalize-space()='Verify with']";
//    public static final String CONTINUEASGUEST = "//button[normalize-space()='Continue as guest']";
//    public static final String BTNLOGIN = "//button[normalize-space()='Continue to login']";
//    public static final String TXTUSERNAME = "//input[@placeholder='Username']";
//    public static final String TXTPASSWORD = "//input[@placeholder='Password']";
//    public static final String BTNAUTHSUBMIT = "//button[normalize-space()='Sign in']";
//    public static final String BTNAUTHCONTINUEAFTER = "//button[normalize-space()='Get code']";
//    public static final String BTNAUTHCONTINUEAFTERSUCCESS = "//button[normalize-space()='Submit']";
//    public static final String PLAIDCHECKINGCHECKBOX = "//div[contains(text(),'Plaid Checking')]";
//    public static final String BTNCONTINUE = "//button[normalize-space()='Continue']";
//    public static final String CHECKBOXTERMS = "//div[contains(text(),'I have read and accept the Terms and Conditions')]";
//    public static final String BTNSUBMITCONFIRM = "//button[normalize-space()='Connect account information']";
//    public static final String BTNCONTINUE_1 = "//button[normalize-space()='Finish without saving']";
//    public static final String FUNDDISC = "//tf-checkbox[@t-model='Accepted__c']";
//    public static final String FUNDINGNEXTBUTTON = "//button[normalize-space()='Next']";
//}
