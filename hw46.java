class hw46
{
	public static void main (String [] args)
	{
		int N = Integer.parseInt(args[0]);
		int [] arr = new int [N];		
		for (int n = 0; n < N; n++)
		{
			arr [n] = Integer.parseInt(args[n+1]);
		}
		
		if (arr[0]!=arr[1])
		{
			System.out.print (arr[0]+" ");
		}	
		for (int i=1;i<N-2;i++)
		{
			if(arr[i-1]==arr[i]){}
			else if(arr[i]==arr[i+1]){}
			else 
			{
				System.out.print (arr[i]+" ");
			}
		}
		if (arr[N-1]!=arr[N-2])
		{
			System.out.print (arr[N-1]);
		}	
		System.out.println ("");
	}
}