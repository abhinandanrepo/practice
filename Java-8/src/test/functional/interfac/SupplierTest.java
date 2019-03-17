package test.functional.interfac;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		suppTest();
	}
	
	public static void suppTest() {
		Supplier<Integer> supplier = () -> {
			return 10;
		};
		
		System.out.println(supplier.get());
				
	}

}
