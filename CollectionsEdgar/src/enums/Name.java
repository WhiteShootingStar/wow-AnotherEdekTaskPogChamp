package enums;

import java.util.Random;

public enum Name{
	JONATHAN("JONATHAN"),JOTARO("JOTARO"), JOESEF("JOESEF"), GIORNO("GIORNO"), ABDUL("ABDUL"),BRUNO("BRUNO"),POŁNAREFF("POŁNAREFF");

	String name;

	private Name(String surn) {
		name = surn;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	
	public static Name rand() {
		Random r = new Random();
		return Name.values()[r.nextInt(Name.values().length)];
	}
}
