class hw15{
	public static void main (String []args){
		int sec = Integer.parseInt  (args[0]);
		int h,m,s,ms;
		h=sec/3600;
		m=sec/60;
		ms=m;
		if (m>=60){
			do {
				m=m-60;
				} while (m>=60);
		} 
		s=sec-ms*60;
		System.out.println (" The current time is "+h+" hour "+m+" minutes "+s+" seconds ");
	}
}