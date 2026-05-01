package Variables;

public class Example4 {
	public static int a = 20;
	public static int b = 30;
	
	public static void sum() {
		System.out.println(a+b);
	}
	public static void average() {
		sum();
		System.out.println((a+b)/2.0);
		
	}

	public static void main(String[] args) {

		average();
		
	}

}
