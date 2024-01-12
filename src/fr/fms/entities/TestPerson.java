package fr.fms.entities;

public class TestPerson {

	public static void main(String[] args) {
//		ArrayList<Object> personalitys = new ArrayList<Object>();
		
		Person manu = new Person("Manu" , "macron" , 78 , "champs elizee paris" , new City("Amiens", "France" , 0 , 1));
		Person sarko = new Person("Nico" , "sarko" , 66 , "habitant paris" , new City("paris", "France" , 200000 , 1));
		Person boris = new Person("Boris" , "jhonson" , 56 , "habitant downing street a london" , new City("new york", "usa" , 0 , 1));
		Person gege = new Person("Gerard" , "depardieu" , 72 , "habitant moscow" , new City("chateauroux", "France" , 0 , 1));
		Person lenny = new Person("Lenny" , "kravitz" , 56 , "champs hotel particulier a paris" , new City("new york", "usa" , 0 , 1));
		Person jenny = new Person("Jenny" , "lawrence" , 30 , "habitant louisville au usa" , new City("indiana hills", "usa" , 0 , 1));
		
//		Person puti = new Person("putine" , "vlad" , 68);
//		Person biden = new Person("biden" , "joe");
		
//		System.out.println(manu);
//		System.out.println(puti);
//		System.out.println(biden);

		Person.addPerson(manu);
		Person.addPerson(sarko);
		Person.addPerson(boris);
		Person.addPerson(gege);
		Person.addPerson(lenny);
		Person.addPerson(jenny);
		
		Person.displaySortCityandBorncity();
	}
}
