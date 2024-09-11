/*This is Robert Gross's java project written July 4th, 2023. The purpose of this 
 * project is to use individual constructors and class' to create a program that
 * takes test scores from the user, and prints out the average score of the tests,
 * with minimal code in the main method. It uses exceptions in order to display
 * when a test score is invalid to the user
 */


package GrossExceptionsAndAdvanced;// package declaration

import java.util.Scanner; //import scanner

public class GrossTestScoresTest {
	public static void main(String[] args) throws GrossTestScores { // main method
		System.out.print("Please enter the number of test scores:");
		Scanner scan = new Scanner(System.in); //create scanner
		int totalScores = scan.nextInt(); //store total number of tests as int
		int[] a = new int[totalScores];
		for (int i = 0; i < totalScores; i++) {
			System.out.print("Enter test score " + (i + 1) + ":"); //enter test score until totalScores
			a[i] = scan.nextInt();

		}

		try { //try the test scores, if one is invalid, print invalid, otherwise display correct score
			new TestScores(a);
		} catch (GrossTestScores e) {
			System.out.println(e.getinvalidScore());
		}
		scan.close(); //close scanner
	}
}