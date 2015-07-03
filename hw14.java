class hw14{
	public static void main (String [] args){
		int x = Integer.parseInt (args[0]);
		int x1;
		int x21,x22;
		int x3;
		int sum;
		int mult;
		x1=x/100;
		x21=x/10;
		x22=x21%10;
		x3=x%10;
		sum = x1+x22+x3;
		mult = x1*x22*x3;
		System.out.println ("Summery is "+ sum+" and Multiplication is "+mult);
	}
}