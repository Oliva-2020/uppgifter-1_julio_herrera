package application;

public class Person {
	
	private int id;
	private String name;
	
	private Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;		
	}
	
	public void setId(int ID) {
		this.id = ID;
	}
	
	public String getName() {
		return name;	
	}
	
	@Override
	public String toString() {
		return "id: " + id + " - " + "name: " + name;
	}
	
}