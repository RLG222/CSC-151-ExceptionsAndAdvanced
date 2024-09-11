package GrossExceptionsAndAdvanced;

public class GrossTestScores extends Exception {

	private static final long serialVersionUID = 1L; //serialize
	private String invalidScore;

	GrossTestScores(String invalidScore) {
		this.invalidScore = invalidScore;
	}

	public String getinvalidScore() { //getter
		return invalidScore;
	}

	public void setinvalidScore(String invalidScore) { //setter
		this.invalidScore = invalidScore;
	}

}
/*If the test score is in between 0-100, it is ok, otherwise display invalid test score instead of the su, of a 
 * 
 */
class TestScores { 
	TestScores(int a[]) throws GrossTestScores {
		int n = a.length, sum = 0;
		for (int i = 0; i < n; i++) {

			if (a[i] < 0 || a[i] > 100)
				throw new GrossTestScores("Invalid test score.");
			else
				sum = sum + a[i];

		}
		System.out.println("Your average score is " + (float) sum / n);
	}
}