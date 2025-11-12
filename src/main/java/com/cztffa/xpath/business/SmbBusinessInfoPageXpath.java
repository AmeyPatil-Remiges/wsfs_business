package com.cztffa.xpath.business;

public class SmbBusinessInfoPageXpath {
    public static final String BUSINESSTYPE = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='Party__r.OrganizationType__c']/descendant::input";
    public static final String CORPORATION = "//div[contains(text(),'Corporation')]";
    public static final String LEGALBUSINESSNAME = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='Party__r.LegalName__c']/descendant::input";
    public static final String DOINGBUSINESSAS = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='Party__r.DoingBusinessAs__c']/descendant::input";
    public static final String DATEOFESTABLISHMENT = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-date[@t-model='Party__r.EstablishmentDate__c']/descendant::input";
    public static final String ADDRESSLINE1 = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='Line1__c']/descendant::input";
    public static final String CITY = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='City__c']/descendant::input";
    public static final String STATE = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='State__c']/descendant::input";
    public static final String ZIP = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='ZipCode__c']/descendant::input";
    public static final String YEARS = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-number[@t-model='Party__r.AddressXrefs__r.0.PeriodInYears__c']/descendant::input";
    public static final String PRIMARYPHONENUMBER = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-phone[@t-model='Party__r.PrimaryPhone__c']/descendant::input";
    public static final String SECONDARYPHONENUMBER = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-phone[@t-model='Party__r.SecondaryPhone__c']/descendant::input";
    public static final String BUSINESSEMAIL = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-email[@t-model='Party__r.PrimaryEmail__c']/descendant::input";
    public static final String BUSINESSWEBSITE = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='Party__r.Website__c']/descendant::input";
    public static final String TAXIDTYPE = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='Party__r.NationalIdentifierType__c']/descendant::input";
    public static final String FEDERALTIN = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-tin[@t-model='Party__r.NationalIdentifierValue__c']/descendant::input";
    public static final String BUSINESSIAMNOTSUBJECTTO = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-checkbox[@t-model='Accepted__c']/descendant::input";
    public static final String BUSINESSACTIVITY = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='Party__r.IndustryClassificationValue__c']/descendant::input";
    public static final String BUSINESSINFONEXTBUTTON = "//button[normalize-space()='Next']";
}
