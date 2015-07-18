class hw45
{
	public static void main (String [] args)
	{
		double B = Double.parseDouble(args[0]);
		int N = Integer.parseInt(args[1]);
		int [] arr = new int [N];
		for (int i = 0; i<N;i++)
		{
			arr [i] = Integer.parseInt(args[i+2]);
			System.out.println ( arr[i]+" "+ B);
		}		
	}
}