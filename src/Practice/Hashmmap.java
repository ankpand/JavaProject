package Practice;

import java.util.HashMap;

public class Hashmmap {

	public static void main(String[] args) {
		HashMap<String,String> obj = new HashMap<String,String>();
		obj.put("raipur","sanjay");
		obj.put("durg","aditya");
		obj.put("nagpur","akol");
		System.out.println(obj);
 System.out.println(obj.get("raipur"));
 System.out.println(obj.remove("nagpur"));
 obj.clear();
 System.out.println(obj);
	}

}
