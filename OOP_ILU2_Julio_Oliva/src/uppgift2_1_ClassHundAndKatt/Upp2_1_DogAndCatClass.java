package uppgift2_1_ClassHundAndKatt;

/**
 * @author Julio_Cesar Oliva_Herrera   12/05/2020
 *
 */

class DogClass {
	
	private String name;
	private String race;
	
	DogClass(String name, String race) {
		
		this.name = name;
		this.race = race;
		
	}
		
	public String getDogName() {
		
		return this.name;
		
	}
	
	public String getDogRace() {
		
		return this.race;
		
	}
		
}

class CatClass {
	
	private String name;
	private String race;
	
	CatClass(String name, String race) {
		
		this.name = name;
		this.race = race;
		
	}
	
	public String getCatName() {
		
		return this.name;
		
	}
	
	public String getCatRace() {
		
		return this.race;
		
	}
		
}

public class Upp2_1_DogAndCatClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("\"ILU#2.1: The Dog and Cat class with constructor "
				+ " who take care about kind of pet by animal, name and race:\n");
		
		DogClass dogObj = new DogClass("'LEON'.", "a Genman shepherd.");
		
		CatClass catObj = new CatClass("'TIGER'", "a TABBY cat.");
		
		System.out.println("My first pet was a Dog " + dogObj.getDogRace() + " "
				+ "My Dog's name was" + dogObj.getDogName()
				+ "\nMy second pet was a cat " + catObj.getCatRace() + " "
						+ "My Cat's name was" + catObj.getCatName());

	}

}
