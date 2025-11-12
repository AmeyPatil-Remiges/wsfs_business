package com.cztffa.page.funding;

import com.cztffa.dataproviders.DataCSVExtractor;
import com.cztffa.driver.SeleniumDriver;
import com.cztffa.objects.Funding;
import com.cztffa.page.account.SmbAccountDetailsPage;
import com.cztffa.util.ApplicantUtil;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertTrue;

@Slf4j
public class SmbFundingPage extends SmbAccountDetailsPage {
    private SeleniumDriver seleniumdriver;
    public void addFundDetailsForSMB(Funding funding) throws InterruptedException {
       // public void addFundDetails(Funding funding) throws InterruptedException {
            this.seleniumdriver = getSeleniumdriver();
            WebDriver driver = seleniumdriver.getWebDriver();
            String mainWindow = driver.getWindowHandle();

            ApplicantUtil applicantUtil = new ApplicantUtil();
            log.info("Processing the funding details");



            log.info("Clicking funding dropdown");
            waitWithSpinner(getSmbFundingPageModel().fundingType);
            browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().fundingType);
            Thread.sleep(1000);
            selectElement(getSeleniumdriver().getWebDriver(), getSmbFundingPageModel().fundingType);
            browserActions.clickApply(getSeleniumdriver().getWebDriver(), getSmbFundingPageModel().fundingType);
            Thread.sleep(1000);
            log.info("Clicked on funding dropdown");

            if (funding.getFundingSource().equalsIgnoreCase("From")) {
                log.info("Selecting source of funding");
                wait(getSmbFundingPageModel().FromNonWSFS);
                selectElement(getSeleniumdriver().getWebDriver(), getSmbFundingPageModel().FromNonWSFS);
                browserActions.clickApply(getSeleniumdriver().getWebDriver(), getSmbFundingPageModel().FromNonWSFS);
                log.info("Source of funding selected");
                waitForSpinnerToDisappear();
//			waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
//			Thread.sleep(12000);
//			Thread.sleep(2000);
                waitForVisibilityWithLoader("//*[contains(text(),'Funding Details')]");
                Thread.sleep(1000);
//			browserActions.scrollToWebElement(getSeleniumdriver(),getFundingPageModel().acknowledgePalidToggle);
//			Thread.sleep(2000);
//			browserActions.clickButton(getSeleniumdriver(),getFundingPageModel().acknowledgePalidToggle);
//			log.info("Selected acknowledgePalidToggle");
//			Thread.sleep(1000);
//            waitWithSpinner(getFundingPageModel().btnPlaid);
                waitForSpinnerToDisappear();
                innerWsfsWait();
                waitForSpinnerToDisappear();
                innerWsfsWait();
                waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
//            browserActions.scrollToWebElement(getSeleniumdriver(), getFundingPageModel().btnPlaid);
//            browserActions.clickUsingEnter(getSeleniumdriver().getWebDriver(), getFundingPageModel().btnPlaid);
//            log.info("Clicked on Verify with Plaid button");
//			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(getFundingPageModel().framePlaid));
                Thread.sleep(2000);
                browserActions.switchToFrame(getSeleniumdriver(), getSmbFundingPageModel().framePlaid);
                log.info("switching window");
                Thread.sleep(2000);
                waitForSpinnerToDisappear();
                log.info("Window switched");
                waitWithSpinner(getSmbFundingPageModel().continueAsGuest);
                browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().continueAsGuest);
//			Thread.sleep(1000);
                waitWithSpinner(getSmbFundingPageModel().continueAsGuest);
                browserActions.clickApply(getSeleniumdriver().getWebDriver(), getSmbFundingPageModel().continueAsGuest);
//			Thread.sleep(2000);
                log.info("Clicked on continue as guest button");

//			waitWithSpinner(getFundingPageModel().btnAuthContinue);
//			browserActions.scrollToWebElement(getSeleniumdriver(), getFundingPageModel().btnAuthContinue);
//			browserActions.clickApply(getSeleniumdriver().getWebDriver(), getFundingPageModel().btnAuthContinue);
//			log.info("Clicked on continue button");
//			Thread.sleep(2000);
                waitForSpinnerToDisappear();
                waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
//			waitForVisibility("//*[contains(text(),'Select your institution')]");

                if (funding.getBank().equalsIgnoreCase("Chase")) {
                    log.info("selecting Bank account");
                    Thread.sleep(1000);
                    //browserActions.clickButton(getSeleniumdriver(), getFundingPageModel().CitiBank);
                    //bank  should b=match exact text value in plaid instutuon name eg : Chase,Bank of America,Citibank Online,
                    log.info("bank name locator" + applicantUtil.getWebElement(getSeleniumdriver(), getSmbFundingPageModel().plaidInstutionName, funding.getBank()));
                    browserActions.clickButton(getSeleniumdriver(), applicantUtil.getWebElement(getSeleniumdriver(), getSmbFundingPageModel().plaidInstutionName, funding.getBank()));
                    Thread.sleep(1000);
                }

                String parent = getSeleniumdriver().getWebDriver().getWindowHandle();
                log.info("Clicking on Continue to login button");
                browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().btnLogin);
                Thread.sleep(5000);
                browserActions.clickButton(getSeleniumdriver(), getSmbFundingPageModel().btnLogin);
                Thread.sleep(5000);
                waitForSpinnerToDisappear();
                waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());

                browserActions.switchToNewTab(getSeleniumdriver());
                log.info("Entering username and password");
//			browserActions.enterText(getSeleniumdriver(), getFundingPageModel().txtUsername, funding.getAchUserId());
//            Thread.sleep(2000);
//			browserActions.enterText(getSeleniumdriver(), getFundingPageModel().txtPassword, funding.getAchPassword());
                Thread.sleep(1000);
//
                log.info("Clicking on Sign in button");
                browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().btnAuthSubmit);
                Thread.sleep(1000);
                browserActions.clickButton(getSeleniumdriver(), getSmbFundingPageModel().btnAuthSubmit);
                Thread.sleep(2000);
                waitForSpinnerToDisappear();
                waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());

                log.info("Clicking on Get code button");
                waitWithSpinner(getSmbFundingPageModel().btnAuthContinueAfter);
                browserActions.clickButton(getSeleniumdriver(), getSmbFundingPageModel().btnAuthContinueAfter);
                waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());

                log.info("Clicking on Submit button");
                waitWithSpinner(getSmbFundingPageModel().btnAuthContinueAfterSuccess);
                browserActions.clickButton(getSeleniumdriver(), getSmbFundingPageModel().btnAuthContinueAfterSuccess);
                Thread.sleep(2000);
                log.info("Clicking on Plaid Checking");
                //browserActions.scrollToWebElement(getSeleniumdriver(), getFundingPageModel().plaidCheckingCheckbox);
                // Thread.sleep(5000);
                browserActions.clickCheckboxListItem(getSeleniumdriver(), getSmbFundingPageModel().plaidCheckingCheckbox);

                browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().btnSubmit);
                Thread.sleep(5000);
                browserActions.clickCheckboxListItem(getSeleniumdriver(), getSmbFundingPageModel().btnSubmit);
                Thread.sleep(2000);

                browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().checkboxTerms);
                Thread.sleep(2000);
                browserActions.clickCheckboxListItem(getSeleniumdriver(), getSmbFundingPageModel().checkboxTerms);
                Thread.sleep(2000);

                wait(getSmbFundingPageModel().btnSubmitConfirm);
                browserActions.clickButton(getSeleniumdriver(), getSmbFundingPageModel().btnSubmitConfirm);
                log.info("Clicked on Connected account Information button");
                Thread.sleep(3000);

                getSeleniumdriver().getWebDriver().switchTo().window(parent);
                browserActions.switchToDefaultContent(getSeleniumdriver());
                browserActions.switchToFrame(getSeleniumdriver(), getSmbFundingPageModel().framePlaid);
                log.info("Switched frame to frame Plaid");
                waitForSpinnerToDisappear();
                waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
                log.info("Moved to the last continue button finish without saving");

                Thread.sleep(3000);
                log.info("Moved to the last continue button fish without saving");
                browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().btnFinishWsaving);
                waitWithSpinner(getSmbFundingPageModel().btnFinishWsaving);
                browserActions.clickButton(getSeleniumdriver(), getSmbFundingPageModel().btnFinishWsaving);
                log.info("Clicked on Continue without saving button");


//			browserActions.clickButton(getSeleniumdriver(), getFundingPageModel().btnSubmitConfirm);
//			log.info("Clicked on Connected account Information button");
//			Thread.sleep(3000);
//			waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());

//			getSeleniumdriver().getWebDriver().switchTo().window(parent);
//			browserActions.switchToDefaultContent(getSeleniumdriver());
//			browserActions.switchToFrame(getSeleniumdriver(), getFundingPageModel().framePlaid);
//            log.info("Switched frmae to frame Plaid");
//			waitForSpinnerToDisappear();
//			waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
//			log.info("Moved to the last continue button fish without saving");
//			browserActions.scrollToWebElement(getSeleniumdriver(),getFundingPageModel().btnContinue);
//			waitWithSpinner(getFundingPageModel().btnContinue);
//			browserActions.clickButton(getSeleniumdriver(), getFundingPageModel().btnContinue);
//			log.info("Clicked on Continue without saving button");
                browserActions.switchToDefaultContent(getSeleniumdriver());
                log.info("Selecting External account");

                Thread.sleep(8000);
                waitForSpinnerToDisappear();
                waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
                waitForSpinnerToDisappear();
                waitForVisibilityWithLoader("//*[contains(text(),'Source Account Number')]");

                waitWithSpinner(getSmbFundingPageModel().drpAcNum);
                browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().drpAcNum);
                waitForSpinnerToDisappear();
                selectElement(getSeleniumdriver().getWebDriver(), getSmbFundingPageModel().drpAcNum);
                browserActions.clickButton(getSeleniumdriver(), getSmbFundingPageModel().drpAcNum);
                log.info("Clicked on External account dropdown");

//			wait(getFundingPageModel().optAcNum);
//			browserActions.scrollToWebElement(getSeleniumdriver(),getFundingPageModel().optAcNum);
//			selectElement(getSeleniumdriver().getWebDriver(),getFundingPageModel().optAcNum);
//			browserActions.clickButton(getSeleniumdriver(), getFundingPageModel().optAcNum);
//			log.info("Selected Account");

                log.info("Selecting checkbox");
                waitForSpinnerToDisappear();
                waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
                browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().checkboxTerms_1);
                Thread.sleep(1000);
                browserActions.clickCheckboxListItem(getSeleniumdriver(), getSmbFundingPageModel().checkboxTerms_1);

            }
            else if(funding.getFundingSource().equalsIgnoreCase("paypal")) {
                log.info("Selecting source of funding paypal");
                wait(getSmbFundingPageModel().FromPaypal);
                selectElement(getSeleniumdriver().getWebDriver(), getSmbFundingPageModel().FromPaypal);
                browserActions.clickApply(getSeleniumdriver().getWebDriver(), getSmbFundingPageModel().FromPaypal);
                log.info("Source of funding paypal selected");
                Thread.sleep(5000);
                waitForSpinnerToDisappear();

                log.info("Clicking on PAYPAL button");
//            waitWithSpinner(getFundingPageModel().btnPaypal);
                browserActions.clickButton(getSeleniumdriver(), getSmbFundingPageModel().btnPaypal);
                log.info("Clicked on PAYPAL");
                Thread.sleep(5000);

                log.info("Changing current window");
                for (String windowHandle : driver.getWindowHandles()) {
                    if (!windowHandle.equals(mainWindow)) {
                        driver.switchTo().window(windowHandle);
                        log.info("Switched to popup window: " + windowHandle);
                        break;
                    }
                }
                Thread.sleep(3000);
                browserActions.enterText(getSeleniumdriver(), getSmbFundingPageModel().paypalID, funding.getPaypalID());
                Thread.sleep(5000);
                browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().paypalIdNxt);
                Thread.sleep(2000);
                browserActions.clickButton(getSeleniumdriver(), getSmbFundingPageModel().paypalIdNxt);
                Thread.sleep(5000);
                browserActions.enterText(getSeleniumdriver(), getSmbFundingPageModel().paypalPwd, funding.getPaypalPwd());
                browserActions.clickButton(getSeleniumdriver(), getSmbFundingPageModel().paypalgn);
                Thread.sleep(5000);
                browserActions.enterText(getSeleniumdriver(), getSmbFundingPageModel().cmpurch, funding.getPaypalPwd());
                browserActions.clickButton(getSeleniumdriver(), getSmbFundingPageModel().cmpurch);
                Thread.sleep(5000);


            }
//		else if(funding.getFundingSource().equalsIgnoreCase("creditCard") || funding.getFundingSource().equalsIgnoreCase("debitCard")) {
//			if(funding.getFundingSource().equalsIgnoreCase("creditCard")){
//				browserActions.clickApply(getSeleniumdriver().getWebDriver(), getFundingPageModel().sourceOfFundCCApply);
//				log.info("Selecting credit card");
//			}
//			(funding.getFundingSource().equalsIgnoreCase("debitCard")){
//				browserActions.clickApply(getSeleniumdriver().getWebDriver(), getFundingPageModel().sourceOfFundDCApply);
//				log.info("Selecting debit card");
//			}
//			Thread.sleep(8000);
//			browserActions.scrollToWebElement(getSeleniumdriver(), getFundingPageModel().frameCardNumber);
//			Thread.sleep(2000);
//			browserActions.switchToFrame(getSeleniumdriver(), getFundingPageModel().frameCardNumber);
//			Thread.sleep(3000);
//			browserActions.scrollToWebElement(getSeleniumdriver(), getFundingPageModel().cardNumber);
//			Thread.sleep(2000);
//			browserActions.enterText(getSeleniumdriver(), getFundingPageModel().cardNumber,funding.getCardNumber());
//			Thread.sleep(2000);
//			log.info("Entering card number");
//			browserActions.switchToDefaultContent(getSeleniumdriver());
//			browserActions.switchToFrame(getSeleniumdriver(), getFundingPageModel().frameCardName);
//			browserActions.scrollToWebElement(getSeleniumdriver(), getFundingPageModel().cardHolder);
//			browserActions.enterText(getSeleniumdriver(), getFundingPageModel().cardHolder,funding.getCardHolderName());
//			log.info("Entering cardholder name");
//			Thread.sleep(2000);
//			browserActions.switchToDefaultContent(getSeleniumdriver());
//			browserActions.switchToFrame(getSeleniumdriver(), getFundingPageModel().frameCardDate);
//			browserActions.scrollToWebElement(getSeleniumdriver(), getFundingPageModel().cardExpiry);
//			browserActions.enterTextKeyEntry(getSeleniumdriver(), getFundingPageModel().cardExpiry,funding.getExpiryDate());
//			log.info("Entering card expiry");
//			Thread.sleep(2000);
//			browserActions.switchToDefaultContent(getSeleniumdriver());
//			browserActions.switchToFrame(getSeleniumdriver(), getFundingPageModel().frameCardCVV);
//			browserActions.scrollToWebElement(getSeleniumdriver(), getFundingPageModel().cvv);
//			browserActions.enterTextKeyEntry(getSeleniumdriver(), getFundingPageModel().cvv,funding.getCvv());
//			log.info("Entering card cvv");
//			Thread.sleep(2000);
//			browserActions.switchToDefaultContent(getSeleniumdriver());
//			browserActions.switchToFrame(getSeleniumdriver(), getFundingPageModel().frameCardZip);
//			browserActions.scrollToWebElement(getSeleniumdriver(), getFundingPageModel().zipCode);
//			browserActions.enterTextKeyEntry(getSeleniumdriver(), getFundingPageModel().zipCode,funding.getZipCode());
//			log.info("Entering zipcode");
//			Thread.sleep(2000);
//			browserActions.switchToDefaultContent(getSeleniumdriver());
//			browserActions.switchToFrame(getSeleniumdriver(), getFundingPageModel().frameCardStreet);
//			browserActions.scrollToWebElement(getSeleniumdriver(), getFundingPageModel().street);
//			browserActions.enterText(getSeleniumdriver(), getFundingPageModel().street,funding.getStreetAddress());
//			log.info("Entering street address");
//			browserActions.switchToDefaultContent(getSeleniumdriver());
//			Thread.sleep(2000);
//			browserActions.clickButton(getSeleniumdriver(), getFundingPageModel().btnPay, 2000, 2000);
//			log.info("Clicking on Pay button");
//			Thread.sleep(8000);
//			browserActions.clickApply(getSeleniumdriver().getWebDriver(), getFundingPageModel().btnAuthContinue);
//			log.info("Clicking on Continue button");
//			Thread.sleep(2000);
//		}
            log.info("Finished processing of Funding details");
        }

        public void addFundAmount(Funding funding, int index) throws InterruptedException {
            this.seleniumdriver = getSeleniumdriver();
            WebDriver driver = seleniumdriver.getWebDriver();
            ApplicantUtil applicantUtil = new ApplicantUtil();

            log.info("Processing the funding details");
            if(getSeleniumdriver().getWebDriver().getPageSource().contains("Certificate Term")){
                waitWithSpinner(getSmbFundingPageModel().termValue);
                browserActions.clickApply(getSeleniumdriver().getWebDriver(),
                        getSmbFundingPageModel().termValue);
                log.info("selecting term {}", funding.getTerm());
                Thread.sleep(1000);
                WebElement termText = applicantUtil.getWebElement(getSeleniumdriver(), getSmbFundingPageModel().termText, funding.getTerm());
                browserActions.clickApply(getSeleniumdriver().getWebDriver(),
                        termText);
                assertTrue(true);

            }

            Thread.sleep(3000);
            waitWithSpinner(element(getSmbFundingPageModel().fundingAmount, index));

            log.info("Entering funding amount " + index);
            browserActions.scrollToWebElement(seleniumdriver, element(getSmbFundingPageModel().fundingAmount, index));
            Thread.sleep(3000);
            browserActions.enterTextKeyEntry(getSeleniumdriver(), element(getSmbFundingPageModel().fundingAmount, index), funding.getFundingAmount());

        }

    }







        //        ApplicantUtil applicantUtil = new ApplicantUtil();
//        log.info("Processing the funding details");
//        waitForSpinnerToDisappear();
//        waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
//        waitForVisibilityWithLoader("//*[contains(text(),'Specify how you would like to')]");
//        String pageSource = getSeleniumdriver().getWebDriver().getPageSource();
//
////        if(pageSource.contains("Do you want to fund now?")) {
////            browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().fundingToggleButton);
////            Thread.sleep(2000);
////            waitWithSpinner(getSmbFundingPageModel().fundingToggleButton);
////            browserActions.clickButton(getSeleniumdriver(), getSmbFundingPageModel().fundingToggleButton);
////            log.info("After funding toggle click");
////            Thread.sleep(2000);
////        }
//
//        if(pageSource.contains("Do you want to fund now?")) {
//            log.info("Clicking funding toggle");
//            waitForVisibilityWithLoader("//*[contains(text(),'Do you want to fund now?')]");
//            browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().fundingToggleButton);
//            browserActions.clickButton(getSeleniumdriver(), getSmbFundingPageModel().fundingToggleButton);
//            log.info("Funding toggle clicked");
//        }
//        browserActions.clickApply(getSeleniumdriver().getWebDriver(), getSmbFundingPageModel().sourceOfFundDrApply);
//        log.info("After funding text box click");
//
//        if (funding.getFundingSource().equalsIgnoreCase("ACH")) {
//            browserActions.scrollToWebElement(getSeleniumdriver(),getSmbFundingPageModel().sourceOfFundOpApply);
//            waitWithSpinner(getSmbFundingPageModel().sourceOfFundOpApply);
//            browserActions.clickApply(getSeleniumdriver().getWebDriver(), getSmbFundingPageModel().sourceOfFundOpApply);
//            log.info("After selected External Account");
//
//            waitForSpinnerToDisappear();
//            if (pageSource.contains("I acknowledge that I want to ")) {
//                waitForVisibilityWithLoader("//*[contains(text(),'Do you want to fund now?')]");
//                if (getSmbFundingPageModel().acknowledgePalidToggle.isDisplayed()) {
//                    browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().acknowledgePalidToggle);
//                    waitWithSpinner(getSmbFundingPageModel().acknowledgePalidToggle);
//                    browserActions.clickCheckboxListItem(getSeleniumdriver(), getSmbFundingPageModel().acknowledgePalidToggle);
//                    log.info("Selected acknowledgePalidToggle");
//                } else {
//                    log.info("acknowledgePalidToggle is not displayed");
//                }
//            } else {
//                log.info("Text 'I acknowledge that I want to' not found in page source, skipping checkbox selection");
//            }
//
//           log.info("Clciking on btn Plaid");
//           wait(getSmbFundingPageModel().btnPlaid);
//           browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().btnPlaid);
//            waitWithSpinner(getSmbFundingPageModel().btnPlaid);
//            waitWithShortTime(getSeleniumdriver());
//            browserActions.clickUsingEnter(getSeleniumdriver().getWebDriver(), getSmbFundingPageModel().btnPlaid);
//             waitForSpinnerToDisappear();
//            browserActions.switchToFrame(getSeleniumdriver(), getSmbFundingPageModel().framePlaid);
//
//            browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().btnAuthContinueGuest);
//            waitWithSpinner(getSmbFundingPageModel().btnAuthContinueGuest);
//            browserActions.clickApply(getSeleniumdriver().getWebDriver(), getSmbFundingPageModel().btnAuthContinueGuest);
//            waitForSpinnerToDisappear();
//            browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().btnAuthContinue);
//            waitWithSpinner(getSmbFundingPageModel().btnAuthContinue);
//            browserActions.clickApply(getSeleniumdriver().getWebDriver(), getSmbFundingPageModel().btnAuthContinue);
//            waitForSpinnerToDisappear();
//            waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
////		if (funding.getBank().equalsIgnoreCase("Citi Bank")) {
//            log.info("selecting citi bank acccount");
//            log.info("bank name locator"+applicantUtil.getWebElement(getSeleniumdriver(),getSmbFundingPageModel().plaidInstutionName,funding.getBank()));
//             waitWithShortTime(getSeleniumdriver());
//            browserActions.clickButton(getSeleniumdriver(), applicantUtil.getWebElement(getSeleniumdriver(),getSmbFundingPageModel().plaidInstutionName,funding.getBank()),3000, 500);
////		}
//            String parent=getSeleniumdriver().getWebDriver().getWindowHandle();
//            browserActions.clickButton(getSeleniumdriver(),getSmbFundingPageModel().btnLogin);
//            waitForSpinnerToDisappear();
//            waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
//
//            browserActions.switchToNewTab(getSeleniumdriver());
//            browserActions.enterText(getSeleniumdriver(), getSmbFundingPageModel().txtUsername, funding.getAchUserId());
//            browserActions.enterText(getSeleniumdriver(), getSmbFundingPageModel().txtPassword, funding.getAchPassword());
//            browserActions.scrollToWebElement(getSeleniumdriver(),getSmbFundingPageModel().btnAuthSubmit);
//            waitWithSpinner(getSmbFundingPageModel().btnAuthSubmit);
//            browserActions.clickButton(getSeleniumdriver(), getSmbFundingPageModel().btnAuthSubmit);
//            waitForSpinnerToDisappear();
//            waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
//
//            waitWithSpinner(getSmbFundingPageModel().btnAuthContinueAfter);
//            browserActions.clickButton(getSeleniumdriver(), getSmbFundingPageModel().btnAuthContinueAfter);
//            waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
//
//            waitWithSpinner(getSmbFundingPageModel().btnAuthContinueAfterSuccess);
//            browserActions.clickButton(getSeleniumdriver(), getSmbFundingPageModel().btnAuthContinueAfterSuccess);
//            selectElement(getSeleniumdriver().getWebDriver(),getSmbFundingPageModel().checkbox);
//
//            browserActions.clickCheckboxListItem(getSeleniumdriver(),getSmbFundingPageModel().checkbox);
//            waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
//             log.info("Clicking on submit button");
//            waitWithSpinner(getSmbFundingPageModel().btnSubmit);
//            browserActions.clickButton(getSeleniumdriver(), getSmbFundingPageModel().btnSubmit);
//            waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
//
//            selectElement(getSeleniumdriver().getWebDriver(),getSmbFundingPageModel().checkboxTerms);
//            browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().checkboxTerms);
//            selectElement(getSeleniumdriver().getWebDriver(),getSmbFundingPageModel().checkboxTerms);
//            waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
//
//            browserActions.clickCheckboxListItem(getSeleniumdriver(),getSmbFundingPageModel().checkboxTerms);
//            waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
//            log.info("submit and confirm");
//            waitWithSpinner(getSmbFundingPageModel().btnSubmitConfirm);
//
//            waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
//            Thread.sleep(2500);
//            browserActions.clickButton(getSeleniumdriver(), getSmbFundingPageModel().btnSubmitConfirm);
//            Thread.sleep(3000);
//
//            waitForSpinnerToDisappear();
//             log.info("Before Switch");
//            getSeleniumdriver().getWebDriver().switchTo().window(parent);
//            log.info("After Switch");
//            browserActions.switchToDefaultContent(getSeleniumdriver());
//
//            browserActions.switchToFrame(getSeleniumdriver(), getSmbFundingPageModel().framePlaid);
//            log.info("Switched to framePlaid");
//            waitForSpinnerToDisappear();
//            waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
//            log.info("Scrolling to finish without saving button");
//            browserActions.scrollToWebElement(getSeleniumdriver(),getSmbFundingPageModel().btnContinue);
//            log.info(" before finish without Saving click");
//             browserActions.clickButton(getSeleniumdriver(),getSmbFundingPageModel().btnContinue);
//            log.info(" After finish without Saving click");
//
//            browserActions.switchToDefaultContent(getSeleniumdriver());
//            log.info("Waiting for going to parent page");
//            waitForSpinnerToDisappear();
//            waitForVisibilityWithLoader("//*[contains(text(),'External Account')]");
//
//            browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().drpAcNum);
//            log.info("Scrolled to drop Acnum");
//            waitForSpinnerToDisappear();
//            selectElement(getSeleniumdriver().getWebDriver(),getSmbFundingPageModel().drpAcNum);
//            browserActions.clickButton(getSeleniumdriver(), getSmbFundingPageModel().drpAcNum);
//
//            waitForSpinnerToDisappear();
//            log.info("I am on optAcNum");
//            browserActions.scrollToWebElement(getSeleniumdriver(),getSmbFundingPageModel().optAcNum);
//            selectElement(getSeleniumdriver().getWebDriver(),getSmbFundingPageModel().optAcNum);
//            browserActions.clickButton(getSeleniumdriver(),getSmbFundingPageModel().optAcNum);
//            log.info("Selected Drop Down Value Clicked");
//            waitForSpinnerToDisappear();
//            browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().flagTrantoAcc);
//            log.info("Scrolled to Entered Amount");
//            waitWithSpinner(getSmbFundingPageModel().flagTrantoAcc);
//            browserActions.scrollToWebElement(getSeleniumdriver(),getSmbFundingPageModel().authorizePalidToggle);
//            log.info("Clciking on Authorise Plaid toggle");
//
//            browserActions.clickButton(getSeleniumdriver(),getSmbFundingPageModel().authorizePalidToggle);//added
//            waitForSpinnerToDisappear();
//            waitForInnerSpinnersToDisappear(getSeleniumdriver().getWebDriver());
//            log.info("clicked Authorise plaid toggle");
//
//        }
//        else if(funding.getFundingSource().equalsIgnoreCase("creditCard") || funding.getFundingSource().equalsIgnoreCase("debitCard")) {
//
//            if (funding.getFundingSource().equalsIgnoreCase("creditCard")) {
//                browserActions.clickApply(getSeleniumdriver().getWebDriver(), getSmbFundingPageModel().sourceOfFundCCApply);
//                log.info("Credit card selected");
//            } else if (funding.getFundingSource().equalsIgnoreCase("debitCard")) {
//                browserActions.clickApply(getSeleniumdriver().getWebDriver(), getSmbFundingPageModel().sourceOfFundDCApply);
//                log.info("Debit card selected");
//            }
//            Thread .sleep(5000);
//
//            browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().frameCardNumber);
//            Thread.sleep(2000);
//            browserActions.switchToFrame(getSeleniumdriver(), getSmbFundingPageModel().frameCardNumber);
//            Thread.sleep(3000);
//
//            browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().cardNumber);
//            Thread.sleep(2000);
//            browserActions.enterText(getSeleniumdriver(), getSmbFundingPageModel().cardNumber,funding.getCardNumber());
//            Thread.sleep(2000);
//            log.info("Frame Card number enetered");
//            browserActions.switchToDefaultContent(getSeleniumdriver());
//            browserActions.switchToFrame(getSeleniumdriver(), getSmbFundingPageModel().frameCardName);
//            browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().cardHolder);
//            browserActions.enterText(getSeleniumdriver(), getSmbFundingPageModel().cardHolder,funding.getCardHolderName());
//            Thread.sleep(2000);
//            browserActions.switchToDefaultContent(getSeleniumdriver());
//            browserActions.switchToFrame(getSeleniumdriver(), getSmbFundingPageModel().frameCardDate);
//            browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().cardExpiry);
//            browserActions.enterTextKeyEntry(getSeleniumdriver(), getSmbFundingPageModel().cardExpiry,funding.getExpiryDate());
//            Thread.sleep(2000);
//            browserActions.switchToDefaultContent(getSeleniumdriver());
//            browserActions.switchToFrame(getSeleniumdriver(), getSmbFundingPageModel().frameCardCVV);
//            browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().cvv);
//            browserActions.enterTextKeyEntry(getSeleniumdriver(), getSmbFundingPageModel().cvv,funding.getCvv());
//            Thread.sleep(2000);
//            browserActions.switchToDefaultContent(getSeleniumdriver());
//            browserActions.switchToFrame(getSeleniumdriver(), getSmbFundingPageModel().frameCardZip);
//            browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().zipCode);
//            browserActions.enterTextKeyEntry(getSeleniumdriver(), getSmbFundingPageModel().zipCode,funding.getZipCode());
//            Thread.sleep(2000);
//            browserActions.switchToDefaultContent(getSeleniumdriver());
//            browserActions.switchToFrame(getSeleniumdriver(), getSmbFundingPageModel().frameCardStreet);
//            browserActions.scrollToWebElement(getSeleniumdriver(), getSmbFundingPageModel().street);
//            browserActions.enterText(getSeleniumdriver(), getSmbFundingPageModel().street,funding.getStreetAddress());
//            browserActions.switchToDefaultContent(getSeleniumdriver());
//            Thread.sleep(2000);
//            browserActions.clickButton(getSeleniumdriver(), getSmbFundingPageModel().btnPay, 2000, 2000);
//            Thread.sleep(8000);
//            browserActions.clickApply(getSeleniumdriver().getWebDriver(), getSmbFundingPageModel().btnAuthContinueGuest);
//            Thread.sleep(2000);
//        }
//        log.info("Finished processing of Funding details");
//    }
//}
