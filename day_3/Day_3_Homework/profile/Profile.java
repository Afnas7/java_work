package java_work.day_3.Day_3_Homework.profile;
import java.util.Scanner;
public class Profile {
	public String name;
	public  Profile() {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the name");
		name=input.nextLine();
	}
}
