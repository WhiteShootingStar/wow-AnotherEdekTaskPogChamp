package stroing;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import addtional.Subject;

public class Subjects {
	
	static TreeSet<Subject> set = new TreeSet<>();
	static List<Subject> l = null;

		public static void addSubj(Subject st) {
			set.add(st);
			l = new ArrayList<>(set);
		}

		public static TreeSet<Subject> getSet() {
			return set;
		}

		public static void setSet(TreeSet<Subject> set) {
			Subjects.set = set;
		}

		public static List<Subject> getL() {
			return l;
		}

		public static void setL(List<Subject> l) {
			Subjects.l = l;
		}

		public static void removeSubj(Subject st) {
			set.remove(st);
			l = new ArrayList<>(set);
		}

	
}
