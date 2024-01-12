package fr.fms.entities;

public class Unknow1trois 
{
	public String city;
	public String country;
	public int resident;
	
	private int Number_Of_Resident = 530000;
	
	public Unknow1trois ( String city )
	{
		this.city = city;
		this.country = "unknow";
		this.resident = Number_Of_Resident;
	}
	
	public Unknow1trois()
	{
		this("unknow");
	}
	
	public String getCountry(String country) 
	{
		return this.country = country;
	}
	
	public void display()
	{
		System.out.println( "ville : " + this.city + "\n" +
							"pays : " + country + "\n" +
							"nombre d'habitants : " + this.resident);
	}
	// exo 1.4
	public void display2 ()
	{
		System.out.println("Display : ville de " + this.city + " a un nombre de " + this.resident + " habitants");
	}
}
