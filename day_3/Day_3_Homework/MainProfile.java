package java_work.day_3.Day_3_Homework;
import java_work.day_3.Day_3_Homework.profile.*;
import java_work.day_3.Day_3_Homework.greeting.*;
public class MainProfile {
	public static void main(String[] args) {
		Profile pobj=new Profile();
		Greeting gobj=new Greeting();
		
		gobj.greet(pobj.name);
	}
}
