class hw31{
	public static void main (String[]args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int sumSq=0;
		int sq = 1;
		for (int i=a;i<=b;i++){
			sq=i*i;
			sumSq+=sq;
		}
		System.out.println (sumSq);
	}
}