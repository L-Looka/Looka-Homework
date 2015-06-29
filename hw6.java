class hw6{
	
	static public void main (String [] args) {
		float TF = Integer.parseInt(args[0]);
		float TC;
		TC = (TF - 32) * 5/9;
		System.out.println ("The temperature is  " + TC + " degrees Celsius");
	}
}
	