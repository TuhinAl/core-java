package subUser;

public class Patient {

	private Integer patientId;
	
	
	public Patient(Integer patientId) {
		this.patientId = patientId;
	}

	protected void patientInfos() {
		System.out.println(" Patient info from SUBUSER package");
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public Integer getPatientId() {
		return patientId;
	}
	
}
