package springboot.selenium.automation.sampletestclasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    //Code to call constructor to inject variables - Technique 1
    /*public Employee(Address address,Salary salary){
        this.address = address;
        this.salary = salary;
    }*/

   /*
   Below code uses setter methods to inject variables - Technique2
    private Address address;
    private Salary salary;

   @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    @Autowired
    public void setSalary(Salary salary) {
        this.salary = salary;
    }**/

    /**
     * Field injection - Technique 3
     */

    @Autowired
    private Address address;

    @Autowired
    private Salary salary;

    public void printDetails(){
        System.out.println("Address: "+this.address.getStreet());
        System.out.println("Salary: "+this.salary.getAmount());
    }
}
