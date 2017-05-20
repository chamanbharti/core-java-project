import java.util.Date;

public class DateInfo
{
	public static void main(String[] args)
	{
		Date today=new Date();
		System.out.println("Today Particulars:"+today);
		System.out.println("Hours Part of today:"+today.getHours());
		System.out.println("Minutes part of today:"+today.getMinutes());
		System.out.println("Seconds part of today:"+today.getSeconds());
		System.out.println("Month part of today:"+today.getMonth());
		System.out.println("Date part of today:"+today.getDate());
		System.out.println("Day part of today:"+today.getDay());
		System.out.println("Year part of today:"+today.getYear());
		System.out.println("Milliseconds representation of today (from epoch time 16-01-2014):"+today.getTime());
	}
}