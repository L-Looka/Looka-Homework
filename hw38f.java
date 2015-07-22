class hw38f {
	 public static boolean fibTrue (int N) {
		 int fib [] = new int[N];
		fib [0]=1;
		fib [1]=1;
		for (int i =3;i<=N;i++)
		{
			int x = i-1;
			fib [x]=fib [x-1]+fib[x-2];
			if(fib[x]==N)
			{
				return true;
			}
		}return false;
	 }
	public static void main (String[]args){
		int n = Integer.parseInt(args[0]);
		System.out.println ("The expression: \"The number " +n+ " is in the Fibonacci series\" is " + fibTrue(n));
	}
}
