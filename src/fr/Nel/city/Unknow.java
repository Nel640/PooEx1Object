package fr.Nel.city;

public class Unknow 
{
	public String city;
	public String country;
	public int resident;
	
	public Unknow ( String city )
	{
		this.city = city;
		this.country = "unknow";
		this.resident = resident;
	}
	
	public Unknow()
	{
		this("unknow");
	}
	
	public void display()
	{
		System.out.println( "city : " + this.city + "\n" +
							"type : " + country + "\n" +
							"resident : " + this.resident);
	}
}
