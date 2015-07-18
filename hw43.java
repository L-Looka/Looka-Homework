class hw43
{
	public static void main (String [] args)
	{
		int [] arr = new int [10];
		int K = Integer.parseInt(args[0]);
		for (int ii = 0; ii<10;ii++)
		{
			arr [ii] = Integer.parseInt(args[ii+1]);
		}
		int x= 0;		
		for (int i=0;i<10;i++)
		{
			if (arr[i]>K)
			{
				System.out.println ("The serial number of the first number that is higher that K is " +i);
				x=1;
				break;
			}
		}
		if (x==0)
		{
			System.out.println (x);
		}
	}
}