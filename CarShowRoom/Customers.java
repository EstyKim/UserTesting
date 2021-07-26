package contain;
import java.util.Scanner;

public class Customers {
	String name;
	String invitationLetter;
	
	public static void inquire() {
		System.out.println("Inquiry about sales product");
		
	}
	public  void buy() {
		System.out.println("item sold!");
	}
	public static Object buyCar() {
		Object buyer;
		Car x = new Car();
		buyer = x;
		System.out.println("Would you like to leave a review? YES \nNO : ");
		Scanner scan = new Scanner(System.in);
		String response = scan.nextLine();
		scan.close();
	if(response.equals("YES")) {
		System.out.println("Thank you for your Business");
		}
	else {
		System.out.println("Hope to see you another time");
	}
	return buyer;
}
	}
