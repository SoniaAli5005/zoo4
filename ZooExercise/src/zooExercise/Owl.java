package zooExercise;

public class Owl extends Birds implements Sounds {

	//////////Attributes///////////////
	String fluffyFeathers;
	
	////////////Constructors///////////
	public Owl(String vFluffyFeathers,int vWingSpan, String vType, String vName, String vSpecies, String vGender, int vWeight, int vAge) {
		super (vWingSpan, vType, vName, vSpecies, vGender, vWeight, vAge);
		this.fluffyFeathers = vFluffyFeathers;
	}
	public String getFluffyFeathers() {
		return fluffyFeathers;
	}
	public void setStiffFeathers(String fluffyFeathers) {
		this.fluffyFeathers = fluffyFeathers;
	}
		
	//////////////Methods//////////////
		
	public String sound() {
		return "Hoot";
	}
}
