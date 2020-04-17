package uk.co.expedia.pages;

import org.openqa.selenium.By;
import uk.co.expedia.utility.Utility;

/**
 * Created By Bhavesh
 */
public class HomePage  extends Utility {
    By acceptTab = By.xpath("//span[@class=\"button-text\"]");
    By accountTab = By.id("header-account-menu");
    By signInTab = By.id("header-account-signin-button");
    By flightsTab = By.xpath("//ul[contains(@class,'utility-nav nav-group cf')]//a[contains(text(),'Flights')]");

    public void clickOnAccountTab() {

        clickonElement(accountTab);

    }

    public void clickOnSignInTab() {

        clickonElement(signInTab);
    }

    public void clickOnFlightsTab() {

        clickonElement(flightsTab);
    }

    public void clickOnAcceptBtn() {

        clickonElement(acceptTab);

    }
}
