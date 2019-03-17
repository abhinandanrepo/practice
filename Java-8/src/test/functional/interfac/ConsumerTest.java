package test.functional.interfac;

import java.util.function.DoubleConsumer;

public class ConsumerTest {

	public static void main(String[] args) {
		doubleConsumer(20.0);
	}

	public static void doubleConsumer(final double valueToBeAdded) {
		DoubleConsumer doubleConsumer =  d -> {
			// Values to be used inside lambda expression must be final or effective final
			System.out.println(d + valueToBeAdded);
		};
		
		doubleConsumer.accept(10.8);
	}
}
