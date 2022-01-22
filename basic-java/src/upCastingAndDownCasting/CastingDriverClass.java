package upCastingAndDownCasting;

public class CastingDriverClass {
	public static void main(String[] args) {
		
		
		//in UPCASTING ==> we can access parent/superclass behavior (only method and constructor)
		//in DOWNCASTING ==> we can access child/subclass behavior
		//DownCasting Example
		ClassOne classOneCast = new ClassThree();
//		ClassThree classThree = (ClassThree) classOne;
		
		if(classOneCast instanceof ClassThree) {	
	
			ClassThree classThreeCast = (ClassThree) classOneCast;
			classThreeCast.commonClassOne();
			classThreeCast.commonClassOneA();
			classThreeCast.commonClassOneB();
			classThreeCast.commonClassThree();
			classThreeCast.commonClassThreeB();
			classThreeCast.commonClassThreeA();
			classThreeCast.commonClassTwo();
			classThreeCast.commonClassTwoA();
		}
		
		
	}

}
