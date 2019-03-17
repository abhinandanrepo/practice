package test.map.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import test.model.Employee;

public class FlatmapTest {
	
	static List<Employee> empList = Arrays.asList(
			new Employee("Tom Jones", 45, 7000.00, Arrays.asList("1")),
			new Employee("Harry Major", 25, 10000.00,Arrays.asList("1","2")), 
			new Employee("Ethan Hardy", 65, 8000.00,Arrays.asList("1","3","4")),
			new Employee("Nancy Smith", 22, 12000.00,Arrays.asList("1","2","5")),
			new Employee("Deborah Sprightly", 29, 9000.00,Arrays.asList("1","3","4"))
			);
	
	

	public static void main(String[] args) {

		
	}

}
