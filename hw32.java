class hw32
 {
	public static void main (String[]args)
	{
		float a = Float.parseFloat(args[0]);
		int n = Integer.parseInt(args[1]);
		float b=1;
		float c=1;
		for (int i = 1;i<=n;i++)
		{
			c*=(-a);
			b+=c;
		}
		System.out.println (b); 
/* при вводе значений 1.3 в формате дабл  и 5 вычисляет правельное число но добавляет к нему 0000000008 число -1,6638300000008
при изменение первого числа на флоат выдаёт неточное число -1,6638296  заместь -1,66383*/
	}
} 

