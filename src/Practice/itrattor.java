package Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class itrattor {

	public static void main(String[] args) {
	    ArrayList<String> color = new ArrayList<String>();
	    color.add("red");
	    color.add("green");
	    color.add("blue");
	    color.add("orange");
	    
	    Iterator<String> obj = color.iterator();

	    
	    System.out.println(obj.next());
	    System.out.println(obj.toString());
	    System.out.println(obj.hashCode());
	    System.out.println(obj.hasNext());
	    System.out.println(obj.next());
	    System.out.println(obj.getClass());
	    System.out.println(obj.next());

	}

}
