package student;

public class Student  
{
	private int INN;
	private String name;
	private String surName;
	
	public Student () {
		}
	public Student (int INN, String surName, String name) {
		this.INN = INN;
		this.surName = surName;
		this.name = name;
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
	
}