package uppgift2_1_ClassHundAndKatt;

/**
 * @author Julio_Cesar Oliva_Herrera
 *
 */
public class Cat_Class {

	private String name;
	private String race;
	
	Cat_Class(String name, String race) {
		
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
