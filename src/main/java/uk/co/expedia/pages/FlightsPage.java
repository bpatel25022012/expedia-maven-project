package uk.co.expedia.pages;

import org.openqa.selenium.By;
import uk.co.expedia.utility.Utility;

/**
 * Created By Bhavesh
 */
public class FlightsPage extends Utility {

    By acceptTab = By.xpath("//span[@class=\"button-text\"]");
    By oneWayTab = By.xpath("//fieldset[@class='sub-nav-select']//div[2]//label[1]");
    By flyingFromField = By.xpath("//div[@class='col gcw-location-field']//label[@class='text icon-before autocomplete-arrow gcw-flights-from']//input[@placeholder='City or airport']");
    By goingFromAirport = By.xpath("//strong[contains(text(),'London (LHR - Heathrow)')]");
    By goingToField = By.xpath("//div[contains(@class,'col gcw-location-field')]//label[contains(@class,'text icon-before autocomplete-arrow gcw-flights-to')]//input[contains(@placeholder,'City or airport')]");
    By goingToAirport = By.xpath("//strong[contains(text(),'Ahmedabad (AMD - Sardar Vallabhbhai Patel Intl.)')]");
    By departing = By.xpath("//body/meso-native-marquee/section/div/div/div/section/div/div/div/section/form/fieldset/div/div[2]/div[1]/label[1]/input[1]");
    By returning = By.xpath("//body/meso-native-marquee/section/div/div/div/section/div/div/div/section/form/fieldset/div/div[3]/div[1]/label[1]/input[1]");
    By clearReturnDate = By.xpath("//body/meso-native-marquee/section/div/div/div/section/div/div/div/section/form/fieldset/div/div[3]/div[1]/label[1]/input[1]");
    By travellers = By.xpath("//body/meso-native-marquee/section/div/div/div/section/div/div/div/section/form/fieldset/div/div/div/div/ul/li/button[1]");
    By adultsTwo = By.xpath("//button[@class=\"uitk-step-input-button uitk-step-input-plus\"]");
    By close = By.xpath("//li[contains(@class,'open')]//button[contains(@class,'close btn-text')]");
    By searchButton = By.xpath("//div[9]//label[1]//button[1]");
    By getSameDestinationText = By.xpath("//span[@class=\"title-city-text\"]");

    public void clickOnAcceptBtn() {

        clickonElement(acceptTab);

    }

    public void clickOnFlyingFromField() {

        clickonElement(flyingFromField);

    }

    public void enterFlyingFrom(String flyingFrom) {

        sendTextToElement(flyingFromField, flyingFrom);
    }

    public void selectGoingFromAirport() {

        clickonElement(goingFromAirport);
    }

    public void clickOnGoingToField() {

        clickonElement(goingToField);
    }

    public void enterGoingTo(String goingTo) {

        sendTextToElement(goingToField, goingTo);
    }

    public void selectGoingToAirport() {

        clickonElement(goingToAirport);
    }

    public void enterDepartingDate(String departingDate) {

        sendTextToElement(departing, departingDate);
    }

    public void enterReturningDate(String returnDate) {

        sendTextToElement(returning, returnDate);
    }

    public void clearReturnDate() {
        clearTextFromField(clearReturnDate);
    }

    public void clickOnTravellers() {

        clickonElement(travellers);

    }

    public void clickOnAdults() {

        clickonElement(adultsTwo);
    }

    public void clickOnClose() {

        clickonElement(close);
    }

    public void clickOnSearchButton() {

        clickonElement(searchButton);
    }

    public String getDestinationText() {

        return getTextFromElement(getSameDestinationText);
    }

    public String verifyBodyContainsDestinationName(){
        String bodyText = driver.findElement(By.tagName("body")).getText();
        return bodyText;
    }

}
