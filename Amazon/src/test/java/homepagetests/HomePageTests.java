package homepagetests;

import POM.HomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTests extends CommonAPI {
    HomePage homePage;

    public HomePageTests() {
    }

    @BeforeMethod
    public void setPageFactory() {
        this.homePage = (HomePage) PageFactory.initElements(driver,HomePage.class);
    }

    @Test
    public void testSearchBar() {
        this.homePage.typeOnSearchBox("macbook laptop");
    }

    @Test
    public void testSearchButton() {
        this.homePage.clickOnSearchButton();
    }

    public void testDropDown() {
        this.homePage.testDropDown();
    }

    public void testAccount() {
        this.homePage.clickOnAccount();
    }

    @Test
    public void testBestSeller() {
        this.homePage.clickOnBestSeller();
    }
}


