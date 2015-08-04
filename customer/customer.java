public class customer
{
	private String [] custMas = new String[7];
	static private int count ;
	private int id;
	private String lastName;
	private String firstName;	
	private String middleName;
	private double sumPurchases;
	private String creditCardNumber;
	private int bankAccount;
	
	public customer (String lastName, String firstName, String middleName){
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		count++;
		id = count;
	}
	public customer (String lastName, String firstName, String middleName, String creditCardNumber, int bankAccount){
		this(lastName, firstName, middleName);
		this.creditCardNumber = creditCardNumber;
		this.bankAccount = bankAccount;
	}
	public customer (){
		count++;
		id = count;
	}

	public static int getCount ()	{
		return count;
	}
	public int getId ()	{
		return id;
	}
	
	public void setFirstName (String firstName)	{
		this.firstName = firstName;
	
	}
	public String getFirstName ()	{
		return firstName;
	}
	
	public void setLastName (String lastName) {
		this.lastName = lastName;
	}
	public String getLastName (){
		return lastName;
	}
	
	public void setMiddleName (String middleName){
		this.middleName = middleName;
//		toMas ();
	}
	public String getMiddleName (){
		return middleName;
	}
	
	public void setSumPurchases (double sumPurchases){
		this.sumPurchases += sumPurchases;
	}
	public double getSumPurchases (){
		return sumPurchases;
	}
	
	public void setCreditCardNumber (String creditCardNumber){
		this.creditCardNumber = creditCardNumber;
	}
	public String getCreditCardNumber (){
		return creditCardNumber;
	}
	
	public void setBankAccount (int bankAccount){
		this.bankAccount = bankAccount;
	//	toMas ();
	}
	public int getBankAccount (){
		return bankAccount;
	}
	
	public void printCustomer (){
		System.out.println ("ID Number: " + id);
		System.out.println ("Full Name: " + lastName + " " + firstName + " " + middleName);	
		System.out.println ("The total value of purchases: " + sumPurchases);
		System.out.println ("Credit Card Number: " + creditCardNumber);
		System.out.println ("Bank Account: " + bankAccount);
		System.out.println ();
	}
}