package Practice;

public class CommentsVariables {

	public static void main(String[] args) {
		
		//this is my first project
		  //working on that
		 
		short empId = 132;
		String fName="Aviral";
		String lName="Pandey";
		long contact = 9804224164L;
		String address="NC";
		double salary = 10000.00d, tax = 95.55d;
		
		int leaves =90;
		int incent =70;
		double totalSalary= salary-tax-leaves-incent;
		
		
		System.out.println("\tEmployees Details");
		System.out.println("\t*****************\n");
		
		System.out.println("Employee Id : "+ empId);
		System.out.println("First Name  : "+ fName);
		System.out.println("Last Name   : "+ lName);
		System.out.println("Full Name   : " + fName+lName);
		System.out.println("Contact No  : " +contact);
		System.out.println("Address     : "+ address);
		System.out.println("Net Salary  : "+ salary+"\nFederal Tax : "+ tax);
		
		System.out.println("Leaves      : "+ leaves);
		System.out.println("Incentive   : "+ incent);
		System.out.println("============================");
		System.out.println("Total Salary: "+ totalSalary);
		System.out.println("----------------------------");
		
		
		

	}

}
