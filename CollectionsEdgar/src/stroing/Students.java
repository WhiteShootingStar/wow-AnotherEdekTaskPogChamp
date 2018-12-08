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
import person.Student;

public class Students {
	public static TreeSet<Student> set = new TreeSet<>();
	public static List<Student> l = new ArrayList<>(set);

	public static void addStudent(Student st) {
		set.add(st);
		l = new ArrayList<>(set);
	}

	public static void removeStudent(Student st) {
		set.remove(st);
		l = new ArrayList<>(set);
	}

	public static void sortLocale(List<Student> list) {

		Collections.sort(list, new Comarator(new Locale("pl")));
	}

	public static List<Student> filterLoc(Nationality nat) {
		List<Student> temp = l.stream().filter(e -> e.getNationality().equals(nat)).collect(Collectors.toList());

		temp.sort(new Comarator(nat.getLocale()));
		return temp;
	}

}
