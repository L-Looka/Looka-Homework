class hw34fv2 {
	public static String fibo (int N)	{
		int a=1;
		int b=0;
		String str = new String();
		for (int i =1;i<=N;i++)
		{
			a += b;
			str+= a + " ";
			if (i<N)
			{
				b += a;
				str+= b + " ";
				i++;	
			}
		}return str;
	}
	public static void main (String[]args){
		int n = Integer.parseInt(args[0]);
		System.out.println("The "+ n + " length of Fibonacci is " + fibo(n));	
	}
}
