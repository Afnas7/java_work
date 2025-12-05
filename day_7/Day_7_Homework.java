//You are helping a shopkeeper manage a small grocery store. The store sells five items: Rice, Sugar, Oil, Soap, and Milk. Each item has a fixed price. The shopkeeper wants a program that:
//Use the following data for items and prices:
//   Items: ["Rice", "Sugar", "Oil", "Soap", "Milk"]
//   Prices per unit (in Rs): [50, 40, 100, 25, 30]
//Shows a list of available items and asks the user to enter the quantity (in units) they want for each item.
//Calculates and displays the total cost.
//If the total cost is more than Rs.500, apply a 10% discount.
//Use a method to calculate the total and return the final amount after discount (if applicable).
//Display the current date and time of the purchase.
//Use try-catch to handle any input errors (like typing a string instead of a number).


package java_work.day_7;
import java.util.*;
import java.time.*;
import java.time.format.*;
public class Day_7_Homework {
	public static void main(String[] args) {
		String Items[]= {"Rice", "Sugar", "Oil", "Soap", "Milk"};
		int Price[]= {50,40,100,25,30};
		int quant[]=new int[5];
		System.out.println("Available items");
		for(String item : Items) {
			System.out.println(item);
		}
		System.out.println("enter the quantity (in units) they want for each item");
		Scanner in=new Scanner(System.in);
		
		try {
			int i=0;
			for(String item : Items) {
				System.out.println("Quantity of "+ item+"items");
				quant[i]=in.nextInt();
				i++;
			}
		}catch(Exception e){
			 System.out.println("❌ Invalid Input! Please enter only numbers.");
	            return; // stop the program
		}
		
		System.out.println("total cost"+cost(Price,quant));
		LocalDateTime curr= LocalDateTime.now();
		DateTimeFormatter fort = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println(curr.format(fort));
	}
	public static double cost(int price[],int quant[]) {
		double total=0;
		double dis=0;
		for(int i=0;i<price.length;i++) {
			total+=(price[i]*quant[i]);
		}
		if (total>500) {
			dis=(total*0.10);
			total=total-dis;
			System.out.println("discount appled :"+dis);
			return total;
			
		}
		else {
			return total;
		}
		
	}

}