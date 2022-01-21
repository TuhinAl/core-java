package inheritance;

public class Staff extends User{
	
	private long staffId;
	long staffLoginInfo;
	 boolean status;
	 

	private void staffDutyHour() {
		System.out.println("Staff duty hour from Inheritance package");
	}
	
	 public void postAReview() {
		 System.out.println("posted a review :: Staff Class");
	 }
	 
	 public void printUserType() {
		 System.out.println("Staff: printUserType");
	 }
	 
  


	public long getStaffId() {
		return staffId;
	}

	public void setStaffId(long staffId) {
		this.staffId = staffId;
	}

	public long getStaffLoginInfo() {
		return staffLoginInfo;
	}

	public void setStaffLoginInfo(long staffLoginInfo) {
		this.staffLoginInfo = staffLoginInfo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	

}
