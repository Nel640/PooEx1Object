package fr.Nel.city;

public class City {
		
	public String city;
	public String country;
	public int numberPoeple;
	
	public City ( String city , String country , int numberPoeple)
	{
		this.city = city;
		this.country = country;
		this.numberPoeple = numberPoeple;
	}
	
	public String toString()
	{
		return  "city : " + this.city + "\n" +
				"country : " + this.country + "\n" +
				"nombre d'habitant : " + this.numberPoeple;
	}
	
	public int getNbpoeple()
	{
		return numberPoeple;
	}
	
	public int setNbpoeple(int addpoeple)
	{
		return this.numberPoeple = getNbpoeple() + addpoeple;
	}
}
