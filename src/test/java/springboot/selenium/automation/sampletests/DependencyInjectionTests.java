package springboot.selenium.automation.sampletests;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springboot.selenium.automation.sampletestclasses.Employee;

@SpringBootTest
class DependencyInjectionTests {

	@Autowired
	private Employee employee;

	@Test
	public void contextLoads() {
		/**
		 * Without Spring boot, objects have to be injected manually through constructor
		@Test
		void contextLoads() {
			Address address = new Address();
			Salary salary = new Salary();
			Employee employee = new Employee(address,salary);
			employee.printDetails();
		}**/

	    /**
		 * Without Spring boot, objects have to be injected manually through setter methods
		 * Employee employee = new Employee();
		 * employee.setSalary(new Salary());
		 * employee.setAddress(new Address());
		 * employee.printDetails();
		 * **/

		//With Spring boot, object is injected automaticllay
		// As spring boot scans for the object and inject it with one line of code in this scenario
		employee.printDetails();
	}


}
