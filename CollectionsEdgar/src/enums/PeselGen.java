package enums;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class PeselGen {

	public static String generatePes(Date date) {
		LocalDate dat = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int year = dat.getYear() % 100;
		String yearS = null;
		if (year > 9) {
			yearS = "" + year;
		} else
			yearS = "0" + year;

		int month = dat.getMonthValue();
		switch (year / 100) {
		case 18:
			month += 80;
		case 20:
			month += 20;
		case 21:
			month += 40;
		case 22:
			month += 60;
		default:
			month += 0;
		}
		String monthS;
		if (month > 9) {
			monthS = "" + month;
		} else
			monthS = "0" + month;

		int day = dat.getDayOfMonth();
		String dayS;

		if (day > 9) {
			dayS = "" + day;
		} else
			dayS = "0" + day;

		 int[]  arr= {(int)(Math.random()*10),(int)(Math.random()*10),(int)(Math.random()*10),(int)(Math.random()*10),(int)(Math.random()*10)};
		 String otherS="";
		 for(int i=0; i< arr.length;i++) {
			 otherS+=arr[i];
		 }
		String pesel = yearS + monthS + dayS + otherS;
		return pesel;
	}
}
