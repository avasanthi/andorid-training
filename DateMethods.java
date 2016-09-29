import java.util.*;
import java.text.*;
public class DateMethods{
	public static void main(String a[])
	{
		Date date= new Date();
		SimpleDateFormat ft=new SimpleDateFormat("yyyy-MM-dd");
  
		System.out.println("Current Date:"+ft.format(date));
    }
}
