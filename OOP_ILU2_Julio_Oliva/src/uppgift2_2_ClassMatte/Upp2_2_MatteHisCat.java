package uppgift2_2_ClassMatte;

/**
 * @author Julio_Cesar Oliva_Herrera   12/01/2020
 *
 */

public class Upp2_2_MatteHisCat {

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
		
		Cat MattesPet = new Cat("'SIGE'", "a TABBY cat.", "'MATTE.'");
		System.out.println(MattesPet.catName + " likes very much " + MattesPet.catOwner);

	}

}
