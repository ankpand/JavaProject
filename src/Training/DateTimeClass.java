package Training;

import java.time.*;
import java.time.format.DateTimeFormatter;


public class DateTimeClass {

	public static void main(String[] args) {
		LocalDate myObj = LocalDate.now(); // Create a date object
	    System.out.println(myObj); // Display the current date

	    LocalTime timeObj = LocalTime.now();
	    System.out.println(timeObj);
	    
	    LocalDateTime dtObj = LocalDateTime.now();
	    System.out.println(dtObj);
	    
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm a");

	    String formattedDate = dtObj.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);

	    
	}

}
