package inheritance;

public class UserTest {
	public void printUserType(User user) {
		user.printUserType();
	}
	
	public void approvedReview(Staff staff) {
		((Editor)staff).approvedReview();
	 }
	 
 
	public static void main(String[] args) {
		
		User user = new User();
		User editor = new Editor();
		User staff = new Staff();
		
		
		UserTest userTest = new UserTest();
		
		/*
		 * userTest.printUserType(user); userTest.printUserType(editor);
		 * userTest.printUserType(staff);
		 */
		
		editor.postAReview();
		editor.printUserType();
		editor.saveBook();
		editor.rateBookmark();
		editor.saveMovie();
		editor.saveWebLink();

	}

}
