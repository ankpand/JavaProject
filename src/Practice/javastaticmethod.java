package Practice;

public class javastaticmethod


{
	static void mymethod(int num,String name,char grade)
	{ 
		System.out.println("learning new static method    :"+"number are:   "+num + "emp name:  "+name +"grade is:  " +grade);
	}
public void newmethod (double  salary,boolean y)

{
	System.out.println("learning non static method"+"emp salary :"+salary+"working on IT    :"+y);
	int num=897;
}
static void mymd()
{
	int sum = 786;
	sum = 300;
	System.out.println("print sum"+sum);
	
}

	
	
	
	
	
	

	public static void main(String[] args) {
		
		mymethod(98,"ak",'k');
		
		javastaticmethod obj=  new javastaticmethod();
		obj.newmethod(7866.9d,true);
		
		
		
		mymd();
		
		
		

	}

}
