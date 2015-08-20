package fabrica;

import java.util.*;


class Fabrica
{
	public static void monthConsumption (ArrayList <Employers> mass){
		int consumption = 0;
		for (int i = 0; i < 10; i++)
		{
			consumption += mass.get(i).getSalary();
		}
		System.out.println("Total month consumption is "+consumption);
		System.out.println();
	}
	public static void printByName (ArrayList <Employers> massList){
		Employers [] mass = new Employers[massList.size()];
		massList.toArray (mass);
		Arrays.sort(mass, new NameComparator());
		System.out.println("Sort by SurName + Name: ");
		for(int i = 0 ; i < 10 ; i++)
		{
			System.out.println ( mass[i].getSurName()+ " " +mass[i].getName());
		}
		System.out.println();
	}
	public static void printReport (ArrayList <Employers> massList)	{
		Employers [] mass = new Employers [massList.size()];
		massList.toArray (mass);
		Arrays.sort(mass);
		System.out.println("There are such employees in Fabrica ltd: ");
		for(int i = 0 ; i < 10 ; i++)
		{
			System.out.println (mass[i].getINN() + " "+ mass[i].getSurName()+ " " +mass[i].getName()+ " - " +mass[i].getSalary());
		}
		System.out.println();
	}
	public static void loh (ArrayList <Employers> massList)	{
		Employers [] mass = new Employers [massList.size()];
		massList.toArray(mass);
		Arrays.sort(mass, new SalaryUpComparator());
		System.out.println("The cheapest eployee(s) is(are) ");
		int i = 0;
		do 
		{
			
			if (mass[i].getSalary()==mass[0].getSalary())
			{
				System.out.println (mass[i].getINN() + " "+ mass[i].getSurName()+ " " +mass[i].getName()+ " - " +mass[i].getSalary());
			}	
			i++;			
		}
		while (i<10);
		System.out.println();		
	}
	public static void winner (ArrayList <Employers> massList)	{
		Employers [] mass = new Employers [massList.size()];
		massList.toArray(mass);
		Arrays.sort(mass, new SalaryDownComparator());
		System.out.println("The most expensive eployee(s) is(are) ");
		int i = 0;
		do
		{
			if (mass[i].getSalary() == mass[0].getSalary())
			{
				System.out.println (mass[i].getINN() + " "+ mass[i].getSurName()+ " " +mass[i].getName()+ " - " +mass[i].getSalary());
			}
			i++;
		}
		while (i<10);
		System.out.println();
	}
	public static void main (String[]args)
	{
		Employers e1 = new Employers(1,"Glebus", "Gleb", 1000);
		Employers e2 = new Employers(2,"Brus", "Andrey", 900);
		Employers e3 = new Employers(3,"Olechka", "Olga", 800);
		Employers e4 = new Employers(4,"Pashkovskiy","Nikolay", 900);
		Employers e5 = new Employers(5,"Monks","Ron",700);
		Employers e6 = new Employers(6,"English","Woman", 700);
		Employers m1 = new Manager(7,"Front","End", 900,1);
		Employers e7 = new Employers(8,"Ivanov","Ivan", 100);
		Employers e8 = new Employers(9,"Hiden","BigBoss", 2000);
		Manager m2 = new Manager(10,"Pashkovskiy","Artem", 99,1);
		
		ArrayList <Employers> empMass = new ArrayList <Employers>();
		empMass.add(e1);
		empMass.add(e2);
		empMass.add(e3);
		empMass.add(e4);
		empMass.add(e5);
		empMass.add(e6);
		empMass.add(e7);
		empMass.add(e8);
		empMass.add(m1);
		empMass.add(m2);
		
		printReport(empMass);
		monthConsumption(empMass);
		loh(empMass);
		winner(empMass);
		printByName(empMass);
	}
}