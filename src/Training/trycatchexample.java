package Training;

public class trycatchexample {

	public static void main(String[] args) {
		try {
		      int[] myNumbers = {1000, 2000, 3000, 4000, 5000, 6000};
		      System.out.println(myNumbers[2]);
		    } catch (Exception e) {
		      System.out.println("Please give input between 0 to 5.");
		    }
		finally {
			System.out.println("thank you for visiting us!");
		}
		  }


	}
