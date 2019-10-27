package POM;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import report.TestLogger;

public class SearchResult extends CommonAPI {
        public SearchResult() {
        }

        public void validateSearchPageDisplayed() {
            WebElement element = this.getElement("//*[@id='s-refinements']");
            Assert.assertEquals(element.isDisplayed(), true, "element isn't displayed");
            TestLogger.log("search result panel is displayed : " + element.isDisplayed());
        }
    }


