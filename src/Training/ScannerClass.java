package Training;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		
		Scanner ankur = new Scanner(System.in);
		System.out.println("Enter your Name");
				
		String name = ankur.nextLine();
		System.out.println("Your Salary");
		double salary = ankur.nextDouble();
		
		System.out.println("My Name is " +name);
		System.out.println("My Salary is " +salary);

	}

}
