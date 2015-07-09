class hw36 {
	public static void main (String args[]){
		int x = Integer.parseInt (args[0]);
		int c;
		String l=""+x;
		int i =0;
		for (i=0;i<l.length();i++){
			c=x%10;
			x=x/10;
			System.out.println (c);
		}
	}
}