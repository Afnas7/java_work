package java_work.Test;

import java.util.Scanner;
class Calculator{
	int add(int a,int b) {
		return a+b;
	}
	int sub(int a,int b) {
		return a-b;
	}
	int mult(int a,int b) {
		return a*b;
	}
	float div(int a,int b) {
		return a/b;
	}
}
public class Q4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the first number ");
		int a=input.nextInt();
		System.out.print("Enter the 2 number ");
		int b=input.nextInt();
		Calculator calc=new Calculator();
		System.out.println("Addition: " + calc.add(a, b));
	    System.out.println("Subtraction: " + calc.sub(a, b));
	    System.out.println("Multiplication: " + calc.mult(a, b));
	    System.out.println("Division: " + calc.div(a, b));
	}
}
