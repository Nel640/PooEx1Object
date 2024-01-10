package fr.Nel.city;

public class City 
{
	public static void main(String[] args) 
	{
		TestCity soustons = new TestCity( "soustons" , "france" , 2000 , 2);
//exo1.1		System.out.println("ville n°1 : \n" + city1 + "\n");
//exo1.1		System.out.println("...............................");
		
		TestCity toulouse = new TestCity ( "toulouse" , "france" , 10000 , 1);
//exo1.1		System.out.println("ville n°2 : \n" + toulouse + "\n");
//exo1.1		System.out.println("...............................");
		
		TestCity osaka = new TestCity("osaka", "japan", 500000 , 1);
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
		
		Unknow unknow1 = new Unknow("toulouse");
//exo1.3		unknow1.display();
//exo1.3		unknow1.getCountry("france");
//exo1.3		System.out.println("...............................");
//exo1.3		unknow1.display();
//exo1.3		System.out.println("...............................");
//exo1.3		unknow1.display2();
//exo1.3		System.out.println("...............................");
//exo1.5 et 1.6		System.out.println(toulouse); // ca appel automatiquement la methode tostring() pour afficher
		
		TestCity.displayCounter();
	}
	

}
