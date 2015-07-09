class hw37{
	public static void main (String args[]){
		int pros = Integer.parseInt(args[0]);
		int ps=1;
		int temp = pros;
		for (int i=pros-1; i>1 ; i--){
			ps = temp%i;
			if (ps == 0){
				System.out.println ("False");
				break;
			} 
		}
		if (ps >0){
			System.out.println ("True");
		}
	}	
}