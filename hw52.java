class hw52
{
	public static int SumBiggerSq (int a, int b, int c)
	{
		int sumSq = 0;
		if (a > b || a > c)
		{
			a*=a;
			sumSq+=a;
		}
		if (b > a || b > c)
		{
			b*=b;
			sumSq+=b;
		}
		if (c > a || c > b)
		{
			c*=c;
			sumSq+=c;
		}
		return sumSq; 
	}	
		/*	в задаче не указано что делать если однозначно нельзя выявить 2 больших числа, к примеру,
		если введены все числа одинаковыми или если 2 меньших из них равные. 
		- Какое из чисел считать большим в таких случаях?
		- Какие числа вводятся? по умолчанию я написал для целых цисел	 */
	
	public static void main (String [] args)
	{
		int x = Integer.parseInt (args[0]);
		int y = Integer.parseInt (args[1]);
		int z = Integer.parseInt (args[2]);
		System.out.println (SumBiggerSq(x,y,z));
	}
}