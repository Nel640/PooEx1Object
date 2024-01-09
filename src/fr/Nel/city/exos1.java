package fr.Nel.city;

public class exos1 
{
	public static void main(String[] args) 
	{
		City city1 = new City( "soustons" , "france" , 2000);
		System.out.println(city1 + "\n");
		City city2 = new City ( "toulouse" , "france" , 10000);
		System.out.println(city2 + "\n");
		City city3 = new City("osaka", "japan", 500000);
		System.out.println(city3+ "\n");
		
		city1.setNbpoeple(20000);
		System.out.println(city1);
	}
	

}
