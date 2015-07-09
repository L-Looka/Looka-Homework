class hw33 {
	public static void main (String[]args){
		int n = Integer.parseInt(args[0]);
		int fac = 1;
		for (int i =1;i<=n;i++){
			fac *=i;
		}
		System.out.println(fac);
	}
}
