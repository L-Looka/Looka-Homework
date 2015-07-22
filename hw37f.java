class hw37f{
	public static boolean DaNet (int x)	{
		int ps=1;
		int temp = x;
		for (int i=x-1; i>1 ; i--){
			ps = temp%i;
			if (ps == 0){
				return false;
			} 
		}
		return true;
	}
	public static void main (String args[]){
		int pros = Integer.parseInt(args[0]);
		System.out.println ("The expression: \"This number is simple\"  is " + DaNet(pros));
	}	
}