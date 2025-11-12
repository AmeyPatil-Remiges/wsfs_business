package com.cztffa.page.product;

import com.cztffa.objects.Person;
import com.cztffa.page.base.SmbBasePage;

import lombok.extern.slf4j.Slf4j;

@Slf4j

public class SmbProductSelectorPage extends SmbBasePage {
    public void fillDetails(Person person) throws InterruptedException {
        waitForSpinnerToDisappear();
        wait(getSmbGettingStartedPageModel().firstName);
//		Thread.sleep(1000);
        log.info("Entering first name");

        browserActions.enterText(getSeleniumdriver(), getSmbGettingStartedPageModel().firstName, person.getFirstName());
        log.info("Entering last name");
        browserActions.enterText(getSeleniumdriver(), getSmbGettingStartedPageModel().lastName, person.getLastName());
        log.info("Entering phone number");
        browserActions.scrollToWebElement(getSeleniumdriver(), getSmbGettingStartedPageModel().phoneNumber);
        browserActions.enterText(getSeleniumdriver(), getSmbGettingStartedPageModel().phoneNumber, person.getPhoneNumber());
        log.info("Entering email");
        browserActions.scrollToWebElement(getSeleniumdriver(), getSmbGettingStartedPageModel().personalEmail);
        browserActions.enterText(getSeleniumdriver(), getSmbGettingStartedPageModel().personalEmail, person.getEmail());
        log.info("Accepting policy");
        browserActions.clickButton(getSeleniumdriver(), getSmbGettingStartedPageModel().acceptPolicy);


    }

}
