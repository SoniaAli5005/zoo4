package zooExercise;

public class Parrot extends Birds implements Sounds{

	//////////Attributes///////////////
	String colourfulFeathers;
	
	////////////Constructors///////////
	public Parrot(String vColourfulFeathers,int vWingSpan, String vType, String vName, String vSpecies, String vGender, int vWeight, int vAge) {
		super (vWingSpan, vType, vName, vSpecies, vGender, vWeight, vAge);
		this.colourfulFeathers = vColourfulFeathers;
	}
	public String getFluffyFeathers() {
		return colourfulFeathers;
	}
	public void setStiffFeathers(String colourfulFeathers) {
		this.colourfulFeathers = colourfulFeathers;
	}
		
	//////////////Methods//////////////
		
	public String sound() {
		return "Roll Call! Meow Meow Schreeeech!Schreeeech!Schreeeech! Woof!Woof!";
	}
}
