class hw9{
	
	public static void main (String [] args){
		double km = Double.parseDouble (args[0]); // kilometres traveled
		double cons = Double.parseDouble (args [1]); // benzine spend
		double srLitrCons100mil;
		double mile;
		double hal;
		
		mile = km*0.6214;
		hal = cons/3.875;
		srLitrCons100mil = mile/hal;
				
		System.out.println (" Your average consumption of benzine is " + srLitrCons100mil + " mile in 1 halon");
	
		
	}
}