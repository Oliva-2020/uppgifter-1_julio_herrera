package uppgift2_3_ClassHusse;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Julio_Cesar Oliva_Herrera 12/03/2020
 *
 */
	
public class Upp2_3_HusseDogs {

	public static void main(String[] args) {
		System.out.println("ILU#2.3(Compositon: One to many relationship): "
				+ "The Husse Class who ower to many dogs: \n");
		
		Dog dogObj1 = new Dog("'LEON'", "a Genman shepherd.", 4);
		Dog dogObj2 = new Dog("'PANTHER'", "a Alaskan Malamute.", 2);
		Dog dogObj3 = new Dog("'SHADOW'", "a Rottweiler.", 3);
		
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(dogObj1);
		dogs.add(dogObj2);
		dogs.add(dogObj3);
		
		Husse husse = new Husse("'HUSSE'.", dogs);
		List<Dog> dos = husse.getTotalHusseDogs();
		
		System.out.println("My name is " + husse.name + "I want to introduce "
				+ "to you my beloved pets:");
		
		for(Dog howner : dos) {
			
			System.out.println("The Dog's name " + howner.name + " is "  + howner.race + " "
					+ "He is " + howner.age + " years old.");
			
		}
				
	}

}
