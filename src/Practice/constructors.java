package Practice;

public class constructors {
	
	
	int t;
	String name;
	double G;
	
	public constructors(int y,String modelName,double D)
	{
		
		//t= 78;
		t = y;
		//name= "aviral";
		name=modelName;
		G=D;
	}
	
	
	

	public static void main(String[] args) {
		
		constructors myobj =  new constructors(8,"toyota",788.98d);
		myobj.t= 10;
		System.out.println(myobj.t+"    "+myobj.name+"  "+myobj.G);
		 
		

	}

}
