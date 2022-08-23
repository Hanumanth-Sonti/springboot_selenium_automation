package springboot.selenium.automation.sampletestclasses;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Salary {

    @Value("${Amount:500}")
    private int amount;

    /*public Salary(){
        this.amount = 1000;
    }*/

    public int getAmount(){
        return amount;
    }
}
