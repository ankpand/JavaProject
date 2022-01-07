package Training;

public class MethodParam {
	
	
	static void userMethod(String fName, int age) {
		
		System.out.println(fName +" Pandey" + "  Age is "+age);
		
		
	}
	
	static int sumMethod(int x) {
		return 5 + x;
		
	}

	public static void main(String[] args) {
		
		userMethod("Ankur", 34);
		userMethod("aviral",6);
		userMethod("ABHINAV",36);
		
		System.out.println(sumMethod(30));
		int a = sumMethod(5);
		System.out.println(a);

	}

}
