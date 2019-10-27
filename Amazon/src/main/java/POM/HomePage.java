package POM;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import report.TestLogger;

public class HomePage extends CommonAPI {
    public HomePage() {
    }

    public void clickOnSearchBar() {
        this.clickOnElementByXpath("//input[@id='twotabsearchtextbox']");
        this.sleepFor(3);
        TestLogger.log("SearchResult Box clickable");
    }

    public void typeOnSearchBox(String value) {
        this.typeOnElementByXpath("//input[@id='twotabsearchtextbox']", "macbook laptop");
        this.sleepFor(3);
        TestLogger.log(value + "typed on search bar");
    }

    public void clickOnSearchButton() {
        this.clickOnElementByXpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']");
        this.sleepFor(3);
        TestLogger.log("search button clicked");
    }

    public void testDropDown() {
        Select select = new Select(driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")));
        select.selectByIndex(1);
        this.sleepFor(5);
        TestLogger.log("dropdown drops");
    }

    public void clickOnAccount() {
        this.clickOnElementByXpath("//span[@class='nav-line-2 nav-long-width']");
        this.clickOnElementByXpath("//a[@class='nav-a']");
        this.typeOnElementByXpath("//input[@id='ap_customer_name']", "fake username");
        this.typeOnElementByXpath("//input[@id='ap_email']", "fakeemail@whatever.com");
        this.typeOnElementByXpath("//input[@id='ap_password']", "fakepassword");
        this.typeOnElementByXpath("//input[@id='ap_password_check']", "fakepassword");
        this.clickOnElementByXpath("//input[@id='continue']");
        this.sleepFor(10);
        TestLogger.log("Register Works");
    }

    public void clickOnBestSeller() {
        this.clickOnElementByXpath("//a[contains(text(),'Best Sellers')]");
        this.clickOnElementByXpath("//div[contains(text(),'PlayStation Store Gift Card Variation Parent')]");
        this.clickOnElementByXpath("//input[@id='add-to-cart-button']");
        this.clickOnElementById("//a[@id='hlb-view-cart-announce']");
        this.clickOnElementByXpath("//input[@name='submit.delete.C154a983e-23a9-4976-9c55-ec40df2aef04']");
        this.sleepFor(10);
        TestLogger.log("Searchable searched");
    }
}

