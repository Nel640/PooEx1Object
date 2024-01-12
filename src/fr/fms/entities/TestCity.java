package fr.fms.entities;

public class TestCity 
{
	public static void main(String[] args) 
	{
		City soustons = new City( "soustons" , "france" , 2000 , 1);
//exo1.1		System.out.println("ville n°1 : \n" + city1 + "\n");
//exo1.1		System.out.println("...............................");
		
		City toulouse = new City ( "toulouse" , "france" , 10000 , 1);
//exo1.1		System.out.println("ville n°2 : \n" + toulouse + "\n");
//exo1.1		System.out.println("...............................");
		
		City osaka = new City("osaka", "japan", 500000 , 1);
//exo1.1		System.out.println("ville n°3 : \n" + city3+ "\n");
//exo1.1		System.out.println("...............................");
//exo1.1		
//exo1.1		toulouse.setNbpoeple(20000);
//exo1.1		System.out.println("ville n°2 ajout 20000 hbts : \n" + city2);
//exo1.1		
//exo1.1		System.out.println("...............................");
		
//exo1.2		toulouse.setaddpoeple(2000 , city2);
//exo1.2		System.out.println("...............................");
		
//exo1.2		toulouse.setaddpoeple(-15000, city2);
		
		Unknow1trois unknow1 = new Unknow1trois("toulouse");
//exo1.3		unknow1.display();
//exo1.3		unknow1.getCountry("france");
//exo1.3		System.out.println("...............................");
		unknow1.display();
//exo1.3		System.out.println("...............................");
		unknow1.display2();
//exo1.3		System.out.println("...............................");
//exo1.5 et 1.6		System.out.println(toulouse); // ca appel automatiquement la methode tostring() pour afficher
		
		City.displayCounter();
	}
	

}
