package enums;
import java.util.Locale;
import java.util.Random;

public enum Nationality {

	Polish(new Locale("pl")), Ukrainian(new Locale("uk")), Belarussian(new Locale("be")), Slovak(
			new Locale("sk")), Lithuanian(new Locale("lt")), Latvian(new Locale("lv")), British(
					new Locale("en")), Indian(
							new Locale("hi")), Chinese(new Locale("zh")), Vietnamese(new Locale("vi"));

	private final Locale loc;

	private Nationality(Locale l) {
		loc = l;
	}

	public Locale getLocale() {
		return loc;
	}
	

	public static Nationality rand() {
		Random r = new Random();
		return Nationality.values()[r.nextInt(Degree.values().length)];
	}
	
}
