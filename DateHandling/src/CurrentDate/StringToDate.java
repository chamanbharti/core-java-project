package CurrentDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class StringToDate {
	public static void main(String[] args) throws ParseException {
		String dateString = "November 21, 2011";
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM d, yyyy",Locale.ENGLISH);
		Date formattedDate = dateFormat.parse(dateString);
		
		System.out.println(dateFormat);
	}

}
