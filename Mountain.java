package graphic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mountain {
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	int check = 0;
	
	public static void main(String args[]) {
		Mountain x = new Mountain();
		x.findLength();
	}
	
	
	public   List<Integer> findLength() {
 List<Integer> userInputs = new ArrayList<Integer>();
Scanner scan = new Scanner(System.in);

System.out.println("how many values will you like to save?");
int arrayLength = scan.nextInt();

//for loop to store the input values of the user.
for(int i = 1; i < arrayLength; ++i) {
System.out.println("Please enter your values");
  check = scan.nextInt();
 
  //condition to test if input is a valid integer value.
if(check < max && check > min) {
	userInputs.add(check);
}
//checking the highest and lowest values of the user's inputs.
if(check > max) {
	 max = check;
}
if(check < min) {
	min = check;
} 

}
//Printing out the maximum and minimum values.
System.out.println("Your Highest value is " + max);
System.out.println();
System.out.println("Your lowest value is " + min);
System.out.println();
//Printing the difference between the highest and lowest values.
System.out.println("Your average value is " + (max-min));
System.out.println();

//check if two input values are the same or not.
if(userInputs.contains(check)) {
		System.out.println("We have a table Mountain");
}
else {
	System.out.println("No Mountain here");
}
scan.close();
return userInputs;	
}
}