class hw11{
	
	public static void main (String [] args){
		int x = Integer.parseInt (args [0]);
		int x1;
		int x2;
		int sum;
		int mult;
		x1 = x/10;
		x2 = x%10;
		sum = x1 + x2;
		mult = x1*x2;
		System.out.println ("Summary is " + sum + " Multiplication is " + mult);
	}
}