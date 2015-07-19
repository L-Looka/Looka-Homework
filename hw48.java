class hw48
{
	public static int smaller (int a, int b, int c)
	{
		if (a < b && a < c)
		{
			return a;
		}
		if (b < a && b < c)
		{
			return b;
		}
		return c;
	}
	
	public static void main (String [] args)
	{
		int x = Integer.parseInt (args[0]);
		int y = Integer.parseInt (args[1]);
		int z = Integer.parseInt (args[2]);
		System.out.println (smaller(x,y,z));
	}
}