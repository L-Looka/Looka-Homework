package fabrica;

public class Manager extends Employers 
{
	private int bonus;
	

	public Manager (int INN, String surName, String name){
		super (INN, surName,name);
	}
	public Manager (int INN, String surName, String name, int salary){
		super (INN, surName,name, salary);
	}
	public Manager (int INN, String surName, String name, int salary, int bonus){
		super (INN, surName,name,salary);
		this.bonus = bonus;
	}
	public Manager(){
	}
	
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public int getSalary ()	{
	    int sal = super.getSalary() + bonus;
		return sal;
	}
}
