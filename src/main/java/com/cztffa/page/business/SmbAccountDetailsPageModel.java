package com.cztffa.page.business;
import com.cztffa.xpath.business.SmbAccountDetailsPageXpath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class SmbAccountDetailsPageModel {
    private WebDriver driver;

    public SmbAccountDetailsPageModel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    @FindBy(xpath = SmbAccountDetailsPageXpath.BUSINESSDEBITCARD)
//    public WebElement BusinessDebitCard;
    
    @FindBy(xpath = SmbAccountDetailsPageXpath.ACCOUNTDETAILSNEXTBUTTON)
    public WebElement AccountDetailsNextButton;
    
}
