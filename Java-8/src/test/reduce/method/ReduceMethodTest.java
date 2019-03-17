package test.reduce.method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import test.model.Employee;

public class ReduceMethodTest {

	static List<Employee> employeeList = Arrays.asList(new Employee("Tom Jones", 45, 7000.00),
			new Employee("Harry Major", 25, 10000.00), new Employee("Ethan Hardy", 65, 8000.00),
			new Employee("Nancy Smith", 22, 12000.00), new Employee("Deborah Sprightly", 29, 9000.00));

	public static void main(String[] args) {
		collectingDataInDiffCollection();
		StringBuffer a = new StringBuffer("A");
		StringBuffer b = new StringBuffer("B");
		operate(a, b);
		System.out.println(a + " ....... " + b);
		
		getSumFromListOfInt();
	}
	
	@SuppressWarnings("unchecked")
	private static void getSumFromListOfInt() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		int sum = list.stream().mapToInt(e -> e).sum();	
		System.out.println(sum);
		
		List<List<Integer>> list2 = new ArrayList<>();
		list2.add(list);
		
		
	}

	private static void operate(StringBuffer a, StringBuffer b) {

		a.append(b);
	}

//	public static void operate(StringBuffer a, Strin)

	public static void iterateList() {
		/*
		 * employeeList.forEach(e -> { System.out.println(e); });
		 */
		employeeList.stream().filter(e -> e.getAge() > 30).forEach(System.out::println);
	}

	public static void sumOfAllSalary() {
		Optional<Double> reduce = employeeList.stream().map(e -> e.getSalary()).reduce((x, y) -> x + y);
		System.out.println("Total salary is " + reduce.get());
	}

	public static void getMaxSalaryByReduce() {
		Optional<Employee> reduce = employeeList.stream().reduce((e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2);
		System.out.println("Employee with max salary.... " + reduce.get());
	}

	public static void getMaxSalaryByMapFunc() {
		OptionalDouble max = employeeList.stream().mapToDouble(e -> e.getSalary()).max();
		System.out.println("Max salary is " + max.getAsDouble());
	}

	public static void mmatchingTest() {
		boolean anyMatch = employeeList.stream().anyMatch(e -> e.getName().startsWith("Ha"));

		boolean allMatch = employeeList.stream().allMatch(e -> e.getSalary() > 7000);

		boolean noneMatch = employeeList.stream().noneMatch(e -> e.getAge() > 12);
	}

	public static void lazyEvaluationTest() {
		Optional<String> findFirst = employeeList.stream().parallel().filter(e -> e.getName().startsWith("Ha"))
				.filter(e -> e.getSalary() > 5000).map(ReduceMethodTest::printName).findAny();
		System.out.println(findFirst.get());
	}

	public static String printName(Employee emp) {
		System.out.println("Name is " + emp.getName() + " executed by thread " + Thread.currentThread().getName());
		return emp.getName();
	}

	public static void collectingDataInDiffCollection() {
		Map<Employee, String> collect = employeeList.stream().collect(Collectors.toMap(e -> e, e -> e.getName()));
		collect.forEach((k, v) -> System.out.println("key is " + k + " value is " + v));
	}
}
