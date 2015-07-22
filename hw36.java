class hw36 {
	public static void main (String args[]){
		int x = Integer.parseInt (args[0]);
		int c;
		String l=""+x;
		for (int i=1;i<=l.length();i++){
			c=x%10;
			x=x/10;
			System.out.println (c);
		}
	}
} /* вот так определяет длину строки и работает нормально
если убрать преобразование X в стринг и написать i<args.length выводить только последний символ*/