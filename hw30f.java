class hw30f
{
	public static int mult (int x,int y)
	{
		int multy = 1;
		if (x<y)
		{
			for (int i=x;i<=y;i++)
			{
			multy*=i;			
			}return multy;
		}else{
			for (int i=y;i<=x;i++)
			{
				multy*=i;	
			}return multy;
		}
		
	}
	public static void main (String[]args)
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println ("The multiplication of all numbers between 2 entered numbers is " + mult(a,b));
	}
}