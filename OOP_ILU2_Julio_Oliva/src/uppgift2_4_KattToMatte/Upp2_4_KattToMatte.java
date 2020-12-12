package uppgift2_4_KattToMatte;

/**
 * @author Julio_Cesar Oliva_Herrera 12/05/2020
 *
 */

public class Upp2_4_KattToMatte {

	/**
	 * @param args MAIN code.
	 */
	public static void main(String[] args) {
		System.out.println("\"ILU#2.4(ASSOCIATION): The Cat class with an operation that "
				+ " returns a reference to the Matte. :\n");
		
	    MatteClass matteObj = new MatteClass("'MATTE'", "'CAT'.");
	    System.out.println("Hello I am " + matteObj.getMatteName() + ""
	    		+ " and I have a " + matteObj.getMattPet());
	    
	    Katt kattObj = new Katt("'SIGE.'", "...mew, mew,mew...'MATTE'");
	    System.out.println("My cat's name is " + kattObj.getKattName());
	    kattObj.catQuation();
	    kattObj.setKattPet("...mew, mew,mew...'MATTIAS'.");
	    System.out.println("I will ask  to you again."); kattObj.catQuation();
	    	    
	}

}
