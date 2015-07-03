class hw12{
	public static void main (String [] args){
		int x = Integer.parseInt (args[0]);
		int x1;
		int x2;
		int rev;
		x1=x/10;
		x2=x%10;
		rev= x2*10+x1;
		System.out.println (rev);
		
	}
}