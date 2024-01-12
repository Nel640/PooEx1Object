package fr.Nel.city;

public class Person 
{
	String firstName;
	String lastName;
	int age;
	String adress;
	
	final int Unknow_AGE = 0;
	
	public Person ( String fisrtName , String lastName , int age , String adress )
	{
		this.firstName = fisrtName;
		this.lastName = lastName;
		this.age = age;
		this.adress = adress;
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
	
	public Person ()
	{
		this("unknow" , "unknow" , 0 , "unknow");
	}
	
	public String toString()
	{
		return "LastName = " + lastName +
			   " , FirstName = "+ firstName +
			   " , age = " + age +
			   " , adress = " + adress;
			   
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		if( firstName.equals(""))
		{
			this.firstName = "unknow";
		}
		else 
		{
			this.firstName = firstName;
		}
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		if( lastName.equals(""))
		{
			this.lastName = "unknow";
		}
		else 
		{
			this.lastName = lastName;
		}
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getAdress() {
		return adress;
	}



	public void setAdress(String adress) {
		if( adress.equals(""))
		{
			this.adress = "unknow";
		}
		else 
		{
			this.adress = adress;
		}
	}
	
}

