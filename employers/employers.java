package fabrica;

public class Employers implements Comparable <Employers>
{
	private int INN;
	private String name;
	private String surName;
	private int salary;
	
	public Employers (int INN, String surName, String name){
		this.name = name;
		this.surName = surName;
		this.INN = INN;
	}
	public Employers (int INN, String surName, String name, int salary){
		this(INN, surName, name);
		this.salary = salary;
	}
	public Employers(){
	}
	public void setINN (int INN){
		this.INN = INN;
	}
	public int getINN () {
		return INN;
	} 
	
	public void setName (String name)	{
		this.name = name;
	}
	public String getName ()	{
		return name;
	}
	
	public void setSurName (String surName)	{
		this.surName = surName;
	}
	public String getSurName ()	{
		return surName;
	}
	
	public void setSalary (int salary)	{
		this.salary = salary;
	}
	public int getSalary ()	{
		return salary;
	}
	
	public int compareTo(Employers o) {
		if (INN < o.INN)
		{
			return -1;
		} 
		else if (INN > o.INN)
		{
			return 1;
		}
		return 0;
	}
}