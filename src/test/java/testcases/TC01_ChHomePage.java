package testcases;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import utility.Utilities;

public class TC01_ChHomePage extends TestBase {
    P01_HomePage homePage;
    @Test(priority = 1)
    public void chHomePage() throws InterruptedException {

        homePage=new P01_HomePage(driver);
        homePage.insertCountryMethod();
        homePage.selectCheckDate();
        Assert.assertTrue(homePage.verifySearchCriteria());
        Utilities.captureScreenshot(driver,"HomePage");
    }



}