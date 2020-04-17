package uk.co.expedia.pages;

import org.openqa.selenium.By;
import uk.co.expedia.utility.Utility;

/**
 * Created By Bhavesh
 */
public class AccountPage extends Utility {

    By accountLink = By.xpath("//button[@id='header-account-menu']");
    By signInTab = By.id("header-account-signin-button");

    public void clickOnAccountButton() {

        clickonElement(accountLink);
    }

    public void clickOnSignInTab() {

        clickonElement(signInTab);
    }
}
