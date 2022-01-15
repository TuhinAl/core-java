package subUser;

import inheritance.Staff;

public class Doctor extends Staff{

	private Integer doctorId;
	public Patient patient;
	
	
	
	public Doctor(Integer doctorId, Patient patient) {
		this.doctorId = doctorId;
		this.patient = patient;
	}


	private void doctorName() {
		System.out.println("Dr Name is Mr Doctor from SUBUSER Package");
	}


	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}


	public void setPatient(Patient patient) {
		this.patient = patient;
	}


	public Integer getDoctorId() {
		return doctorId;
	}


	public Patient getPatient() {
		return patient;
	}
	
	
	
	
}
