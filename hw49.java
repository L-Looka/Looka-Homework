class hw49
{
	public static int sum (int[]mass)
	{
		int massSum = 0;
		for (int i=0; i <  mass.length; i++)
		{
			massSum+=mass[i];
		}
		return massSum;
	}
	
	public static void main (String [] args)
	{
		int [] arr = new int [args.length];
		for (int i = 0; i<args.length; i++)
		{
			arr [i] = Integer.parseInt(args[i]);
		}		
		System.out.println(sum(arr));
	}
}