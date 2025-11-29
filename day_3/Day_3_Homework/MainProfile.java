//Create a Java program that simulates a website’s user profile system. 
//The program should collect a user’s name in one module and display a greeting in another. 
//Create two user-defined packages: profile (to handle user input) and greeting (to display a greeting).
//Save the input code in profile/UserInput.java, the greeting code in greeting/GreetingDisplay.java, 
//and the main program in MainProfile.java (in the default package). Use clear comments to explain each step.

package java_work.day_3.Day_3_Homework;
import java_work.day_3.Day_3_Homework.profile.*;
import java_work.day_3.Day_3_Homework.greeting.*;
public class MainProfile {
	public static void main(String[] args) {
		Profile pobj=new Profile();
		Greeting gobj=new Greeting();
		
		gobj.greet(pobj.name);
	}
}
