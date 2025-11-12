package com.cztffa.page.business;
import com.cztffa.xpath.business.SmbBusinessInfoPageXpath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class SmbBusinessInfoPageModel {
    private WebDriver driver;

    public SmbBusinessInfoPageModel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String businessType = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='Party__r.OrganizationType__c']/descendant::input";
    
    public String Corporation = "//div[contains(text(),'Corporation')]";
    
    public String legalBusinessName = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='Party__r.LegalName__c']/descendant::input";
    
    public String doingBusinessAs = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='Party__r.DoingBusinessAs__c']/descendant::input";
    
    public String dateofEstablishment = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-date[@t-model='Party__r.EstablishmentDate__c']/descendant::input";
    
    public String AddressLine1 = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='Line1__c']/descendant::input";
    
    public String city = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='City__c']/descendant::input";
    
    public String state = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='State__c']/descendant::input";
    
    public String zip = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='ZipCode__c']/descendant::input";
    
    public String years = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-number[@t-model='Party__r.AddressXrefs__r.0.PeriodInYears__c']/descendant::input";
    
    public String primaryPhoneNumber = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-phone[@t-model='Party__r.PrimaryPhone__c']/descendant::input";
    
    public String secondaryPhoneNumber = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-phone[@t-model='Party__r.SecondaryPhone__c']/descendant::input";
    
    public String businessEmail = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-email[@t-model='Party__r.PrimaryEmail__c']/descendant::input";
    
    public String businessWebsite = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='Party__r.Website__c']/descendant::input";
    
    public String taxIDType = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='Party__r.NationalIdentifierType__c']/descendant::input";
    
    public String FederalTIN = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-tin[@t-model='Party__r.NationalIdentifierValue__c']/descendant::input";
    
    public String businessIamNotSubjectTo = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-checkbox[@t-model='Accepted__c']/descendant::input";
    
    public String businessActivity = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='Party__r.IndustryClassificationValue__c']/descendant::input";
    
    public String businessInfoNextButton = "//button[normalize-space()='Next']";
    
}
