import java.util.*;
 class CalendarDemo{
	static String months[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	public static void main(String []ar){
		int year;
		GregorianCalendar gcalc=new GregorianCalendar();
		System.out.print("Date:");
		System.out.print(months[gcalc.get(Calendar.MONTH)]);
		
		System.out.print(" "+gcalc.get(Calendar.DATE)+" ");
		System.out.print(year=gcalc.get(Calendar.YEAR));
		System.out.print("Time ");
		System.out.print(gcalc.get(Calendar.HOUR)+" ");
		System.out.print(gcalc.get(Calendar.MINUTE)+" ");
		System.out.print(gcalc.get(Calendar.SECOND));
		if(gcalc.isLeapYear(year))
			System.out.println("\n"+year+" is a Leap year");
		else
			System.out.println("\n"+year+" is not a Leap Year");
			
	}
}

