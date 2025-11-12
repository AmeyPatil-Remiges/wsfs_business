package com.cztffa.xpath.business;

public class SmbPersonalInfoPageXpath {
    public static final String PREFIX = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='Party__r.Prefix__c']/descendant::input";
    public static final String MIDDLENAME = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='Party__r.MiddleName__c']/descendant::input";
    public static final String SUFFIX = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='Party__r.Suffix__c']/descendant::input";
    public static final String STREETADDRESS1 = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='Line1__c']/descendant::input";
    public static final String CITY = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='City__c']/descendant::input";
    public static final String STATE = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='State__c']/descendant::input";
    public static final String ZIP = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='ZipCode__c']/descendant::input";
    public static final String YEARS = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-number[@t-model='Party__r.AddressXrefs__r.0.PeriodInYears__c']/descendant::input";
    public static final String IDTYPE = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='Identifications__r.0.Type__c']/descendant::input";
    public static final String IDNUMBER = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='Identifications__r.0.IdentificationNumber__c']/descendant::input";
    public static final String STATEISSUED = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='Identifications__r.0.IssuingState__c']/descendant::input";
    public static final String ISSUEDATE = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-date[@t-model='Identifications__r.0.IssueDate__c']/descendant::input";
    public static final String SSN = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-ssn[@t-model='NationalIdentifierValue__c']/descendant::input";
    public static final String EXPIRYDATE = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-date[@t-model='Identifications__r.0.ExpirationDate__c']/descendant::input";
    public static final String DATEOFBIRTH = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-date[@t-model='BirthDate__c']/descendant::input";
    public static final String ISPEPPRESENT = "//tf-radio//input[@value='No']";
    public static final String PEPMEMBERTYPE = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='PEP_Member_Type']/descendant::input";
    public static final String ADDADDITIONALAPPLICANTBUTTON = "//tf-stepper-body//button[contains(text(), 'Add a Person')]";
    public static final String ISAPPLICANTPRESENT = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-checkbox[@t-model='IsPresent__c']/descendant::input";
    public static final String REMOVEPERSON = "//button[normalize-space()='Remove Person']";
    public static final String REMOVEBUTTON = "//button[normalize-space()='Remove']";
    public static final String PERSONALINFONEXTBUTON = "//button[normalize-space()='Next']";
    public static final String CONTINUEBTN1 = "//button[normalize-space()='Continue']";
}
