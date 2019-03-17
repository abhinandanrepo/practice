package test.methodoverriding;

class Parent{
	public static int x = 10;
}

public class TestStaticVariableInheritance extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(x);
		x = 11;
		System.out.println(x);
		System.out.println(TestStaticVariableInheritance.x);
	}

}
