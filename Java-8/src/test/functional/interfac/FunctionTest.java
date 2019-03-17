package test.functional.interfac;

import java.util.function.DoubleFunction;
import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		andThenTest();
		doubleFunctionTest();
	}
	
	public static void doubleFunctionTest() {
		DoubleFunction<String> doubleFunction = d -> String.valueOf(d);
		System.out.println(doubleFunction.apply(100));
	}
	
	public static void andThenTest() {

		Function<String, Integer> f1 = s -> s.length();
		Function<Integer, String> f2 = i -> String.valueOf(i);
		// Will be called after the call of f1
		Function<String, String> andThen = f1.andThen(f2);

		System.out.println(andThen.apply("abc"));
	}

	public static void composeTest() {

		Function<String, Integer> f1 = (name) -> {
			return name.length();
		};

		Function<String, String> f2 = (String input) -> input.concat(" new function f2 ");

		f1.compose(f2);

		// Will be called before the call of f1
		Function<String, Integer> compose = f1.compose((String input) -> {
			return input.concat(" before functoin f1 ");
		});

		System.out.println(compose.apply("abc"));
	}

}
