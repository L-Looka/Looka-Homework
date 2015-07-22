class hw33f
 {
	public static int fac (int N)
	{
		int fact = 1;
		for (int i =1;i<=N;i++)
		{
			fact *=i;
		}return fact;
	}
	public static void main (String[]args){
		int n = Integer.parseInt(args[0]);	
		System.out.println("Factorial is " + fac(n));
	}
}
