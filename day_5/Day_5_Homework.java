//You are helping a store manager track the daily sales of 3 products for 5 days. Each product’s sales are recorded daily.
//Write a Java program that:
//Stores the sales data in a 2D array (5 rows for days and 3 columns for products).
//Calculates the total weekly sales for each product.
//Checks and prints a message for each product:
//If the total sales are more than or equal to 500, print "Target Achieved"
//If between 300 and 499, print "Average Performance"
//If less than 300, print "Needs Improvement"
//The output should display the total sales and the message for each product.
//

package java_work.day_5;

public class Day_5_Homework {
	public static void main(String[] args) {
		int row=5;
		int col=3;
		int sale[][] = {
	            {10, 80, 150},
	            {20, 70, 140},
	            {15, 60, 120},
	            {18, 50, 110},
	            {12, 65, 105}
	        };
		int p1sale=0,p2sale=0,p3sale=0;
		
		for(int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				System.out.print(sale[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				if(j==0) {
					p1sale+=sale[i][j];
				}
				if(j==1) {
					p2sale+=sale[i][j];
				}
				if(j==2) {
					p3sale+=sale[i][j];
				}
			}
		}
		System.out.println("Total sales of product 1 is"+p1sale);
		System.out.println("Total sales of product2 is"+p2sale);
		System.out.println("Total sales of product3 is"+p3sale);
		System.out.println("Message for  product 1 is");
		printresult(p1sale);
		System.out.println("Message for  product2 is");
		printresult(p2sale);
		System.out.println("Message for  product3 is");
		printresult(p3sale);
		
	}
		public static void printresult(int total) {
			if (total>=500 ) {
				System.out.println("Target Achieved");
			}
			else if(total>=300 && total<=499) {
				System.out.println("Average Performance");
			}
			else if(total<300) {
				System.out.println("Need Improvement");
			}
		}
		
	
}
