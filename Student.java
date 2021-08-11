package average;
import java.util.Scanner;
import java.util.LinkedList;

public class Student{
private String name;
private String email;
private String studentId;
private int grade;
private int age;
private long mobileNumber;
private String gender;

public Student() {
}
public Student(String studentId) {
	this.studentId = studentId;
}
//Constructor to ensure a student's details don't change
public Student(String name, String email, String studentId, int grade, int age, long mobileNumber, String gender) {
	this.studentId = studentId;
	this.email = email;
	this.name = name;
	this.grade =grade;
	this.age = age;
	this.mobileNumber = mobileNumber;
	this.gender = gender;
	}
//getter and setter methods to use and update student information, except the name and ID number.
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getStudentId() {
	return studentId;
}
public  int getGrades() {
	return grade;
}
//use of the setter method when upgrading the grade of the student
public void setGrades(int grade) {
	this.grade = grade;
}
public long getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(long mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}

//method to add student information to a LinkedList.
public static void printStudentInfo() {
	LinkedList<Student> studentInfo = new LinkedList<>();
	studentInfo.add(new Student("Kendal", "k@gmail.com", "7823401", 12, 18, 075426476, "female"));
	studentInfo.add(new Student("Clovis", "c@gmail.com", "2423751", 8, 14, 075426476, "male"));
	studentInfo.add(new Student("Maya", "m@gmail.com", "5623321", 10, 16, 075426476, "female"));
	studentInfo.add(new Student("Linus", "l@gmail.com", "8023981", 7, 15, 075426476, "male"));
	studentInfo.add(new Student("Joseph", "j@gmail.com", "8923451", 9, 17, 075426476, "male"));
	studentInfo.add(new Student("Thelma", "t@gmail.com", "1323771", 10, 18, 075426476, "female"));
	
	//Prompt user to enter their ID number to print details
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter your ID number :");
	String validate = scan.nextLine();
	//Iterate through the list with a for each loop
	for(Student details : studentInfo) {
		if(details.getStudentId().equals(validate)) {
			System.out.println("Name : " + details.getName() + "\n" + "Age : " + details.getAge() +"\n" + "Student ID Number : " + details.getStudentId() + "\n" + "Email Address : " +  details.getEmail() + "\n" + "Gender : " + details.getGender() + "\n" + "Phone Number : " + details.getMobileNumber() +"\n" + "Grade : " + details.getGrades());
		}
		
	}
	scan.close();
	}
public static LinkedList<Student> addNewStudent() {
	LinkedList<Student> studentInfo = new LinkedList<>();
	Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name : ");
	String newName = scan.nextLine();
	System.out.println("Please enter your Email : ");
	String newEmail = scan.nextLine();
	System.out.println("Please enter your Id : ");
	String newID = scan.nextLine();
	System.out.println("Please enter your Grade : ");
	int newGrade = scan.nextInt();
	System.out.println("Please enter your Age : ");
	int newAge = scan.nextInt();
	System.out.println("Please enter your Mobile Number : ");
	long newMobileNumber = scan.nextLong();
	System.out.println("Please enter your Gender : ");
	String newGender = scan.next();
	
	studentInfo.add(new Student(newName, newEmail, newID, newGrade, newAge, newMobileNumber,newGender));
	
	for(Student newer : studentInfo) {
		if(newer.getStudentId() == newID) {
			System.out.println("This student already exists. Please enter a new ID Number");
		}
		else {
	
		System.out.println("Name : " + newName + "\n" + "Email : " + newEmail + "\n" + "Age : " + newAge + "\n" + "ID Number : " + newID + "\n" + "Grade : " + newGrade + "\n" + "Mobile Number :" + newMobileNumber + "\n" + "Gender : " + newGender);
		}
		scan.close();
	}
	return studentInfo;
}
public static void findStudentWithHighestGrade() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter your grade : ");
	int grader = scan.nextInt();
	if(grader == 12) {
System.out.println("Student with the highest grade : " );
printStudentInfo();
	}
	else {
		System.out.println("Student is in a lower grade");
	}
	scan.close();
}
public static void findStudentById(String studentId) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter your ID Number : ");
	String checkId = scan.nextLine();
	if(studentId.equals(checkId)) {
		printStudentInfo();
	}
	scan.close();
}


	
}
