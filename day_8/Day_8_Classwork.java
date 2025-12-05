//You are tasked with developing a simple software for a zoo to demonstrate animal behaviors. The zoo has different types of animals, each with unique sounds and movements. Complete the following tasks:
//
//Tasks:
//
//Create an interface named Animal with two methods: makeSound() and move(), both returning no value (void).
//Create a class named Bird that implements the Animal interface. The makeSound() method should print "Chirp", and the move() method should print "Fly".
//Create a class named Dog that implements the Animal interface. The makeSound() method should print "Bark", and the move() method should print "Run".
//Create a class named Zoo with a main() method. In the main() method, create objects of Bird and Dog, and call their makeSound() and move() methods to display their behaviors.
package java_work.day_8;

public class Day_8_Classwork {
	public static void main(String[] args) {
		Bird b=new Bird();
		Dog d=new Dog();
		b.makeSound();
		b.move();
		d.makeSound();
		d.move();
	}
}
	interface Animal{
		public void makeSound();
		public void move();
	}
	class Bird implements Animal{
		public void makeSound(){
			System.out.println("Chirp");
		}
		public void move() {
			System.out.println("Fly");
		}
	}
	class Dog implements Animal{
		public void makeSound(){
			System.out.println("Bark");
		}
		public void move() {
			System.out.println("Run");
		}
	}
		
	
