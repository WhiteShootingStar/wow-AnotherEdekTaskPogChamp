package enums;

import java.util.Random;

public enum Surname {
	BRANDO("BRANDO"),KUJO("KUJO"), JOESTAR("JOESTAR"), SPEEDWAGON("SPEEDWAGON"), ABDUL("ABDUL"),JOVANNA("JOVANNA"), BUCCARATI("BUCCARATI");

	String surname;

	private Surname(String surn) {
		surname = surn;
	}
	public String getSurname() {
		return surname;
	}
	
	@Override
	public String toString() {
		return surname;
	}
	
	
	public static Surname rand() {
		Random r = new Random();
		return Surname.values()[r.nextInt(Surname.values().length)];
	}
}
