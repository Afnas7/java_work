package java_work.Test;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the number ");
		int n=input.nextInt();
		for(int i=0;i<10;i++) {
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}

}
