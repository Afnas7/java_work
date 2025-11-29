//You are creating a simple login check for a training portal. 
//The program will allow users to enter a username and password and check them against the default credentials (username: "admin", password: "java123")
//Write a Java program that checks the entered values (hardcoded for now) and prints:
//"Login Successful" if both username and password match.
//"Access Denied" if either the username or the password is incorrect.



package java_work.day_4;
import java.util.*;
public class Day_4_Classwork {
	
	public static void main(String[] args) {

		Scanner input =new Scanner(System.in);
		System.out.println("Enter the username");
		String username=input.nextLine();
		System.out.println("Enter the Password");
		String password=input.nextLine();
		if (username.equals("admin") && password.equals("java123")) {
			System.out.println("Login Successfull");
		}
		else {
			System.out.println("Access Denied");
		}
	}
	
}
