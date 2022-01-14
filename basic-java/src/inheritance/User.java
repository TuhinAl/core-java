package inheritance;

import java.util.Date;

public class User {
	
	public String firstName;
	private String lastName;
	protected String email;
	 Integer age;
	 
	 public void birthday(int aget) {
		 System.out.println("Your birthay age is: "+(new Date().getDay() - age)+" from INHERITANCE package.");
	 }
	 
	 private void yourCantactNumberIs(String name) {
		 System.out.println("hey "+name +"its your contact number from INHERITANCE package.");
	 }
	 
	 protected void yourGender(int age) {
		 System.out.println("your protected gender:   from INHERITANCE package.");
	 }
	  void yourDefaultmethod(int age) {
		 System.out.println("your default package from INHERITANCE package.");
	 }

}
