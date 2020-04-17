package uk.co.expedia.pages;

import org.openqa.selenium.By;
import uk.co.expedia.utility.Utility;

/**
 * Created By Bhavesh
 */
public class SignInPage extends Utility {

    By emailIDField = By.xpath("//label[contains(@class,'text')]//input[contains(@name,'signin-loginid')]");
    By passwordField = By.xpath("//fieldset[contains(@class,'no-padding')]//input[contains(@class,'clear-btn-input')]");
    By signInBtn = By.id("gss-signin-submit");
    By errorMessage = By.id("gss-signin-incorrect-email-or-password");


    public void enterEmailID(String email) {
        sendTextToElement(emailIDField, email);
    }

    public void enterPassword(String password) {

        sendTextToElement(passwordField, password);
    }

    public void clickOnSignInBtn() {

        clickonElement(signInBtn);
    }

    public String loginErrorMessage() {

        return getTextFromElement(errorMessage);
    }
}
