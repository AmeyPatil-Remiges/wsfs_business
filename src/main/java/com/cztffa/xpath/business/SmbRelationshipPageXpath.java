package com.cztffa.xpath.business;

public class SmbRelationshipPageXpath {
    public static final String RELATION = "//tf-dropdown[@t-model='Party__r.RelatedPartyXrefs__r.0.RelationCode__c']//input";
    public static final String NOBO = "//tf-checkbox[@t-model='Submission__c.PartyXrefs__r.1.NoBeneficialOwner']//input";
    public static final String ISBO = "//tf-checkbox[@t-model='CZIsBeneficialOwner__c']//input";
    public static final String OWNERSHIPPERCENTAGE = "//tf-percentage[@t-model='OwnershipPercentage__c']//input";
    public static final String HASCONTROL = "//tf-checkbox[@t-model='ControllingParty__c']//input";
    public static final String ISSIGNERONACCOUNT = "//tf-checkbox-group[@t-model='ApplicantRole__c']";
    public static final String RELATIONSHIPDISC = "//tf-checkbox[@t-model='Accepted__c']";
    public static final String TF_CHECKBOX_13_INPUT = "//tf-checkbox[@t-model='Accepted__c']//input";
    public static final String RELATIONSHIPPAGENEXTBUTON = "//button[normalize-space()='Next']";
}
