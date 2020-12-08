package uppgift2_2_ClassMatte;

/**
 * @author Julio_Cesar Oliva_Herrera   12/01/2020
 *
 */

class CatClass {
	
	String catName;	
	String catRace;
	String catOwner;
	
	CatClass(String name, String race, String catOwner) {
		this.catName = name;
		this.catRace = race;
		this.catOwner = catOwner;
		
	}
	
}

class Matte extends CatClass {
	
	String MatteName;
	String MattePet;
	Matte(String name, String pet, String catname, String catrace, String catower) {
		
		super(catname, catrace, catower);
		this.MatteName = name;
		this.MattePet = pet;
		
	}
	
}

public class Upp2_2_ClassMatteMain {

	/**
	 * Here I will run the main code
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("\"ILU#2.2: The Matte and Cat class with constructor "
				+ " who take care about Matte name and Cat as object:\n");
		
		Matte owner = new Matte("MATTIAS.","'KATT.'", "'SIGE'.", "a BENGAL cat.", "'MATTE'");
		System.out.println("Mattes full name is " + owner.MatteName + " " + ""
				+ "He has a " + owner.MattePet
				+ "\nHis pet cat name is " + owner.catName + " SIGE race is " + owner.catRace);
		
		CatClass MattesPet = new CatClass("'SIGE'", "a TABBY cat.", "'MATTE.'");
		System.out.println(MattesPet.catName + " likes very much " + MattesPet.catOwner);

	}

}
