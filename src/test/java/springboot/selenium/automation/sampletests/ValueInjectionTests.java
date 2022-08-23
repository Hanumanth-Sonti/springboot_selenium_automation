package springboot.selenium.automation.sampletests;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import springboot.selenium.automation.sampletestclasses.Employee;

import java.util.List;

@SpringBootTest
public class ValueInjectionTests {
    //Access System properties
    @Value("${PATH}")
    public String path;

    //Get Default value if property does not exist
    @Value("${Test_Url:http://www.google.com}")
    public String testURL;

    //Access environment properties
    @Value("${username}")
    public String username;

    @Value("${browserNames}")
    public List<String> browsers;

    @Autowired
    Employee employee;

    @Test
    public void printSystemPath(){
        System.out.println("PATH: "+this.path);
    }

    @Test
    public void printProperties(){
        System.out.println("Username: "+this.username);
        System.out.println("List of Browsers: "+this.browsers);
        System.out.println("List Size: "+this.browsers.size());
        this.browsers.forEach(temp->System.out.println(temp));
    }

    @Test
    public void printDefaultValue(){
        System.out.println("Default URL: "+this.testURL);
    }

    @Test
    public void printAddress(){
        employee.printDetails();
    }
}
