package fr.Nel.city;

public class TestCity {
		
	public String city;
	public String country;
	public int numberPoeple;
	
	public TestCity ( String city , String country , int numberPoeple)
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
		if (numpoeple < getNbpoeple() )
		{
			System.out.println("action impossible , on ne peut retirer d'habitants ");
			System.out.println("resultat test si nombre saisi <= a zero.......");
		}
		else
		{
			setNbpoeple(nbpoeple);
			System.out.println("ajout de :" + nbpoeple + " personnes a " +  getCity() + "\n");
			setObjectCity(city);
		}
	}
//exo 1.3
//	public String toString()
//	{
//		return  "city : " + this.city + "\n" +
//				"country : " + this.country + "\n" +
//				"nombre d'habitant : " + this.numberPoeple;
//	}
	public String toString()
	{
		return "Syso : ville de " + this.city + " a un nombre de " + this.numberPoeple + " habitants";
	}
}
