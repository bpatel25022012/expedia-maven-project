package uk.co.expedia.testsuit;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import uk.co.expedia.pages.FlightsPage;
import uk.co.expedia.pages.HomePage;
import uk.co.expedia.testbase.TestBase;
import uk.co.expedia.utility.Utility;

import static uk.co.expedia.utility.Utility.getRandomString;

/**
 * Created By Bhavesh
 */
public class FlightTest extends TestBase {

    String flyingFrom = null;
    String flyingTo = null;
    HomePage homePage = new HomePage();
    FlightsPage flightsPage = new FlightsPage();

    @BeforeTest(groups = {"regression", "sanity", "smoke"})
    public void setUp() {
        flyingFrom = "Auckland";
        flyingTo = "Ahmedabad";
    }

    @Test(priority = 0, groups = {"sanity"})

    public void verifyUserShouldSearchFlights() {
        SoftAssert sa = new SoftAssert();
        homePage.clickOnAcceptBtn();
        homePage.clickOnFlightsTab();
        flightsPage.clickOnFlyingFromField();
        flightsPage.enterFlyingFrom(flyingFrom);
        flightsPage.clickOnGoingToField();
        flightsPage.enterGoingTo(flyingTo);
        flightsPage.enterDepartingDate("20/10/2020");
        flightsPage.clearReturnDate();
        flightsPage.enterReturningDate("1/11/2020");
        flightsPage.clickOnTravellers();
        flightsPage.clickOnAdults();
        flightsPage.clickOnClose();
        flightsPage.clickOnSearchButton();
        flightsPage.getDestinationText();
        sa.assertTrue(flightsPage.verifyBodyContainsDestinationName().contains(flyingTo));

    }
}
