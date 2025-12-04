//You are helping building a small attendance system for a training class. The system should ask the user to enter the number of students and their names and marks.Complete the following tasks:
//Store the data in arrays.
//Display the name and mark of each student.
//If any student has marks below 35, print "Needs Improvement".
//Use a method to calculate and return the average mark.
//Display the current date and time when the program ends.
package java_work.day_7;
import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Day_7_Classwork {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n=in.nextInt();
		
		String name[]=new String[n];
		int mark[]=new   int[n];
		
		for (int i=0;i<n;i++) {
			System.out.println("Enter the name of students");
			name[i]=in.next();
			System.out.println("Enter the mark of students");
			mark[i]=in.nextInt();
		}
		
		System.out.println("\n--- Student Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println(name[i] + " : " + mark[i]);
        	
            if (mark[i]<35) {
            	System.out.println("Need Improvement");
            }
        }
        avgmark(mark,n);
        LocalDateTime currDate =LocalDateTime.now();
        DateTimeFormatter formattime=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        
        System.out.println("\nProgram ended at: " + currDate.format(formattime));
	}
	public static void avgmark(int mark[],int n) {
		int total=0;
		for(int i=0;i<n;i++) {
			total+=mark[i];
		}
    	int avg=total/n;
    			System.out.println("Average mark :"+avg);
    }
}
