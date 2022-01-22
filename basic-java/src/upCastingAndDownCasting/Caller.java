package upCastingAndDownCasting;

public class Caller {
	
	public void call(Employee emploee) {
		emploee.come(emploee.getTeamName());
		emploee.teamName(emploee.getTeamName());
		System.out.println("\n");
	}

}
