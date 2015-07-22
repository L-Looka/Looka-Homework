class hw34f{
	public static String fibon (int N)	{
		int fib [] = new int[N];
		fib [0]=1;
		fib [1]=1;
		String str = new String();
		str = fib [0]+"," + fib [1];
		for (int i =3;i<=N;i++)
		{
			int x = i-1;
			fib [x]=fib [x-1]+fib[x-2];
			str += "," + fib [x];
		}
		return str;
	}
	public static void main (String[]args){
		int n = Integer.parseInt(args[0]);		
		System.out.println("The "+ n + " length of Fibonacci is "+fibon(n));
	}
}
