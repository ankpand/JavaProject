package Training;

public class OtherClass {

	public static void main(String[] args) {
		
		
		Student myObj = new Student();
		
		
		System.out.println(myObj.age);
		System.out.println(myObj.fname);
		System.out.println(myObj.desig);
		myObj.ankurMethod();
		myObj.alyMethod();
		
		Encap alyObj = new Encap();
		alyObj.setName("Shanaya");
		alyObj.setAge(03);
		System.out.println(alyObj.getName());
		System.out.println(alyObj.getAge());

	}

}
