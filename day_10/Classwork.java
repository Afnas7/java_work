//You are tasked with creating a simple employee details system for an HR team. Each employee has a name, ID number, department, and salary, which must be protected from direct access or modification. Complete the following tasks:
//
//Tasks:
//
//Create an Employee class that encapsulates the following fields:
//    Name (String)
//    ID number (integer)
//    Department (String)
//     Salary (double)
//Ensure all fields are private to prevent direct access or modification.
//Provide public getter and setter methods for each field (name, ID, department, salary) to allow controlled access and modification.
//Create a test class named EmployeeTest with a main() method that:
//Creates two Employee objects.
//    Uses setter methods to assign values for name, ID, department, and salary for each employee.
//     Displays the details of both employees using getter methods only, not by accessing fields directly.
package java_work.day_10;

public class Classwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
        e1.setName("Rahul");
        e1.setId(101);
        e1.setDepartment("HR");
        e1.setSalary(45000);

        // Create second Employee object
        Employee e2 = new Employee();
        e2.setName("Anju");
        e2.setId(102);
        e2.setDepartment("IT");
        e2.setSalary(60000);

        // Display Employee 1 details
        System.out.println("Employee 1 Details");
        System.out.println("Name: " + e1.getName());
        System.out.println("ID: " + e1.getId());
        System.out.println("Department: " + e1.getDepartment());
        System.out.println("Salary: " + e1.getSalary());

        System.out.println();

        // Display Employee 2 details
        System.out.println("Employee 2 Details");
        System.out.println("Name: " + e2.getName());
        System.out.println("ID: " + e2.getId());
        System.out.println("Department: " + e2.getDepartment());
        System.out.println("Salary: " + e2.getSalary());
	}

}
class Employee{
	private String Name;
	private int ID;
	private String Department;
	private double salary;
	public void setName(String name) {
		this.Name=name;
	}
	public String getName() {
		return Name;
	}
	public void setId(int id) {
		this.ID=id;
	}
	public int getId() {
		return ID;
	}
	public void setDepartment(String name) {
		this.Department=name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setSalary(double  per) {
		this.salary=per;
	}
	public double getSalary() {
		return salary;
	}
}