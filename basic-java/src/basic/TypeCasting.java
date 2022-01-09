package basic;

public class TypeCasting {

	public static void main(String [] arguments) {
		// Two type cast rules
		//Implicit == smaller to larger == widening conversion[implicit casting done by compiler autometically]
		//explicit == larger to smaller == narrowing conversion
		
		// IMPLICIT CASTING EXAMPLE: byte ==> short ==> int ==> long ==> float ==> double
		// EXPLICIT CASTING EXAMPLE: byte <== short <== int <== long <== float <== double
		
		// widening and narrowing occer when byte to char, short to char
		
//		for example
		byte b = 65;
		char c = (char) b;
		
		char a = 'C';
		byte b2 = 'a';
		
		char c2 = 'T';
		short s = (short)c2;
		
		// INFORMATION LOST IN EXPLICIT CASTING (out-of-range assignment, truncate (float to int))
	}
	
}
