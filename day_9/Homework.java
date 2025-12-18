
//You are working on a system that prints different types of messages based on the user's role. Each type of user (Admin and Guest) should display a different welcome message. You are asked to:
//
//Create an abstract class User with:
//
//An abstract method showMessage()
//
//A concrete method displayUserType() that prints "User type selected"
//
//Create two subclasses:
//
//AdminUser: prints "Welcome, Admin!" in showMessage()
//
//GuestUser: prints "Welcome, Guest!" in showMessage()
//
//In a class called UserTest, create objects of AdminUser and GuestUser, call both displayUserType() and showMessage() methods for each.


package java_work.day_9;

public class Homework {
	
	public static void main(String[] args) {
		AdminUser obj1=new AdminUser();
		GuestUser obj2=new GuestUser();
		obj1.showMessage();
		obj1.displayUserType();
		obj2.showMessage();
		obj2.displayUserType();
	}
}
abstract class User{
	abstract void showMessage();
	public void  displayUserType() {
		System.out.println("User  type selected");
	}
}
class AdminUser extends User{
	void showMessage() {
		System.out.println("Welcome, Admin!");
	}
}
class GuestUser extends User{
void showMessage() {
	System.out.println("Welcome, Guest!");
	}
}
