package enums;

import java.util.Random;



public enum Degree {
	dr, dr_inz, mgr, prof;
	
	
	public static Degree rand() {
		Random r = new Random();
		return Degree.values()[r.nextInt(Degree.values().length)];
	}
}
