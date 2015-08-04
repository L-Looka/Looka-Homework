class fabrica
{
	public static void monthConsumption (employers [] mass){
		int consumption = 0;
		for (int i = 0; i < employers.getCount(); i++)
		{
			consumption += mass[i].getSalary();
		}
		System.out.println("Total month consumption is "+consumption);
		System.out.println();
		
	}
	public static void printReport (employers [] mass)	{
		for(int i = employers.getCount()-1; i > 0 ; i--)
		{
			for (int j = 0; j < i; j++)
			{
				if (mass[j].getINN() > mass[j+1].getINN())
				{
					employers temp = mass[j];
					mass[j] = mass [j+1];
					mass[j+1]=temp;
				}
			}
		}
		System.out.println("There are such employers in Fabrica ltd: ");
		for(int i = 0 ; i < employers.getCount() ; i++)
		{
			System.out.println (mass[i].getINN() + " "+ mass[i].getSurName()+ " " +mass[i].getName()+ " - " +mass[i].getSalary());
		}
		System.out.println();
	}
	public static void loh (employers [] mass)	{
		for(int i = employers.getCount()-1; i > 0 ; i--)
		{
			for (int j = 0; j < i; j++)
			{
				if (mass[j].getSalary() > mass[j+1].getSalary())
				{
					employers temp = mass[j];
					mass[j] = mass [j+1];
					mass[j+1]=temp;
				}
			}	
		}
		System.out.println("The cheapest eployers is ");
		System.out.println (mass[0].getINN() + " "+ mass[0].getSurName()+ " " +mass[0].getName()+ " - " +mass[0].getSalary());
		for(int i = 1 ; i < employers.getCount() ; i++)
		{
			if (mass[i].getSalary()==mass[0].getSalary())
			{
				System.out.println (mass[i].getINN() + " "+ mass[i].getSurName()+ " " +mass[i].getName()+ " - " +mass[i].getSalary());
			}		
		}
		System.out.println();		
	}
	public static void winner (employers[]mass)	{
		for (int i = employers.getCount()-1; i >0; i--)
		{
			for (int j = 0; j < i; j++)
			{
				if (mass[j].getSalary()<mass[j+1].getSalary())
				{
					employers temp = mass[j];
					mass[j] = mass [j+1];
					mass[j+1] = temp;
				}
			}
		}
		System.out.println("The most expensive eployers is ");
		System.out.println (mass[0].getINN() + " "+ mass[0].getSurName()+ " " +mass[0].getName()+ " - " +mass[0].getSalary());
		for (int i = 1; i < employers.getCount(); i ++)
		{
			if (mass[i].getSalary() == mass[0].getSalary())
			{
				System.out.println (mass[i].getINN() + " "+ mass[i].getSurName()+ " " +mass[i].getName()+ " - " +mass[i].getSalary());
			}
		}
		System.out.println();
	}
	
	public static void main (String[]args)
	{
		employers e1 = new employers("Glebus", "Gleb", 1000);
		employers e2 = new employers("Brus", "Andrey", 900);
		employers e3 = new employers("Olechka", "Olga", 800);
		employers e4 = new employers("Pashkovskiy","Nikolay", 900);
		employers e5 = new employers("Monks","Ron",700);
		employers e6 = new employers("English","Woman", 700);
		employers e7 = new employers("Front","End", 900);
		employers e8 = new employers("Ivanov","Ivan", 100);
		employers e9 = new employers("Hiden","BigBoss", 2000);
		employers e10 = new employers("Petrov","Petr", 100);
		
		employers [] empMass = new employers [employers.getCount()];
		empMass[0]=e1;
		empMass[1]=e2;
		empMass[2]=e3;
		empMass[3]=e4;
		empMass[4]=e5;
		empMass[5]=e6;
		empMass[6]=e7;
		empMass[7]=e8;
		empMass[8]=e9;
		empMass[9]=e10;
		
		printReport(empMass);
		monthConsumption(empMass);
		loh(empMass);
		winner(empMass);
	}
}