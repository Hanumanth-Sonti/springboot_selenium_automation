package springboot.selenium.automation.sampletests;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springboot.selenium.automation.sampletestclasses.Television;

@SpringBootTest
public class TestBeanLifyCycle {

    @Autowired
    Television tv;

    @Test
    public void testTVDisplay(){
        tv.playingScene();
    }
}

