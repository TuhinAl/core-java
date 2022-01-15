package subUser;

public class Nurse {
	
	private Integer nurseId;
	public Patient patient;
	
	public void nurseInfos() {
		System.out.println(" Nusrse Info from SUBUSER package");
	}


	public Integer getNurseId() {
		return nurseId;
	}


	public Patient getPatient() {
		return patient;
	}


	public void setPatient(Patient patient) {
		this.patient = patient;
	}



	public void setNurseId(Integer nurseId) {
		this.nurseId = nurseId;
	}
	
	
	
	

}
