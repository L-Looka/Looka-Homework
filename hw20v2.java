class hw20v2{
	public static void main (String []args){
		int x1 = Integer.parseInt (args[0]);
		int y1 = Integer.parseInt (args[1]);
		int x2 = Integer.parseInt (args[2]);
		int y2 = Integer.parseInt (args[3]);
		
		if ((x1+y1)%2==(x2+y2)%2){
		System.out.println ("This fields are of the same color"); }
			else {
				System.out.println("This fields are of the different color");
			}
		
	}
}