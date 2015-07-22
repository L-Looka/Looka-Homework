class hw36f {
	public static String allNum (int X)	{
		int c;
		String l=""+X;
		String num = new String();
			for (int i=0;i<l.length();i++){
			c=X%10;
			X=X/10;
			num+=c+" ";
		}return num;
	}
	public static void main (String args[]){
		int x = Integer.parseInt (args[0]);
		System.out.println (allNum(x));
	}
}