package ar.edu.uns.cs.vyglab.util;

public class Reporter {
	
	public static boolean flag = true;
	
	public static void Report( String msg )
	{
		if (flag)
		{
			System.out.println(CurrentTime.getCurrentTime() + ":: Message :: " + msg );
		}
	}
	
	public static void Report( int i )
	{
		if (flag)
		{
			Report( Integer.toString(i) );
		}		
	}
	
	public static void Report( double d )
	{
		if (flag)
		{
			Report( Double.toString(d) );
		}		
	}	
}
