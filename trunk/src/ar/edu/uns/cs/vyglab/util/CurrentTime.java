package ar.edu.uns.cs.vyglab.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CurrentTime {

	protected static long startTime;
	
	public static String getCurrentTime()
	{
		Calendar cal = Calendar.getInstance(TimeZone.getDefault());
		String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		
		return sdf.format(cal.getTime()); 
	}
	
	public static void StartTimeFrame()
	{
		startTime = System.currentTimeMillis();
	}
	
	public static long EndTimeFrame()
	{
		long currentTime = System.currentTimeMillis();
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss:SSS");
		dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));		
		return(currentTime - startTime);
	}
	

}
