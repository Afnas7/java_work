//You are building a simple grade report for a school. The teacher wants a program that:
//Stores the marks of 5 subjects in a array (e.g.,{78, 82, 91, 65, 34}).
//Calculates the total and average marks.
//Displays the result using the following conditions:
//If average is 90 or above -> "Grade: A"
//If average is 75–89 -> "Grade: B"
//If average is 60–74 -> "Grade: C"
//If average is below 60 -> "Grade: D"
//If the student scored below 35 in any subject, the result should be "Fail" immediately (use a loop and break).
package java_work.day_6;

public class Day_6_Homework {
	public static void main(String[] args) {
		int total=0;
		boolean flag=false; 
		int marks[]= {78, 82, 91, 65, 37};
		for (int mark : marks) {
			if (mark <35) {
				flag=true;
				break;
			}
			total+=mark;
		}
        if (flag) {
        	System.out.println("Fail");
        }
        else {
        	int avg=total/marks.length;
    		System.out.println("Total Marks = " + total);
            System.out.println("Average = " + avg);
        	if (avg >= 90) {
                System.out.println("Grade: A");
            } else if (avg >= 75) {
                System.out.println("Grade: B");
            } else if (avg >= 60) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: D");
            }
        }
	}

}
