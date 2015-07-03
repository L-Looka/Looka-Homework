class hw17{
	public static void main (String []args){
		int x = Integer.parseInt (args[0]);
		if (x <1000 && x >99 && x%2!=0) {
			System.out.println (" Your number is odd and three-digit ");
		} else {
			System.out.println (" Your number isn`t odd and three-digit ");
		}
	}
}