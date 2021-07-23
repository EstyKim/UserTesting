package decide;

import java.util.Scanner;

public class DoubleSplit {

	public static void main(String[] args) {
	
System.out.println("Welcome user... \n Please enter a digit number : ");
Scanner scan = new Scanner(System.in);
double value = scan.nextDouble();
String exist = String.valueOf(value);
var set = exist.indexOf(".");
var a = exist.substring(0, set);
var b = exist.substring(set + 1);
System.out.println(a);
System.out.println(b);

if(a.equals(b)) {
	System.out.println("identical");
}else {
	System.out.println(" not identical");
}


scan.close();
	}

}
