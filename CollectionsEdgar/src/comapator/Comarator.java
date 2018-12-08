package comapator;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

import person.Person;

public class Comarator implements Comparator<Person> {
	Locale loc;

public Comarator(Locale l) {
	loc=l;
}

	@Override
	public int compare(Person o1, Person o2) {
		Collator col = Collator.getInstance(loc);

		if (o1.getSurname().compareTo(o2.getSurname()) != 0) {
			return col.compare(o1.getSurname(), o2.getSurname());
		}
		return col.compare(o1.getName(), o2.getName());
	}

}
