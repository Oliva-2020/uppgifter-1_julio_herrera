package uppgift2_1_ClassHundAndKatt;

/**
 * @author Julio_Cesar Oliva_Herrera
 *
 */
public class DogClass {
	
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
