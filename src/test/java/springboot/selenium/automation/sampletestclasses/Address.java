package springboot.selenium.automation.sampletestclasses;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
   @Value("${Street}")
    public String street;

  /* public Address(){
       this.street ="123 Main St";
   }*/

   public String getStreet(){
       return street;
   }

}
