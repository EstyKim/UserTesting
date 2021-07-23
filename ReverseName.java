package decide;
import java.util.Scanner;
public class ReverseName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("Please Enter your name : ");
var name = scan.nextLine();
var over = "";
for(int i = name.length()-1; i >=0; i--) {
	over = over + name.charAt(i);
}
System.out.println("Your reversed name is : " + over);
scan.close();
	}

}
