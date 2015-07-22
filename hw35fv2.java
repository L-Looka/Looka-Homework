class hw35fv2 {
	public static String depMonth (double dep, double pers){	
		int k =0;
		String str = new String();
		if (pers>0&&pers<25)
		{
			for (k =0; dep<1100.0; k++)
			{
				dep=(dep*pers)/100+dep;
			}
			str = "Your deposit will exceeds 1100 after " + k + " month";
			return str;
		} else {
			str = "Your deposit rate must bee between 0 and 25%";
			return str;
		}
		
	}
	public static void main (String[]args){
		double  p = Double.parseDouble(args[0]);
		double s = 1000.0;
		System.out.println(depMonth(s,p));
	}
}