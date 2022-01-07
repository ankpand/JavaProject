package Training;

public class StringMethods {

	public static void main(String[] args) {
		
		String title = "Mrs. ";
		String name = "Ankur Pandey";
		int empId = 145;
		String designation = "Java Programmer";
		
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(title.concat(name));
		System.out.println(title + name);
		System.out.println(name.concat(designation));
		
		System.out.println("Welcome to the \'world\' of\n\"JAVA\" this is the \nlearining tutorial\n");
		System.out.println("Address: 12-3-232\\2\\A");
		
	}

}
