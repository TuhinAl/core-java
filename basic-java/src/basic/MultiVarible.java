package basic;

public class MultiVarible {
	
//	Java 8 primitive type
	int i = 12;
	long l = 20;
	double d = 25.50;
	float f = 33.3333f;
	char c = 'T';
	boolean b = false;
	byte by = 8;
	short s= 6;
	
	
	String name;
	int age;
//	age = 110; // ERROR
	String email; // instance variable, have DEFAULT value, cannot reinitialize, but can declare and initialize
	double rating;
	
	
	void printf() {
		int age; // local variable, doesn't have default value, can reinitialize
//		age = 100;
		age = 150;
		System.out.println("Age: "+age);
	}
	
	public static void main(String [] args) {
		
		char a = 'A'; 		// unsigned 16 bit integer
		System.out.println("a");
		
		MultiVarible multiVarible = new MultiVarible();
		multiVarible.printf();
		
	}

}
