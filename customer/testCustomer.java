class testCustomer {	
	public static void poucherWhithCreditCard (customer [] mass, String a, String b){
		System.out.println("Customers that have the Credit card between " + a + " and " + b + " is: ");
		for (int i = 0; i < customer.getCount() ; i++){ //Function is separate CardNamber into 2 parts and compare this parts separate
			String x = mass[i].getCreditCardNumber();
			String y = mass[i].getCreditCardNumber();
			x = x.substring(10,14);
			y = y.substring(15);
			String x1 = a.substring(10,14);
			String y1 = a.substring(15);
			String x2 = b.substring(10,14);
			String y2 = b.substring(15);
			int xx = Integer.parseInt (x);
			int yy = Integer.parseInt (y);
			int xx1 = Integer.parseInt (x1);
			int xx2 = Integer.parseInt (x2);
			int yy1 = Integer.parseInt (y1);
			int yy2 = Integer.parseInt (y2);
			
			if (xx >= xx1 && xx <= xx2)
			{		
				if(xx==xx1) 
				{
					if(yy>=yy1)
					{
						System.out.println("--- "+mass[i].getLastName()+" "+ mass[i].getFirstName()+" "+ mass[i].getMiddleName());
					}						
				}else if (xx==xx2)
				{
					if(yy<=yy2)
					{
						System.out.println("--- "+mass[i].getLastName()+" "+ mass[i].getFirstName()+" "+ mass[i].getMiddleName());
					}		
				}else
				{
					System.out.println("--- "+mass[i].getLastName()+" "+ mass[i].getFirstName()+" "+ mass[i].getMiddleName());
				}
			}
		}
		System.out.println();
	}
	public static void bestCustomer (customer[]mass, double a){
		System.out.println("Customers that buy more that " + a +" is: ");
		for (int i =0; i <customer.getCount(); i++)
		{
			if (mass[i].getSumPurchases() > a)
			{
				System.out.println("--- "+mass[i].getLastName()+" "+ mass[i].getFirstName()+" "+ mass[i].getMiddleName());
			}
		}
		System.out.println();
	}
	
	public static void main (String args[]){			
		customer c1 = new customer ("Ivanov", "Alex", "Yourikovich", "0562 5888 0566 5688", 65859587);	
		c1.setSumPurchases(560);
		customer c2 = new customer ("Laz", "Alexandr", "Yourievich", "0562 5888 0566 4587", 63489587);		
		c2.setSumPurchases(600);
		customer c3 = new customer ("Solodka", "Julia", "Alexandrovna", "0562 5888 5665 0000", 63489586);
		c3.setSumPurchases(700);
		customer c4 = new customer ("Solka", "Lia", "Drovna", "0562 5888 5555 5000", 63465896);
		c4.setSumPurchases(150000);
		customer c5 = new customer ("Lodka", "Jina", "Petrovna", "0562 5888 5689 0000", 63489599);
		c5.setSumPurchases (10);
		c5.setSumPurchases (150.5);		
		
		c1.printCustomer();
		c2.printCustomer();
		c3.printCustomer();
		c4.printCustomer();
		c5.printCustomer();
		
		customer [] custMassiv = new customer [customer.getCount()];
		custMassiv[0] = c1; 
		custMassiv[1] = c2; 
		custMassiv[2] = c3; 
		custMassiv[3] = c4;
		custMassiv[4] = c5; 
		
		poucherWhithCreditCard(custMassiv, "0562 5888 0566 5688", "0562 5888 5689 0000" ); // It must print 4 customers
		bestCustomer (custMassiv, 600); // it must print 2 customers
	}
}