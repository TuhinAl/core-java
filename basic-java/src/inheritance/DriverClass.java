package inheritance;

public class DriverClass {
	
	public static void main(String[] args) {
		
		/* ======= up-casting example ======= */
		
		ClassOne classOne = new ClassTwo();
		classOne.commonClassOne();
//		classOne.commonClassOneA();
//		classOne.commonClassOneB();
		
		ClassOne classTwo = new ClassThree();
		
		classTwo.commonClassOne();
		classTwo.commonClassOneA();
		classTwo.commonClassOneB();
		
//		ClassThree classThree = new ClassTwo();
		
//		classTwo.commonClassOne();
//		classTwo.commonClassOneA();
//		classTwo.commonClassOneB();
//		classTwo.commonClassTwo();
//		classTwo.commonClassTwoA();
		
//		classTwo.commonClassOne();
		
		
		
	}

}
