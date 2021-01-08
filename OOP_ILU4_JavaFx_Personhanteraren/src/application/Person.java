package application;

import javafx.beans.property.SimpleStringProperty;

public class Person {
	
	private final SimpleStringProperty firstName;
	private final SimpleStringProperty lastName;
	private int age;
	
	private Person(String fName, String lName, int aGe) {
		
		this.firstName = new SimpleStringProperty(fName);
		this.lastName = new SimpleStringProperty(lName);
		this.age = aGe;
		
	}
	
	/**
	 * 
	 * @return First name.
	 */
	public String getFirsName() {
		return firstName.get();		
	}
	
	public void setFirsName(String fName) {
		firstName.set(fName);
	}
	
	/**
	 * Last name.
	 */
	public String getLastName() {
		return lastName.get();	
	}
	
	public void setLastName(String lName) {
		lastName.set(lName);
	}
	
	public int getAge() {
		return age;		
	}
	
	public void setAge (int aGe) {
		this.age = aGe;
	}
}
