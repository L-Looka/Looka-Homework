class hw30{
	public static void main (String[]args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int mult=1;
		for (int i=a;i<=b;i++){
			mult*=i;
		}
		System.out.println (mult);
	}
}