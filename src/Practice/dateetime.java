package Practice;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class dateetime {

	public static void main(String[] args) {
		
		LocalDateTime Objj = LocalDateTime.now();
      System.out.println(Objj);
      LocalDate Obj = LocalDate.now();
      System.out.println(Obj);
     
      LocalTime myObj = LocalTime.now();
      System.out.println(myObj);

      
      
     
      DateTimeFormatter Ob = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
      String newob = Objj.format(Ob);
      System.out.println(Ob);
	}

}
