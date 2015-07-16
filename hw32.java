class hw32
 {
	public static void main (String[]args)
	{
		double a = Double.parseDouble(args[0]);
		int n = Integer.parseInt(args[1]);
		int b=1;
		int c=1;
		for (int i = 1;i<=n;i++)
		{
			c*=(-a);
			b+=c;
		}
		System.out.println (b);
	}
} 

