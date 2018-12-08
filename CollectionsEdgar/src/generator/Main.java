package generator;

import enums.Nationality;
import stroing.Departments;
import stroing.Groups;
import stroing.Persons;
import stroing.Students;
import stroing.Subjects;
import stroing.Teachers;

public class Main {

	public static void main(String[] args) {

		Generator.generate();

		System.out.println(Students.l);
		System.out.println(Teachers.getL());
		System.out.println(Persons.getL());
		System.out.println("normals");

		Students.sortLocale(Students.l);
		System.out.println(Students.l);
		System.out.println("polsih");

		System.out.println(Students.filterLoc(Nationality.rand()));
		System.out.println("Random one");
		 System.out.println(Groups.getL());
		 System.out.println(Departments.getL());
		 System.out.println(Subjects.getL());
	}

}
