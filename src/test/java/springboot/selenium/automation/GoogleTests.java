package springboot.selenium.automation;

import com.google.common.util.concurrent.Uninterruptibles;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import springboot.selenium.automation.google.GooglePage;
import springboot.selenium.automation.testconfiguration.ScreenshotService;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@SpringBootTest
public class GoogleTests extends SpringBaseTest
{
    @Autowired
    private GooglePage googlePage;

    @Autowired
    private ScreenshotService screenshotService;

    SoftAssert softAssert = new SoftAssert();

    @Test(description = "Launch Google")
    public void LaunchGoogleTest() throws IOException {
        //extentTest = extentReports.createTest("Launch Google", "Unable to launch Google");
        try{
            //Launch Google
            this.googlePage.goTo();
            boolean isGoogleLaunched = this.googlePage.isAt();
            Assert.assertTrue(isGoogleLaunched);
          /*  if (isGoogleLaunched) {
                extentTest.log(Status.PASS, "Launched Google");
            } else {
                extentTest.log(Status.FAIL, "Unable to launch Google");
            }
*/
            Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
            this.screenshotService.takeScreenShot();
        }catch(Exception e){
            e.printStackTrace();
            Assert.fail("Unable to Launch Google");
        }

    } // LaunchGoogleTest method

    @Test(description = "Search Google Keyword")
    public void searchGoogleTest() throws IOException {
        //extentTest = extentReports.createTest("Google Search", "Search a Keyword in Google");

        try{
            //Search for a keyword
            this.googlePage.getSearchComponent().search("environment");
            //extentTest.info("Searched Keyword");

            //Validate the Search Results
            boolean isSearchSuccess = this.googlePage.getSearchResult().isAt();
            softAssert.assertTrue(isSearchSuccess);
            /*if (!isSearchSuccess) {
                extentTest.log(Status.PASS, "Google Search is successful: " + isSearchSuccess);
            } else {
                extentTest.log(Status.FAIL, "Google Search is failed and returned: " + isSearchSuccess);
                softAssert.assertTrue(isSearchSuccess);
            }*/
            this.screenshotService.takeScreenShot();
            softAssert.assertAll();
        }catch(Exception e){
            e.printStackTrace();
        }

    } // searchGoogleTest method

    @Test(description = "Validate Search Result")
    public void validateGoogleSearchResultTest() throws IOException {
        //extentTest = extentReports.createTest("Validate Google Search",
              //  "Validate search in google returns more than 2 results");

        try{
            //Validate number of Searches successful
            boolean isCount = this.googlePage.getSearchResult().getCount() > 2;
            softAssert.assertTrue(isCount);
          /*  if (isCount){
                extentTest.log(Status.PASS, "Google Count is greater than 2: " + isCount);
            }else{
                extentTest.log(Status.FAIL, "Google Count is less than 2: " + isCount);
            }
           */
            this.screenshotService.takeScreenShot();
            softAssert.assertAll();
        }catch(Exception e){
            e.printStackTrace();
        }

    } // validateGoogleSearchResultTest
}
