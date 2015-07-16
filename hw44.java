class hw44
{
	public static void main (String [] args)
	{
		int [] arr = new int [10];
		int K = Integer.parseInt(args[0]);
		arr [0] = Integer.parseInt(args[1]);
		arr [1] = Integer.parseInt(args[2]);
		arr [2] = Integer.parseInt(args[3]);
		arr [3] = Integer.parseInt(args[4]);
		arr [4] = Integer.parseInt(args[5]);
		arr [5] = Integer.parseInt(args[6]);
		arr [6] = Integer.parseInt(args[7]);
		arr [7] = Integer.parseInt(args[8]);
		arr [8] = Integer.parseInt(args[9]);
		arr [9] = Integer.parseInt(args[10]);
		int x= 0;
		
		for (int i=10;i>0;i--)
		{
			if (arr[i-1]>K)
			{
				System.out.println ("The serial number of the last number that is higher that K is " +i);
				x=1;
				break;
			}
			else
			{
				x=0;
			}
		}
		if (x==0)
		{
			System.out.println (x);
		}
	}
}