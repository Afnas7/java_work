//You are tasked with developing a  ridesharing app  model how different vehicles calculate ride charges. All vehicles must display their ride type and calculate the fare based on a user-provided distance. Some vehicles, like autos, charge less, while cars charge more. Complete the following tasks:
//
//Tasks:
//
//Create an abstract class named Ride with:
//An abstract method calculateFare(int distance) that returns an integer (fare in ?).
//A concrete method rideType() that prints "Generic Ride".
//Create a subclass named AutoRide that extends Ride:
//Overrides calculateFare(int distance) to return ?10 per km.
//Overrides rideType() to print "Auto Ride".
//Create a subclass named CarRide that extends Ride:
//Overrides calculateFare(int distance) to return ?20 per km.
//Overrides rideType() to print "Car Ride".
//Create a class named BookingApp with a main() method that:
//Prompts the user to input the ride type ("auto" or "car").
//Prompts the user to input the distance in kilometers (a positive integer).
//Creates an object of AutoRide or CarRide based on the user’s ride type input.
//Calls rideType() and calculateFare() to display the ride type and total fare for the given distance.
package java_work.day_9;
import java.util.*;

public class Classwork {
	public static void main (String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the ride type");
		String Type=input.next();
		System.out.println("Enter the distance");
		int distance=input.nextInt();
		if (Type.equalsIgnoreCase("auto")) {
			Autoride ar=new Autoride();
			ar.rideType();
			int fare =ar.calcutateFare(distance);
			System.out.print("Fare is "+fare);
		}
		else if (Type.equalsIgnoreCase("car")) {
			Carride cr=new Carride();
			cr.rideType();
			int fare=cr.calcutateFare(distance);
			System.out.print("Fare is "+fare);
		}
	}
}
abstract class Ride{
	abstract int calcutateFare(int distance) ;
	public static void rideType() {
		System.out.print("Generic Ride");
	}
}
class Autoride extends Ride{
	int calcutateFare (int distance) {
		return distance*10;
	}
	public static void rideType() {
		System.out.print("Auto Ride");
}
}
class Carride extends Ride{
	int calcutateFare (int distance) {
		return distance*20;
	}
	public static void rideType() {
		System.out.print("Car Ride");
}
}
	
