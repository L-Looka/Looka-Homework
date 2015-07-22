class hw32f
 {
	 public static double state (double A, int N)
	 {
	    double b=1;
		double c=1;
		for (int i = 1;i<=N;i++)
		{
			c*=(-A);
			b+=c;
		}
		return b;
	 }
/* при вводе значений 1.3 в формате дабл  и 5 вычисляет правельное число но добавляет к нему 0000000008 число -1,6638300000008
при изменение первого числа на флоат выдаёт неточное число -1,6638296  заместь -1,66383*/
	public static void main (String[]args)
	{
		double a = Double.parseDouble(args[0]);
		int n = Integer.parseInt(args[1]);	
		System.out.println ("The expression is "+ state(a,n));
	}
} 

