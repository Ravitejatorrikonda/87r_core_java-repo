package Variables;

public class Example3 {
	
	public static int a;
	public static int b;
	
	public static void print(byte c, byte d) {
		System.out.println(a+b+c+d);//77
	}

	public static void main(String[] args) {
		byte b1=34;
		byte b2=43;
		print(b1,b2);

	}

}
