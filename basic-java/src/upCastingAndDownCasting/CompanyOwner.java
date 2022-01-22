package upCastingAndDownCasting;

public class CompanyOwner {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		Executive executive = new Executive();
		Admin admin = new Admin();
		Worker worker = new Worker();
		String string;
		
		
		//UP Casting
		Employee originalEmployee = new Admin();
		
		//Down Casting 
		Employee em = new Admin();
		Admin ad = (Admin) em;
		
		Caller caller = new Caller();
		caller.call(employee);
		caller.call(admin);
		caller.call(worker);
		caller.call(executive);
		
	}

}
