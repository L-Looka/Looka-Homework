class hw26{
	public static void main (String []args){
		int num = Integer.parseInt (args[0]);
		int num100 = num/100;
		int num10 = (num/10)%10;
		int num1 = num%10;
		String num100Name = "сотые";
		String num10Name = "десятые";
		String num1Name = "последние";
			switch (num100){
			case 0: num100Name = ""; break;
			case 1: num100Name = "one"; break;
			case 2: num100Name = "two"; break;
			case 3: num100Name = "three"; break;
			case 4: num100Name = "four"; break;
			case 5: num100Name = "five"; break;
			case 6: num100Name = "six"; break;
			case 7: num100Name = "seven"; break;
			case 8: num100Name = "eight"; break;
			case 9: num100Name = "nine"; break;
			}
			System.out.print (num100Name+" hundred");
		if (num10==1){
			switch (num1){
				case 0: num10Name = "ten"; break;
				case 1: num10Name = "eleven"; break;
				case 2: num10Name = "twelve"; break;
				case 3: num10Name = "thirteen"; break;
				case 4: num10Name = "fourteen"; break;
				case 5: num10Name = "fifteen"; break;
				case 6: num10Name = "sixteen"; break;
				case 7: num10Name = "seventeen"; break;
				case 8: num10Name = "eighteen"; break;
				case 9: num10Name = "nineteen"; break;
			} 
		System.out.print (" and " + num10Name);	
		}else if ( num10==0 && num1==0){
			System.out.println (" ");
		}else{
			switch (num10){
				case 0: num10Name = ""; break;
				case 2: num10Name = " twenty"; break;
				case 3: num10Name = " thirty"; break;
				case 4: num10Name = " forty"; break;
				case 5: num10Name = " fifty"; break;
				case 6: num10Name = " sixty"; break;
				case 7: num10Name = " seventy"; break;
				case 8: num10Name = " eighty"; break;
				case 9: num10Name = " ninety"; break;
			}
			System.out.print (" and" + num10Name);
			switch (num1){
				case 0: num1Name = ""; break;
				case 1: num1Name = " one"; break;
				case 2: num1Name = " two"; break;
				case 3: num1Name = " tree"; break;
				case 4: num1Name = " four"; break;
				case 5: num1Name = " five"; break;
				case 6: num1Name = " six"; break;
				case 7: num1Name = " seven"; break;
				case 8: num1Name = " eight"; break;
				case 9: num1Name = " nine"; break;
			}
			System.out.println (num1Name);
		}
	}
}