package uppgift2_4_KattToMatte;

/**
 * @author Julio_Cesar Oliva_Herrera
 *
 */
public class MatteClass {
	
	
	private String name;
	private String pet;
	
	MatteClass(String name, String pet) {
		
		this.name = name;
		this.pet = pet;
		
	}
	
	public String getMatteName() {
		
		return this.name;
		
	}
	
	public String getMattPet() {
		
		return this.pet;
				
	}
	
	void setMattPet(String mattePet) {
		
		this.pet = mattePet;
		
	}
	
}
