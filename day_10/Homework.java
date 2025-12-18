//You are designing a basic student profile system where each student has a name, roll number, and percentage score. The data should be protected and only accessible through proper methods. You need to:
//
//Create a class Student with:
//
//Three private variables: name, rollNo, and percentage
//
//Public getter and setter methods for each variable
//
//Use the this keyword in setter methods to refer to the current object
//
//In a class called StudentTest, create a Student object, set values using setters, and display them using getters.


package java_work.day_10;

public class Homework {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student stu=new student();
		stu.setName("appu");
		stu.setRollnumber(33);
		stu.setPercentage(77.73);
		
		System.out.println("name is"+stu.getName());
		System.out.println("roll number is"+stu.getRollnumber());
		System.out.println("percentage is"+stu.getPercentage());

	}
}
class student {
	private String name;
	private int rollnumber;
	private double percentage;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setRollnumber(int roll) {
		this.rollnumber=roll;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setPercentage(double  per) {
		this.percentage=per;
	}
	public double getPercentage() {
		return percentage;
	}
	
}