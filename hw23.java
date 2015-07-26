public class hw23
{
	public static int days (int Year)
	{
		if (Year%4==0)
		{
			if (Year%100==0)
			{
				if (Year%400==0)
				{
					return 366;
				}
				return 365;						
			}
			return 366;	
		}
		return 365;
	}
	public static void main (String [] args)
	{
		int year = Integer.parseInt (args[0]);		
		System.out.println (days(year));
	}
}