package Practice;

import java.util.Scanner;

public class scanneer {

	public static void main(String[] args) {
	Scanner obj= new Scanner(System.in);
 System.out.println("enter ur name");
	System.out.println("enter ur mobile n");//	
 String n = obj.nextLine();
 System.out.println("enter ur name"+n);
	long nu = obj.nextLong();
 System.out.println("your mobile number is "+nu);
  float f =obj.nextFloat();
  System.out.println("your salary number is "+f);
 Boolean b = obj.nextBoolean();
 System.out.println("your grade is"+b);
	}

}
