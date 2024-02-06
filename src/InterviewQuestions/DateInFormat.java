package InterviewQuestions;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateInFormat {

	public static void main(String[] args) {
		   SimpleDateFormat dateformat = new SimpleDateFormat("dd  MMM yyyy");
		   
		   
		   
		   
//	   System.out.println("\"'hello'\"");
	   // my name is rishikesh \u000d //System.out.println("\"'hello'\"");

		   
			Date date =new Date ();
			   String   systemDateinFormat=dateformat.format(date);
			   System.out.println(systemDateinFormat);
	}

}
