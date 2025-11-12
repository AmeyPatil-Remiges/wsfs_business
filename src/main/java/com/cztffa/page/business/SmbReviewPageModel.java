package com.cztffa.page.business;
import com.cztffa.xpath.business.SmbReviewPageXpath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class SmbReviewPageModel {
    private WebDriver driver;

    public SmbReviewPageModel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = SmbReviewPageXpath.DISCLOSURECHECKBOX)
    public WebElement disclosureCheckbox;
    
    @FindBy(xpath = SmbReviewPageXpath.BRACCEPT)
    public WebElement brAccept;
    
    @FindBy(xpath = SmbReviewPageXpath.SUBMITBUTTON)
    public WebElement submitButton;
    
}
