class hw47
{
	public static int countChars (String sent,char a)
	{
		int x =0;
		int length = sent.length();
		for (int i=0;i<length;i++)
		{
			if (sent.charAt(i)==a)
			{
				x++;
			}
		}		 
		return x;
	}
	
	public static void main (String [] args)
	{
		char a = 'a';	
		String str = "vavilovo in panica";		
		System.out.println (countChars(str, a));
	}
}