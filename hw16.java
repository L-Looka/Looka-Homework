class hw16{
	public static void main (String []args){
		int day = Integer.parseInt (args[0]);
		if (day >365){System.out.println ("Your number must be in range 1-365");}
		else{
		if (day <1){System.out.println ("Your number must be in range 1-365");}
			else{
				while (day >7){
				day-=7;	} 
					if (day == 6){System.out.println ("The current Day is Monday");}
					else{
						if (day == 7){System.out.println ("The current Day is Tuesday");}
						else {
							if (day == 1){System.out.println ("The current Day is Wednesday");}
							else {
								if (day == 2){System.out.println ("The current Day is Thursday");}
								else {
									if (day == 3){System.out.println ("The current Day is Friday");}
									else{
										if (day == 4){System.out.println ("The current Day is Saturday");}
										else{
											System.out.println ("The current Day is Sunday");
										}
									}
								}
							}	
						}
					}
			}
		}
	}
}