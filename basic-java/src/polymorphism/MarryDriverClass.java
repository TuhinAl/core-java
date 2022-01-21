package polymorphism;

public class MarryDriverClass {
	public static void main(String[] args) {
		Marry marry = new Marry();
		marry.engageDate();
		marry.marryDate();
		
		ChangeMarry changeMarry = new ChangeMarry();
		changeMarry.engageDate();
		changeMarry.marryDate();// this is how runtime polymorphism does work!
	}
	

}
