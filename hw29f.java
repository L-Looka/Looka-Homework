class hw29f{
	public static int sum(int x, int y)	
	{
		int sumy=0;
		if (x<y)
		{
			for (int i=x;i<=y;i++)
			{
				sumy+=i;
			}
			return sumy;
		}else
		 {
			for (int i=y;i<=x;i++)
			{
				sumy+=i;
			}
			return sumy;
		 }
		
		
	}
	public static void main (String[]args)
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println ("Sum of all numbers between 2 entered numbers is " + sum(a,b));
	}
}