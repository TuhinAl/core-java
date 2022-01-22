package methodOverride;

public class ClassTwo extends ClassOne{

@Override
public ClassFour postReview(String post) {
		
		ClassFour classFour = new ClassFour();
		ClassThree classThree = (ClassThree) classFour;  
		
		classThree.printPost(post);		
		
		return classFour;
		
		// public, protected, default, private
		
}

}
