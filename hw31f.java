class hw31f
{
	public static int sumSq (int x, int y)
	{
		int sumySq=0;
		int sq = 1;
		if(x<y)
		{
			for (int i=x;i<=y;i++)
			{
				sq=i*i;
				sumySq+=sq;
			}return sumySq;
		}else{
			for (int i=y;i<=x;i++)
			{
				sq=i*i;
				sumySq+=sq;
			}return sumySq;
		}
		
	}
	public static void main (String[]args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println ("Sum Squares of 2 numbers is  " + sumSq(a,b));
	}
}