package methodOverride;

public class MethodOverrideDriverClass {
	
	public static void main(String[] args) {
		
		String str = "Today is very beautiful day.";
		ClassTwo two = new ClassTwo();
		ClassOne one = new ClassOne();
		
		one.postReview(str);
		two.postReview(str);
	}

}
