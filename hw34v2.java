class hw34v2 {
	public static void main (String[]args){
		int n = Integer.parseInt(args[0]);
		int a=1;
		int b=0;
		for (int i =1;i<=n;i++){
		a+=b;
		System.out.println("F"+i+" = "+ a);
			if (i<n){
			b+=a;
			i++;
			System.out.println("F"+ i +" = "+ b);	
			}
		}
	}
}
