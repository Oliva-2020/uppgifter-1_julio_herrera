package uppgift2_3_ClassHusse;

import java.util.List;

/**
 * @author julio
 *
 */
public class Husse {
	
	
	public String name;
	private final List<Dog> dogs;
	
	Husse (String name, List<Dog> dogs) {
		
		this.dogs = dogs;
		
		this.name = name;
		
	}
	
	public List<Dog> getTotalHusseDogs() {
	
	return dogs;
	
	}
	
}
