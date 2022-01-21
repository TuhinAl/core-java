package polymorphism;

public class PolymorphismDriverClass {
	public static void main(String[] args) {
		
		User user = new Engineer();
		Engineer engineer = new Engineer();
		
		User user2 = new JavaMan();
		user.namePrint();
		engineer.testCasting(engineer);
		
//		Engineer engineer = new User(); // not possible

	}
}
