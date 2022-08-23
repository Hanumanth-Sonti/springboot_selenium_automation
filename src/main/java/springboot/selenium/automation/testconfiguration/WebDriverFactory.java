package springboot.selenium.automation.testconfiguration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.stereotype.Component;

@Component
public class WebDriverFactory {

    public WebDriver getDriver(String browser){
        if(browser.trim().equalsIgnoreCase("chrome")){
            return new ChromeDriver();
        }else{
            return new FirefoxDriver();
        }
    }
}
