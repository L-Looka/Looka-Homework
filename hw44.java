class hw44
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
		for (int i=10;i>0;i--)
		{
			if (arr[i-1]>K)
			{
				System.out.println ("The serial number of the last number that is higher that K is " +i);
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