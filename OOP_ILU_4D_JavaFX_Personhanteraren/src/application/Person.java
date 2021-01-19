package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
	
	/**
	 * SOLUTION to the problem can not retrieve property.
	 */
//	private final SimpleStringProperty firstName;			// SOURCE TO THE PROBLEM.
	private StringProperty firstName = new SimpleStringProperty();
	public final StringProperty firstNameProperty()	{
		return firstName;
	}
	
	public final String getFirstName() {
		return firstName.get();
	}
	
	public final void SetFirstName(String value) {
		firstName.set(value);
	}
	
	private final SimpleStringProperty lastName;
	private final SimpleStringProperty email;
	
	Person(String fName, String lName, String email) {
	
	this.firstName = new SimpleStringProperty(fName);
	this.lastName = new SimpleStringProperty(lName);
	this.email = new SimpleStringProperty(email);
	
}
	
	public String getFirsName() {		
		return firstName.getName();
	}
	
	public void setFirsName(String fName) {
		this.firstName.setValue(fName);
	}
	
	public String getLastName() {
		return lastName.get();
	}
	
	public void setLastName(String lName) {
		this.lastName.set(lName);
	}
	
	public String getEmail() {
	return email.get();		
}
	public void setEmail (String emailA) {
		email.set(emailA);
	}
}
