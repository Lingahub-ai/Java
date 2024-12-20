//18/12/2024
//Program To print the a date which  should add 4 days 4 month and 4 years to the given date.
package AllProgram;

import java.util.*;
import java.time.*;
import java.text.*;
public class Task011812 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Date in the Format ('dd/mm/yyyy') : ");
		String given_date = sc.next();
		
		
		SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
		
		try {
			
            Date date = df.parse(given_date);
            System.out.println("The Given Date is : " + df.format(date));
           
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
           
            calendar.add(Calendar.DAY_OF_MONTH, 4);
            calendar.add(Calendar.MONTH, 4);
            calendar.add(Calendar.YEAR, 4);
         
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            int month = calendar.get(Calendar.MONTH) + 1; 
            int year = calendar.get(Calendar.YEAR);
            
            System.out.printf("Date after adding 4 days, 4 months, and 4 years: %02d/%02d/%04d\n", day, month, year);
		}
		catch(ParseException e) {
			System.out.print("Invalid date Format");
		}
		sc.close();
	}
}