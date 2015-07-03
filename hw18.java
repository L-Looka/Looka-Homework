class hw18{
	public static void main (String []args){
		int x = Integer.parseInt (args[0]);
		int x1,x2,x22,x3;
		x1=x/100;
		x2=x/10;
		x22=x2%10;
		x3=x%10;
		if (x1 <x22 && x22 <x3) {
			System.out.println (" Your numbers is increases ");
		} else {
			System.out.println (" Your number isn`t increases ");
		}
	}
}