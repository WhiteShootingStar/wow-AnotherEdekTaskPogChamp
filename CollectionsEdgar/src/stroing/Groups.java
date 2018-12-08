package stroing;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;

import addtional.StdGroup;



public class Groups {
	static TreeSet<StdGroup> set = new TreeSet<>();
	static List<StdGroup> l = null;

	public static void addGr(StdGroup st) {
		set.add(st);
		l = new ArrayList<>(set);
	}

	public static void removeGr(StdGroup st) {
		set.remove(st);
		l = new ArrayList<>(set);
	}

	public static TreeSet<StdGroup> getSet() {
		return set;
	}

	public static void setSet(TreeSet<StdGroup> set) {
		Groups.set = set;
	}

	public static List<StdGroup> getL() {
		return l;
	}

	public static void setL(List<StdGroup> l) {
		Groups.l = l;
	}

}
