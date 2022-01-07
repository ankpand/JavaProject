package Practice;



public class multiObj {
	
	double z= 78896.8d;
	char grade ='a';
	long contactnumber = 988877698L;
	double salary = 67675.77d;
	
	static void methodname()
	{
		System.out.println("new method add in oops obj");
		
	}
	
	
	
	
	

	public static void main(String[] args)  
	
	{
		methodname();
	
		multiObj actualObj =  new multiObj();
		multiObj secondObj= new multiObj();
		multiObj thirdObj= new multiObj();
		System.out.println("emp incentive & salary      :"+actualObj.z+ actualObj.salary);
		System.out.println("emp performance             :"+secondObj.grade);
         System.out.println("emp number                 :"+thirdObj.contactnumber);
         //actualObj.methodname();
	}

}
