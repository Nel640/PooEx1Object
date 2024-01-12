package fr.Nel.city;

public class TestPerson {

	public static void main(String[] args) {
		Person manu = new Person("Manu" , "macron" , 78 , "champs elizee" , new TestCity("Amiens", "France" , 0 , 1));
		Person puti = new Person("putine" , "vlad" , 68);
		Person biden = new Person("biden" , "joe");
		
		System.out.println(manu);
		System.out.println(puti);
		System.out.println(biden);
	}

}
