package contain;

public class Vehicle {
	public String colour;
	public long yearMade;
	public double price;
	public String model;
	
	
	//variables to be kept from changing
	private String enginePos = "Bunnet";
	private String steeringPos = "Driver Seat";
	private String tyrePos = "Below Shocks";
	
	//Getter methods to access the positions as read-only.
	public String getEnginePos() {
		return enginePos;
	}
	public String getSteeringPos() {
		return steeringPos;
	}
	public String getTyrePos() {
		return tyrePos;
	}
	
	//behaviors of all vehicles.
 void transport() {
	System.out.println("Transportation");
}
 void navigate() {
	System.out.println("Navigating");
}
 void speed() {
	System.out.println("All cars can Speed");
}

}
