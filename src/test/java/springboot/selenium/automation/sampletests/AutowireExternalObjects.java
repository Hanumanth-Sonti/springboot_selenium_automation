package springboot.selenium.automation.sampletests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AutowireExternalObjects{

    @Autowired
    private Faker faker;

    @Test
    public void getFakeUserDetails(){
        System.out.println(faker.name().firstName());
        System.out.println(faker.name().lastName());
        System.out.println(faker.address().city());
    }
}
