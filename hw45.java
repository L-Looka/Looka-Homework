class hw45
{
	public static void main (String [] args)
	{
		int [] arr = new int [10];
		double N = Double.parseDouble(args[0]);
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
				
		for (int i=0;i<10;i++)
		{
			System.out.println ( arr[i]+" "+N);
		}
	}
}