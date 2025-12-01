//You are creating a basic score-checking system for a training program. You are given a list of 5 student scores.
//Write a Java program that:
//Stores the 5 scores in a single-dimension array.
//Checks each score:
//If the score is above or equal to 90, print "Excellent".
//If the score is between 75 and 89, print "Good".
//If the score is between 50 and 74, print "Average".
//If the score is below 50, print "Fail".
package java_work.day_5;

public class Day_5_Classwork {
	public static void main(String[] args) {
		int score[]= {40,56,79,99};
		for (int i=0;i<score.length;i++) {
			if(score[i]>=90) {
				System.out.println(score[i] +" Excellent");
			}
			if(75<=score[i] && score[i]<=89) {
				System.out.println(score[i] +" Good");
			}
			if(50<=score[i] && score[i]<=74) {
				System.out.println(score[i] +" Average");
			}
			if(score[i]<50) {
				System.out.println(score[i] +" Fail");
			}
		}
		
	}
}
