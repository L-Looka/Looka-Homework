class hw35 {
	public static void main (String[]args){
		double  p = Double.parseDouble(args[0]);
		double s = 1000.0;
		int k =0;
		if (p>0&&p<25){
		do {
			s=(s*p)/100+s;
			k++;
		} while (s<1100.0);
			System.out.println (k);
		} else {
			System.out.println ("Please enter interest rate between 0 and 25%");
		}
	}
}