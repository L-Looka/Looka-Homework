class hw34 {
	public static void main (String[]args){
		int n = Integer.parseInt(args[0]);
		int fib [] = new int[n];
		fib [0]=1;
		fib [1]=1;
		System.out.println("F1 = 1");
		System.out.println("F2 = 1");
		for (int i =3;i<=n;i++){
		int x = i-1;
		fib [x]=fib [x-1]+fib[x-2];
		System.out.println("F"+i+" = "+ fib [x]);		
		}
	}
}
