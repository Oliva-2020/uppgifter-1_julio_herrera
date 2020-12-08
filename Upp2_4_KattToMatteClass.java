package uppgift2_4_KattToMatte;

/**
 * @author Julio_Cesar Oliva_Herrera 12/05/2020
 *
 */

class Upp2_4_Matte {
	
	private String name;
	private String pet;
	
	Upp2_4_Matte(String name, String pet) {
		
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

class Upp2_4_Katt {
	
	private String name;
	private String kattowner;
	
	Upp2_4_Katt(String name, String kattower) {
		
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

public class Upp2_4_KattToMatteClass {

	/**
	 * @param args MAIN code.
	 */
	public static void main(String[] args) {
		System.out.println("\"ILU#2.4(ASSOCIATION): The Cat class with an operation that "
				+ " returns a reference to the Matte. :\n");
		
	    Upp2_4_Matte matteObj = new Upp2_4_Matte("'MATTE'", "'CAT'.");
	    System.out.println("Hello I am " + matteObj.getMatteName() + ""
	    		+ " and I have a " + matteObj.getMattPet());
	    
	    Upp2_4_Katt kattObj = new Upp2_4_Katt("'SIGE.'", "...mew, mew,mew...'MATTE'");
	    System.out.println("My cat's name is " + kattObj.getKattName());
	    kattObj.catQuation();
	    kattObj.setKattPet("...mew, mew,mew...'MATTIAS'.");
	    System.out.println("I will ask  to you again."); kattObj.catQuation();
	    	    
	}

}
