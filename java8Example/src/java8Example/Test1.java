package java8Example;

public class Test1 {

	public static void main(String[] args) {
		
		double a = 12.135; double b = 10.46;
		
		MyfunInterface m = (x, x1) -> x+x1;
		double k = m.calculte(a, b);
		System.out.println(k);

	}

}
