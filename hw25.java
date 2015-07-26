public class hw25
{
	public static String card (int R, int M)
	{
		String [] cardsLegend1 = {"Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		String [] cardsLegend2 = {"Peaks", "Clubs", "Diamonds", "Hearts"};
		if (R >= 6 && R <= 14 && M >= 1 && M <= 4)
		{
			return cardsLegend1[R-6]+" of "+cardsLegend2[M-1];
		}
		return "Nope, There`is no card with such number";
	}
	public static void main (String [] args)
	{
		int r = Integer.parseInt (args[0]);
		int m = Integer.parseInt (args[1]);	
		
		System.out.println (card(r,m));
	}
}