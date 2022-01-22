package upCastingAndDownCasting;

public class Employee {

	private String teamName = "Employee ";
	
	
	
	public String getTeamName() {
		return teamName;
	}


	public void come(String teamName) {
		System.out.println(teamName+": coming");
	}
	
	public void teamName(String teamName) {
		System.out.println("We are "+teamName);
	}
	
	
	
}
