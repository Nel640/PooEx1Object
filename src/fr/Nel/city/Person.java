package fr.Nel.city;

public class Person 
{
	String firstName;
	String lastName;
	int age;
	String adress;
	TestCity location;
	
	final int Unknow_AGE = 0;
	
	public Person ( String fisrtName , String lastName , int age , String adress , Object location )
	{
		this.firstName = fisrtName;
		this.lastName = lastName;
		this.age = age;
		this.adress = adress;
		this.location = (TestCity) location;
	}
	
	public Person ( String firstName , String lastName , int age)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.adress = "unknow";
	}
	
	public Person ( String firstName , String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = Unknow_AGE;
		this.adress = "unknow";
	}

	
	public String toString()
	{
		return "LastName = " + lastName +
			   " , FirstName = "+ firstName +
			   " , age = " + age +
			   " , adress = " + adress +
			   this.location;
			   
	}
}

