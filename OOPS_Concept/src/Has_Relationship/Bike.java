package Has_Relationship;

public class Bike {
	 private String color; 
	 private int maxSpeed;
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
	public void bikeInfo(){
		System.out.println("Bike Color="+color+" Max Speed="+maxSpeed);
	}

}
