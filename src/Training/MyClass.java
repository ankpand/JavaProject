package Training;

public class MyClass {
	
	String empName = "Ankur Pandey";
	final double salary = 6500.00d;
	double incen = 3500.00d;
	double tax = 789.00d;
	double total = salary + incen - tax;
	
	
	
	public static void main(String[] args) {
		
		MyClass vObj = new MyClass();
		
		//vObj.empName = "Vijay";
		//vObj.salary = 9000.00d;
		System.out.println("Employee Name : " +vObj.empName);
		System.out.println("Salary        : " +vObj.salary);
		System.out.println("Incentive     : " +vObj.incen);
		System.out.println("Federal Tax   : " +vObj.tax);
		System.out.println("Total Salary  : " +vObj.total);

	}

}
