class hw21f
{
	public static boolean canRook (int X1,int Y1,int X2,int Y2)
	{
		if (X1==X2||Y1==Y2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main (String []args){
		int x1 = Integer.parseInt (args[0]);
		int y1 = Integer.parseInt (args[1]);
		int x2 = Integer.parseInt (args[2]);
		int y2 = Integer.parseInt (args[3]);
		
		if (canRook(x1,y1,x2,y2)){
			System.out.println ("Yep, chess rook can do this move");
		} else {
			System.out.println ("Nop, chess rook can`t do this move");
		}
	}
}	