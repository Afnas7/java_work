package java_work.Test;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id[] = {1,2,3};
		String name[]= {"rajesh","rahul","sruthi"};
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the number ");
		int n=input.nextInt();
		if(n<=id.length) {
			System.out.print(name[n-1]);
		}
		else {
			System.out.print("Enter a vaild input");
		}
	}
}
