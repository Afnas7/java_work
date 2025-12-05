//You are tasked with developing a simple software for a small vehicle rental company to manage different types of vehicles. Each vehicle has basic behaviors (starting and stopping), and some vehicles require refueling. Complete the following tasks:
//
//Tasks:
//
//Create an interface named Vehicle with two methods: start() and stop(), both returning no value (void).
//Create an interface named FuelBased with a method refuel(), returning no value (void).
//Create a class named Car that implements both Vehicle and FuelBased interfaces. The start() method should print "Car engine started.", the stop() method should print "Car engine stopped.", and the refuel() method should print "Car is refueling at the station.".
//Create a class named ElectricScooter that implements only the Vehicle interface. The start() method should print "Electric scooter powered on.", and the stop() method should print "Electric scooter powered off.".
//Create a class named RentalSystem with a main() method. In the main() method, create objects of Car and ElectricScooter, and call their methods to simulate their real-world behaviors (e.g., start, refuel if applicable, stop).


package java_work.day_8;

public class Day_8_Homework {
	public static void main(String[] args) {
		Car C=new Car();
		ElectricScooter EV=new ElectricScooter();
		C.start();
		C.stop();
		C.refuel();
		EV.start();
		EV.stop();
	}
}
interface Vehicle{
	public void start();
	public void stop();
}
interface FuelBased{
	public void refuel();
}
class Car implements Vehicle,FuelBased{
	public void start(){
		System.out.println("Car engine started.");
	}
	public void stop() {
		System.out.println("Car engine stopped.");
	}
	public void refuel() {
		System.out.println("Car is refueling at the station.");
	}
}
class ElectricScooter implements Vehicle{
	public void start(){
		System.out.println("Electric scooter powered on.");
	}
	public void stop() {
		System.out.println("Electric scooter powered off.");
	}
}
