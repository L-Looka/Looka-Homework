class hw28{
	public static void main (String []args){
		int d = Integer.parseInt (args[0]);
		int m = Integer.parseInt (args[1]);
		switch (m){
			case 1: if(d>=20){
					System.out.println ("This is Aquarius");
				} else {
					System.out.println ("This is Capricorn");
				}; break;
			case 2: if (d>=19){
					System.out.println ("This is Fish");
				} else{
					System.out.println ("This is Aquarius");
				}; break;
			case 3: if (d>=21){
					System.out.println ("This is Aries");
				} else{ 
					System.out.println ("This is Fish");
				}; break;
			case 4: if (d>=20){
					System.out.println ("This is Taurus");
				}else{
					System.out.println ("This is Aries");
				}; break;
			case 5: if (d>=21){
					System.out.println ("This is Twins");
				}else{
					System.out.println ("This is Taurus");
				}; break;
			case 6: if (d>=22){
					System.out.println ("This is Cancer");
				}else{
					System.out.println ("This is Twins");
				};break;
			case 7: if (d>=23){
					System.out.println ("This is Lion");
				}else{
					System.out.println ("This is Cancer");
				};break;
			case 8: if(d>=23){
					System.out.println ("This is Virgin");
				}else{
					System.out.println ("This is Lion");
				};break;
			case 9: if(d>=23){
					System.out.println ("This is Libra");
				}else{
					System.out.println ("This is Virgin");
				};break;
			case 10: if(d>=23){
					System.out.println ("This is Scorpion");
				}else{
					System.out.println ("This is Libra");
				}; break;
			case 11: if(d>=23){
					System.out.println ("This is Sagittarius");
				}else{
					System.out.println ("This is Scorpion");
				}; break;
			case 12: if(d>=22){
					System.out.println ("This is Capricorn");
				}else{
					System.out.println ("This is Sagittarius");
				}; break;
		}
		
	}
}
  