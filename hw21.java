class hw21{
	public static void main (String []args){
		int x1 = Integer.parseInt (args[0]);
		int y1 = Integer.parseInt (args[1]);
		int x2 = Integer.parseInt (args[2]);
		int y2 = Integer.parseInt (args[3]);
		
		if (x1==x2||y1==y2){
			System.out.println ("Yep, chess rook can do this move");
		} else {
			System.out.println ("Nop, chess rook can`t do this move");
		}
	}
}	