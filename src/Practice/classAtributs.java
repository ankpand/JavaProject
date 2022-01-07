package Practice;

public class classAtributs {
	
	
	int z=789;
	int y=675;
	String name = "ankur";
	

	public static void main(String[] args) {
	
  classAtributs objName = new classAtributs();
  classAtributs onlyobj= new classAtributs();
  
  System.out.println(objName.name);
  objName.z = 444;
  objName.name = "Aly Mir";
  onlyobj.name = "Shanaya";
  System.out.println(objName.z);
  System.out.println("Emp name   :"+objName.name     +"   "+onlyobj.name);
  System.out.println(onlyobj.name);
  
	}

}
