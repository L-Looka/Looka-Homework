class hw38fv2 {
	public static boolean fibTrue (int N){
		int a=1;
		int b=0;
		for (int i =1;i<=N;i++)
		{
			a += b;
			if(a==N)
			{
				return true;
			}
			if (i<N)
			{
				b += a;
				if(b==N)
				{
					return true;
				}
				i++;	
			}
		}return false;
	}
	public static void main (String[]args){
		int n = Integer.parseInt(args[0]);
		System.out.println ("The expression: \"The number " +n+ " is in the Fibonacci series\" is " + fibTrue(n));	
	}
}
