package uppgift2_4_KattToMatte;

/**
 * @author Julio_Cesar Oliva_Herrera   12/11/2020
 *
 */
public class Katt {
	
	
	private String name;
	private String kattowner;
	
	Katt(String name, String kattower) {
		
		this.name = name;
		this.kattowner = kattower;
		
	}
	
	void catQuation() {
		
		System.out.println("Hello Cat who is your Owner? \n" + kattowner);
		
	}
	
	public String getKattName() {
		
		
		return this.name;
		
	}
	
	public String getKattOwner() {
		
		return kattowner;
		
	}
	
	void setKattPet(String kattOwner) {
		
		this.kattowner = kattOwner;
		
	}
	
}
