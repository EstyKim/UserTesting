package contain;

public class Car extends Vehicle{
	public static void main(String args[]) {
		Vehicle external = new Car();
	Employees value = new Employees();
		external.colour = "black";
		external.model = "BMW";
		external.price = 1200.00;
		external.yearMade = 2017;
		
		external.transport();
        external.navigate();
        external.speed();
		external.getEnginePos();
		
		value.makeSale();
		Customers.buyCar();
		
		
	}
	//Implementation of an inherited class.
	public void transport() {
		System.out.println("Cars driving");
	}
	

}
