package fr.Nel.city;

public class Unknow 
{
	public String city;
	public String country;
	public int resident;
	
	private int Number_Of_Resident = 530000;
	public Unknow ( String city )
	{
		this.city = city;
		this.country = "unknow";
		this.resident = Number_Of_Resident;
	}
	
	public Unknow()
	{
		this("unknow");
	}
	
	public String getCountry(String country) 
	{
		return this.country = country;
	}
	
	public void display()
	{
		System.out.println( "city : " + this.city + "\n" +
							"type : " + country + "\n" +
							"resident : " + this.resident);
	}
}
