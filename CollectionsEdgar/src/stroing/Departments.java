package stroing;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import addtional.Department;

public class Departments {
	static TreeSet<Department> set = new TreeSet<>();
	static List<Department> l = null;

	public static void addDep(Department st) {
		set.add(st);
		l = new ArrayList<>(set);
	}

	public  static void removeDep(Department st) {
		set.remove(st);
		l = new ArrayList<>(set);
	}

	public static TreeSet<Department> getSet() {
		return set;
	}

	public static void setSet(TreeSet<Department> set) {
		Departments.set = set;
	}

	public static List<Department> getL() {
		return l;
	}

	public  static void setL(List<Department> l) {
		Departments.l = l;
	}
}
