package com.cztffa.page.business;
import com.cztffa.xpath.business.SmbCddPageXpath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class SmbCddPageModel {
    private WebDriver driver;

    public SmbCddPageModel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = SmbCddPageXpath.CDD)
    public WebElement cdd;
    
    @FindBy(xpath = SmbCddPageXpath.CDDPAGENEXTBUTON)
    public WebElement CddPageNextButon;
    
}
