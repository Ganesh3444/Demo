package java8Supplier;

import java.util.function.Supplier;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {

	public static final Logger LOGGER = LogManager.getLogger(Test.class);
	
	public static Employee getEmployee() {
		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("ganesh");
		return emp;
	}
	
	public static void main(String[] args) {
		

		
		Supplier<Double> supplier = () -> Math.random();
		LOGGER.info(supplier.get());
		
		Supplier<Employee> supplier2 = () -> Test.getEmployee();
		LOGGER.info(supplier2.get());

	}

}
