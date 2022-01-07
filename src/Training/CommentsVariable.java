package Training;

public class CommentsVariable {

	public static void main(String[] args) {
		// This is my first java project
		// I am learning Java 
		
	/* hi this is ankur
	 * i am a student of code lab
	 * learining java and spring frame
	 * java is fun to learn
	 * 
	 */
		int empid = 432;
		String fname = "Ankur";
		String lname = "Pandey";
		String designation="java dep";
		int salary =10000;
		int incen = 380;
		int tax = 890;
		int totsalary = salary + incen - tax;
		
	System.out.println("Welcome to the Java Training\n");
	
	
		System.out.println("Employee Name : " +fname + lname);
		System.out.println("Designation   : " +designation);
		System.out.println("Salary        : " +salary);
		System.out.println("Incentive     : " +incen);
		System.out.println("Federal Tax   : " +tax);
		System.out.println("================================");
		System.out.println("Net Salary    : " +totsalary);
		System.out.println("================================");

	}

}
