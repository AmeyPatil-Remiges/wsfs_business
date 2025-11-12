package com.cztffa.page.business;
import com.cztffa.xpath.business.SmbRelationshipPageXpath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class SmbRelationshipPageModel {
    private WebDriver driver;

    public SmbRelationshipPageModel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = SmbRelationshipPageXpath.RELATION)
    public WebElement relation;
    
    @FindBy(xpath = SmbRelationshipPageXpath.NOBO)
    public WebElement noBo;
    
    @FindBy(xpath = SmbRelationshipPageXpath.ISBO)
    public WebElement isBo;
    
    @FindBy(xpath = SmbRelationshipPageXpath.OWNERSHIPPERCENTAGE)
    public WebElement ownershipPercentage;
    
    @FindBy(xpath = SmbRelationshipPageXpath.HASCONTROL)
    public WebElement hasControl;
    
    @FindBy(xpath = SmbRelationshipPageXpath.ISSIGNERONACCOUNT)
    public WebElement isSignerOnAccount;
    
    @FindBy(xpath = SmbRelationshipPageXpath.RELATIONSHIPDISC)
    public WebElement relationshipDisc;
    
    @FindBy(xpath = SmbRelationshipPageXpath.TF_CHECKBOX_13_INPUT)
    public WebElement tfcheckbox13input;
    
    @FindBy(xpath = SmbRelationshipPageXpath.RELATIONSHIPPAGENEXTBUTON)
    public WebElement relationshipPageNextButon;
    
}
