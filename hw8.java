class hw8{
	
	public static void main (String [] args){
		float km = Float.parseFloat (args[0]); // kilometres traveled
		float cons = Float.parseFloat (args [1]); // benzine spend
		float litrCash = Float.parseFloat (args [2]); // the litre cost
		float srLitrCons100km;
		float srKmCash;
		
		srLitrCons100km = cons*100/km;
		srKmCash = cons/km*litrCash;
		
		System.out.println (" Your average consumption of benzine in 100 km is " + srLitrCons100km );
		System.out.println (" Your average 1 km road cost is " + srKmCash);
		
	}
}