public class rombv3
{
	public static void Romb (int N) // Ромб должен быть нечётной величины, по этому я просто все чётные числа увеличиваю на 1
	{
		if (N%2 == 0)
		{
			rombStar(N+1);
		}else
		{
			rombStar(N);
		}
	}
	public static void rombStar (int N)      
	{
		String str = "";
		String str1 = "";
		int min = 0;
		int minus = 2;
		for (int i = 0;i< N; i++)              
		{
			if (i<=N/2)
			{
				for (int ii = 0;ii<=N/2-1-i; ii++)
				{
					str+=" ";
				}
				for (int ii = 0; ii <=min; ii++)
				{
					str1+="*";
				}
				str += str1;                  
				System.out.println (str);
				str = "";
				str1 = "";
				min += 2;
			}else
			{
				
				for (int ii = 0;ii<-(N/2-i); ii++)
				{
					str+=" ";				
				}
				for (int ii = 1; ii <=N-minus; ii++)
				{
					str1+="*";
				}
				str+=str1;
				System.out.println (str);
				str="";
				str1="";
				minus +=2;
			}
		}
	}	
	public static void main (String [] args)
	{
		int n = Integer.parseInt (args[0]);
		Romb(n);
	}
}