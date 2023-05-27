package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class P01_HomePage {

    //TODo define locator
    private final By closeLocator = new By.ByXPath("(//span)[@class='i9dqh6z dir dir-ltr']");
    private final By anyWhereLocator = new By.ByXPath("//div[normalize-space()='Anywhere']");

    private final By whereLocator = new By.ByXPath("(//input)[@name='query']");

    private final By checkInDateLocator = new By.ByXPath("(//div[@data-is-day-blocked='false'])[8]");
    private final By checkoutOutDateLocator = new By.ByXPath("(//div[@data-is-day-blocked=\"false\"])[15]");
    private final By whoLocator = new By.ByXPath("//div[text()='Who']");
    private final By increaseButton = new By.ByXPath("(//button[@type=\"button\" and @aria-label=\"increase value\"])");
    private final By searchLocator = new By.ByCssSelector(".t1l18xbv.dir.dir-ltr");
    //private static String startDate,endDate;

    //ToDo define Driver
    public WebDriver driver;

    //ToDo define Constructor
    public P01_HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void insertCountryMethod() throws InterruptedException {

        driver.findElement(this.closeLocator).click();
        driver.findElement(this.anyWhereLocator).click();
        driver.findElement(this.whereLocator).click();
        driver.findElement(this.whereLocator).sendKeys("Rome");
        Thread.sleep(2000);
        driver.findElement(this.whereLocator).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(this.whereLocator).sendKeys(Keys.ENTER);


    }

    public void selectCheckDate() throws InterruptedException {
        driver.findElement(this.checkInDateLocator).click();
        Thread.sleep(2000);
        driver.findElement(this.checkoutOutDateLocator).click();
        Thread.sleep(3000);
        driver.findElement(this.whoLocator).click();
        driver.findElements(this.increaseButton).get(0).click();
        driver.findElements(this.increaseButton).get(0).click();
        driver.findElements(this.increaseButton).get(1).click();
        driver.findElement(this.whoLocator).click();
        Thread.sleep(2000);
        driver.findElement(this.searchLocator).click();

        Thread.sleep(6000);
    }
ir
    public boolean verifySearchCriteria() {
        if (driver.findElement(By.cssSelector("body > div:nth-child(8) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > header:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > button:nth-child(6) > div:nth-child(2)")).getText().equals("3 guests"))
            return true;
        else
            return false;
    }


}
