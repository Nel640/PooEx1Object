package fr.Nel.city;

public class exos1 
{
	public static void main(String[] args) 
	{
		City city1 = new City( "soustons" , "france" , 2000);
		System.out.println("ville n°1 : \n" + city1 + "\n");
		System.out.println("...............................");
		
		City city2 = new City ( "toulouse" , "france" , 10000);
		System.out.println("ville n°2 : \n" + city2 + "\n");
		System.out.println("...............................");
		
		City city3 = new City("osaka", "japan", 500000);
		System.out.println("ville n°3 : \n" + city3+ "\n");
		System.out.println("...............................");
		
		city2.setNbpoeple(20000);
		System.out.println("ville n°2 ajout 20000 hbts : \n" + city2);
		
		System.out.println("...............................");
		
		city2.setaddpoeple(2000 , city2);
		System.out.println("...............................");
		
		city2.setaddpoeple(-1, city2);
		System.out.println("resultat si en <= a zero.......");
		
	}
	

}
