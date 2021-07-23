package decide;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class DayCount {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
System.out.println("Please enter your birthday e.g 1996-08-09 : ");
Scanner scan = new Scanner(System.in);
String birthday = scan.nextLine();
Date birthdate;
birthdate = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
var timedate = birthdate.getTime();
var timer = new Date().getTime();
var day = (timer - timedate)/1000/3600/24;
System.out.println("Your number of days lived on earth are : " + day);

scan.close();
	}

}
