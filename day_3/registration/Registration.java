package java_work.day_3.registration;
import java.util.Scanner;

public class Registration {
	public String name;  // variable to store name
    public int age;      // variable to store age
	public Registration() {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the First name");//taking name input
		name=input.next();
		System.out.println("Enter the Age");//taking age input
		age=input.nextInt();
}
}