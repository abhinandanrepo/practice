package test.methodoverriding;

class Super {
	public static String foo = "foo";
}
class Sub extends Super {
	public static String foo = "Child";
	static {
		foo = "bar";
	}
//	Sub(){
//		foo = "Constructor";
//	}
}
public class Test2 {
	public static void main(String[] args) {
		System.out.println(Super.foo);
		System.out.println(Sub.foo);
//		System.out.println(new Sub().foo);
//		System.out.println(Sub.subVar);
		System.out.println(Super.foo);
	}
}
