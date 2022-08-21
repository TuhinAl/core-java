package exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exception Demo...");
		share();
		System.out.println("\n End of main...");

	}
	
	private static void share() {
		System.out.println("\nInside share...");
		HttpConnect.send(0, "hello", "https://www.goodsnips.com");
		System.out.println("\n End of Share");
	}

}
