class hw29{
	public static void main (String[]args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int sum=0;
		for (int i=a;i<=b;i++){
			sum+=i;
		}
		System.out.println (sum);
	}
}