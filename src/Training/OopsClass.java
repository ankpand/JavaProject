/**
 * 
 */
package Training;


public class OopsClass {

	int empId = 123;
	String empName = "Vijay";
	int salary = 6000;
	
	public void vMethod(String name) {
		
		System.out.println(name);
	}

	static void aMethod(String lName) {
		System.out.println(lName);
	}
	public static void main(String[] args) {
		
		
		OopsClass ankurObj = new OopsClass();
		
		System.out.println(ankurObj.empId);
		System.out.println(ankurObj.empName);
		System.out.println(ankurObj.salary);
		ankurObj.vMethod("Vijay");
		
		
	}

}
