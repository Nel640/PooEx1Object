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
	
	public int getNbpoeple()
	{
		return numberPoeple;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public int setNbpoeple(int addpoeple)
	{
		return this.numberPoeple = getNbpoeple() + addpoeple;
	}
	
	public void setObjectCity ( Object city)
	{
		System.out.println("nouvelles valeurs : \n" + city);
	}
	
	public void setaddpoeple(int nbpoeple , Object city)
	{
		int numpoeple = getNbpoeple() + nbpoeple;
		if (numpoeple <= 0 )
		{
			System.out.println("action impossible pas de nombre en dessous ou egale a zero");
		}
		else
		{
			setNbpoeple(nbpoeple);
			System.out.println("ajout de :" + nbpoeple + " personnes a " +  getCity() + "\n");
			setObjectCity(city);
		}
	}
	
	public String toString()
	{
		return  "city : " + this.city + "\n" +
				"country : " + this.country + "\n" +
				"nombre d'habitant : " + this.numberPoeple;
	}
}
