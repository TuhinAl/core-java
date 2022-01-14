package inheritance;

public class Maruti extends Car{

	// maruti inherit all  state and behavior Car except static and final 
	public void marutiStartDemo() {
		Engine marutiEngine = new Engine();
		marutiEngine.start();
	}
	
}
