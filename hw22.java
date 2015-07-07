class hw22{
	public static void main (String []args){
		int x1 = Integer.parseInt (args[0]);
		int y1 = Integer.parseInt (args[1]);
		int x2 = Integer.parseInt (args[2]);
		int y2 = Integer.parseInt (args[3]);
		
		if (x1==x2||y1==y2){
			System.out.println ("Yep, the Queen can do this move");
		} else if ((x1==x2-1||x1==x2+1)&&(y1==y2-1||y1==y2+1)){
			System.out.println ("Yep, the Queen can do this move");
		} else {
			System.out.println ("Nop, the Queen can`t do this move");
		}
	}
}	