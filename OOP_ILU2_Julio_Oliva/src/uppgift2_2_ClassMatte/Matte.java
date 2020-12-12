package uppgift2_2_ClassMatte;

/**
 * @author Julie_Cesar Oliva_Herrera   12/11/2020
 *
 */
public class Matte extends Cat {
	
	String MatteName;
	String MattePet;
	Matte(String name, String pet, String catname, String catrace, String catower) {
		
		super(catname, catrace, catower);
		this.MatteName = name;
		this.MattePet = pet;
		
	}
	
}
