class hw16v2{
	public static void main (String []args){
		int day = Integer.parseInt (args[0]);
		if (day >365){System.out.println ("Your number must be in range 1-365");}
		else{
		if (day <1){System.out.println ("Your number must be in range 1-365");}
			else{
				while (day >7){
				day-=7;	} 
				day--;
				String [] dayname = { "Wednesday","Thursday","Friday","Saturday","Sunday", "Monday", "Tuesday" };
				System.out.println ("The current Day is " + dayname[day]);
			}
		}
	}
}	