package java8Example;

@FunctionalInterface
public interface MyfunctionalInterface {

	int calculate (int x, int y);
	
	
	default void m1() {
		System.out.println("default method");
	}
	
	public static void m2() {
		System.out.println("Static mehtod");
	}
	
}
