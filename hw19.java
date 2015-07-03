class hw19{
	public static void main (String []args){
		int x = Integer.parseInt (args[0]);
		int x1,x2,x22,x3,x33,x4;
		x1=x/1000;
		x2=x/100;
		x22=x2%10;
		x3=x/10;
		x33=x3%10;
		x4=x%10;
		if (x1 == x4 && x22 ==x33) {
			System.out.println (" Your numbers is palindrome ");
		} else {
			System.out.println (" Your number isn`t palindrome or it si not a for-digit");
		}
	}
}