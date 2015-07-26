class hw22f
{
	public static boolean canQueen (int X1, int Y1, int X2,int Y2)
	{
		if (X1==X2||Y1==Y2)
		{
			return true;
		} 	
		for (int i = 1;i<=8;i++)
		{
			if ((X1==X2-i||X1==X2+i)&&(Y1==Y2-i||Y1==Y2+i))
			{
				return true;
			} 
		}
		return false;	
	}	
	public static void main (String []args)
	{
		int x1 = Integer.parseInt (args[0]);
		int y1 = Integer.parseInt (args[1]);
		int x2 = Integer.parseInt (args[2]);
		int y2 = Integer.parseInt (args[3]);
		
		if (canQueen(x1,y1,x2,y2))
		{
			System.out.println ("Yep, the Queen can do this move");
		} 
		else 
		{
			System.out.println ("Nop, the Queen can`t do this move");
		}
	}
}	