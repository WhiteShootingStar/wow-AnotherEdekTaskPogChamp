package enums;

import java.util.Calendar;
import java.util.Date;

public class DateGen {
	public static Date generate() {
		Calendar cal = Calendar.getInstance();

		int year = randBetween(1900, 2018);

		cal.set(Calendar.YEAR, year);

		int dayOfYear = randBetween(1, cal.getActualMaximum(Calendar.DAY_OF_YEAR));

		cal.set(Calendar.DAY_OF_YEAR, dayOfYear);

		int mounth = randBetween(1, 12);
		cal.set(Calendar.MONTH, mounth);
		Date res = cal.getTime();
		return res;
	}

	public static int randBetween(int start, int end) {
		return start + (int) Math.round(Math.random() * (end - start));
	}
}
