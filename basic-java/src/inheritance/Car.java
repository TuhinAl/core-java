package inheritance;

public class Car {
	
	private String color;
	private int maxSpeed;
	
	public void carInfo() {
	System.out.println("Color is "+color +" and speed is "+maxSpeed);	
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	

}
