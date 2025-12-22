package java_work.Test;
import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the number of lines");
		int n=input.nextInt();
		for (int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
