package springboot.selenium.automation.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import springboot.selenium.automation.testconfiguration.WebDriverFactory;

import javax.annotation.PostConstruct;

public abstract class Base {

    @Autowired
    protected WebDriver driver;
    //private WebDriverFactory driverFactory;

    @Autowired
    protected WebDriverWait wait;

    @PostConstruct
    private void init(){
        PageFactory.initElements(this.driver, this);
    }

    public abstract boolean isAt();

}
