package Practice;

import java.util.ArrayList;

public class javaarraylist {

	public static void main(String[] args) {
		
		ArrayList<String> color=  new ArrayList<String>();
		color.add("blue");
		color.add("red");
		color.add("green");
		color.set(0, "pink");
		color.remove(0);
		color.size();
		//color.clear();
		System.out.println(color);
System.out.println(color.get(0)    +  color.get(1));
System.out.println(color.size());

	}

}
