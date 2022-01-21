package polymorphism;

public class Engineer extends User{
	
	public void namePrint() {
		System.out.println("Hey my name is Engineer!");
	}
	public void printRole() {
		System.out.println("Hey I am Role of Super Admin!");
	}
	
	public void testCasting(User user) {
		user.namePrint();
	}

}
