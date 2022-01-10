package basic;

public class MethodOverload {
	
	
	void mehodOverloadPractice(int a, double d) {
		System.out.println("INT and Double");
	}
	void mehodOverloadPractice(int a, float d) {
		System.out.println("INT and FLOAT");
	}
	void mehodOverloadPractice(long a, int d) {
		System.out.println("LONG and INT");
	}
	void mehodOverloadPractice(int a, long d) {
		System.out.println("INT and LONG");
	}
	void mehodOverloadPractice(int a, int d) {
		System.out.println("INT and INT");
	}
	void mehodOverloadPractice(long a, long d) {
		System.out.println("LONG and LONG");
	}
	void mehodOverloadPractice(short a, double d) {
		System.out.println("SHORT and Double");
	}
	void mehodOverloadPractice(double d, int i) {
		System.out.println("DOUBLE and INT");
	}
	void mehodOverloadPractice( int i) {
		System.out.println("INT");
	}
	void mehodOverloadPractice( long i) {
		System.out.println("LONG");
	}
	void mehodOverloadPractice( double i) {
		System.out.println("DOUBLE");
	}
	void mehodOverloadPractice( float i) {
		System.out.println("FLOAT");
	}
	void mehodOverloadPractice(short i) {
		System.out.println("SHORT");
	}
	void mehodOverloadPractice(byte i) {
		System.out.println("BYTE");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverload methodOverload = new MethodOverload();
		byte b = 50;
		short s = 50;
		methodOverload.mehodOverloadPractice(s);

	}

}
