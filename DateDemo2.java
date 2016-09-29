import java.util.Date;
public class DateDemo2{
	static long mills=System.currentTimeMillis();
  public static void main(String args[]){
      Date date=new Date(mills);   
      System.out.println(date);
    }
}
