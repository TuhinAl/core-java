package inheritance;

import java.util.Date;

public class User {
	
	public String firstName;
	private String lastName;
	protected String email;
	 Integer age;
	 
	 
	 //static block
	 
	 static {
		 System.out.println("Static block!!");
	 }
	 
	 
	 //instance block
	 {
		 System.out.println("instance Block!");
	 }
	 

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
	  
	  
	  
	  ////from udemy Dheru Monduluru course
	  
	  public void saveWebLink() {
		  System.out.println("Weblink saved::USER");
	  }
	  
	  public void saveMovie() {
		  System.out.println("saved movie::USER");
	  }
	  
	  public void saveBook() {
		  System.out.println("USER::saved book::USER");
	  }
	  
	  public void rateBookmark() {
		  System.out.println("USER::Rated Bookmark");
	  }
	  
	  public void postAReview() {
		  System.out.println("USER::posted a review");
	  }
	  
	  public void printUserType() {
			 System.out.println("USER::printUserType");
		 }
		 
	  
	  
	  
	  

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	  
	  

}
