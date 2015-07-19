class hw50
{
	public static int mult (int[]mass)
	{
		int massMult = 1;
		for (int i=0; i <  mass.length; i++)
		{
			massMult *= mass[i];
		}
		return massMult;
	}
	
	public static void main (String [] args)
	{
		int [] arr = new int [args.length];
		for (int i = 0; i<args.length; i++)
		{
			arr [i] = Integer.parseInt(args[i]);
		}		
		System.out.println(mult(arr));
	}
}