package stroing;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.stream.Collectors;

import comapator.Comarator;
import enums.Nationality;
import person.Person;

public class Persons {

	static TreeSet<Person> set = new TreeSet<>();
	static List<Person> l = null;

	public static void addPerson(Person st) {
		set.add(st);
		l = new ArrayList<>(set);
	}

	public static void removePerson(Person st) {
		set.remove(st);
		l = new ArrayList<>(set);
	}

	public static void sortLocale() {

		Collections.sort(l, new Comarator(new Locale("pl")));
	}

	public static List<Person> filterLoc(List<Person> list, Nationality nat) {
		List<Person> temp = list.stream().filter(e -> e.getNationality().equals(nat)).collect(Collectors.toList());
		Collator col = Collator.getInstance(nat.getLocale());
		temp.sort(col);
		return temp;
	}

	public static TreeSet<Person> getSet() {
		return set;
	}

	public static void setSet(TreeSet<Person> set) {
		Persons.set = set;
	}

	public static List<Person> getL() {
		return l;
	}

	public static void setL(List<Person> l) {
		Persons.l = l;
	}

}
