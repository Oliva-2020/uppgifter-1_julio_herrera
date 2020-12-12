package uppgift2_1_ClassHundAndKatt;

/**
 * @author Julio_Cesar Oliva_Herrera   12/05/2020
 *
 */

public class Upp2_1_DogAndCat {

	/**
	 * @param args This is main method or command line.
	 */
	public static void main(String[] args) {
		System.out.println("\"ILU#2.1: The Dog and Cat class with constructor "
				+ " who take care about kind of pet by animal, name and race:\n");
		
		DogClass dogObj = new DogClass("'LEON'.", "a Genman shepherd.");
		
		Cat_Class catObj = new Cat_Class("'TIGER'", "a TABBY cat.");
		
		System.out.println("My first pet was a Dog " + dogObj.getDogRace() + " "
				+ "My Dog's name was" + dogObj.getDogName()
				+ "\nMy second pet was a cat " + catObj.getCatRace() + " "
						+ "My Cat's name was" + catObj.getCatName());

	}

}
