class hw38 {
	public static void main (String[]args){
		int n = Integer.parseInt(args[0]);
		int fib [] = new int[n];
		fib [0]=1;
		fib [1]=1;
		for (int i =3;i<=n;i++){
			int x = i-1;
			fib [x]=fib [x-1]+fib[x-2];
			if(fib[x]==n){
				System.out.println ("The number " +n+ " is in the Fibonacci series");
				break;
			}
			if (fib[x]!=n&&i==n){
				System.out.println ("The number " +n+ " isn`t in the Fibonacci series");
			}
		}
	}
}
