package Training;

abstract class Person {
	
	public String fname = "Ankur";
	public int age = 30;
	public abstract void ankurMethod();
	public abstract void alyMethod();

}

class Student extends Person{
	String desig = "Engineer";
	public void ankurMethod() {
		System.out.println("Hi this is Ankur Method");
	}
	public void alyMethod() {
		System.out.println("This is Aly Method");
	}
}