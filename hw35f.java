class hw35f {
	public static int depMonth (double dep, double pers){	
		int k =0;	
		for (k =0; dep<1100.0; k++)
		{
			dep=(dep*pers)/100+dep;
		} 
			return k;
		
	}
	public static void main (String[]args){
		double  p = Double.parseDouble(args[0]);
		double s = 1000.0;
		if (p>0&&p<25)
		{
			System.out.println ("Your deposit will exceeds 1100 after " + depMonth(s,p) + " month");
		} else {
			System.out.println ("Your deposit rate must bee between 0 and 25%");
		}
	}
}