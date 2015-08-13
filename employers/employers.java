public class employers
{
	static private int count;
	private int INN;
	private String name;
	private String surName;
	private int salary;
	
	public employers (String surName, String name){
		this.name = name;
		this.surName = surName;
		count++;
		INN = count;
	}
	public employers (String surName, String name, int salary){
		this(surName, name);
		this.salary = salary;
	}
	public employers(){
	}
	
	public static int getCount () {
		return count;
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
}