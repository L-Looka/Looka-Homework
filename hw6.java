class hw6{
	
	 public static void main (String [] args) {
		float TF = Float.parseFloat(args[0]);
		float TC;
		TC = (TF - 32) * 5/9;
		System.out.println ("The temperature is  " + TC + " degrees Celsius");
	}
}
	