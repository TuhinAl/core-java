package subUser;

public class SubUserDriver {

	public static void main(String[] args) {
		Patient patient = new Patient(133);
		Doctor doctor = new Doctor(125, patient);
		String name = doctor.firstName;
	}

}
