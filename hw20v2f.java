class hw20v2f
{
	public static boolean color (int X1, int X2, int Y1, int Y2)
	{
		if ((X1+Y1)%2==(X2+Y2)%2)
		{
			return true;
		}else{
			return false;
		}
	}
	public static void main (String []args){
		int x1 = Integer.parseInt (args[0]);
		int y1 = Integer.parseInt (args[1]);
		int x2 = Integer.parseInt (args[2]);
		int y2 = Integer.parseInt (args[3]);
		
		if (color(x1,x2,y1,y2))
		{
		System.out.println ("This fields are of the same color");
	    }
		else 
		{
			System.out.println("This fields are of the different color");
		}	
	}
}