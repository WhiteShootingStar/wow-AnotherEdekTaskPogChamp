package stroing;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.stream.Collectors;

import enums.Nationality;
import person.Teacher;

public class Teachers {
	static TreeSet<Teacher> set = new TreeSet<>();
	static List<Teacher> l =null;

	public static void addTeacher(Teacher st) {
		set.add(st);
		l = new ArrayList<>(set);
	}

	public static void removeStudent(Teacher st) {
		set.remove(st);
		l = new ArrayList<>(set);
	}

	

	public static void sortLocale(List<Teacher> list) {

		Collator col = Collator.getInstance(new Locale("pl"));
		Collections.sort(list, col);
	}

	public static List<Teacher> filterLoc(List<Teacher> list, Nationality nat) {
		List<Teacher> temp = list.stream().filter(e -> e.getNationality().equals(nat)).collect(Collectors.toList());
		Collator col = Collator.getInstance(nat.getLocale());
		temp.sort(col);
		return temp;
	}

	public static TreeSet<Teacher> getSet() {
		return set;
	}

	public static void setSet(TreeSet<Teacher> set) {
		Teachers.set = set;
	}

	public static List<Teacher> getL() {
		return l;
	}

	public static void setL(List<Teacher> l) {
		Teachers.l = l;
	}
	
	
	
}