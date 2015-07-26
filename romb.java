public class romb                            // 1 попытка завершонная но немного не удачная
{
	public static void rombStar (int N)      // функция рисует ромб для N>1; обьёмом N*2+1; поскольку ромб должен быть нечётного обьёма(в высоту и ширину)
	{               
		String str = "";
		String str1 = "";
		for (int o = 1; o <=N; o++)			 // вычисляем где центр ромба
		{
			str +=" ";
		}
		String oss = str + "*" ;              // задаём вертикальную ось,
		str = "";
		System.out.println (oss);
		if (N==1)
		{
			System.out.println ("***");
		}
		for (int i = 1;i<=(N-1); i++)              
		{
			for (int ii = 1;ii<=N-i; ii++)
			{
				str+=" ";
			}
			str1+="*";
			str += str1 +"*" + str1;                 // рисуем верхний треугольник
			System.out.println (str);
			if (i == N-1)                              // рисуем горизонтальную ось
			{
				System.out.println ("*"+str1 +"*" + str1+"*");
			}
			str = "";
		}
		str1 ="";
		for (int a = 1;a<=(N-1); a++)
		{
			for (int aa = 1;aa<=N-a; aa++)
			{
				str1+="*";				
			}
			str+=" ";
			str1 =str+ str1 +"*" + str1;                 // рисуем нижний треугольник
			System.out.println (str1);
			str1="";
		}
		System.out.println (oss);
	}
	public static void main (String [] args)
	{
		int n = Integer.parseInt (args[0]);
		rombStar (n);
	}
}