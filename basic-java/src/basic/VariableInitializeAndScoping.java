package basic;

public class VariableInitializeAndScoping {
//	instance variable
//	can declare/assign
//	but cannot reassign
	
	
	int a;
//	a = 100;// error
	boolean b;
	String s;
	float f;
	double d;
	long l;
	char c;
	
	
	public static void main (String [] test) {
		
		VariableInitializeAndScoping object = new VariableInitializeAndScoping();
		int newValue = 10;
		newValue = 100;
		System.out.println("newValue: "+newValue);
		System.out.println("Initial value of int: " + object.a);
		System.out.println("Initial value of boolean: "+object.b);
		System.out.println("Initial value of String: "+object.a);
		System.out.println("Initial value of float: "+object.f);
		System.out.println("Initial value of double: "+object.d);
		System.out.println("Initial value of long: "+object.l);
		System.out.println("Initial value of char: "+object.c);
	}

}
