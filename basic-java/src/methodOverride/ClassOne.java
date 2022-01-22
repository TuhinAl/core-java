package methodOverride;

public class ClassOne {
	
	
	public ClassFour postReview(String post) {
		
		ClassFour classFour = new ClassFour();
		classFour.printPost(post);		
		return classFour;
		
	}

}
