package generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.security.auth.Subject;

import addtional.Department;
import addtional.StdGroup;
import person.Student;
import person.Teacher;
import stroing.Departments;
import stroing.Groups;
import stroing.Persons;
import stroing.Students;
import stroing.Subjects;
import stroing.Teachers;

public class Generator {
	static void generate() {
		Random rand = new Random();
		for (int i = 0; i < 100; i++) {
			Student stud = new Student(new Date(), i, ((int) (Math.random() * 322)));
			// Students.addStudent(new Student(new Date(), i, ((int) (Math.random() *
			// 322))));
			// System.out.println(Students.l.get(i));

		}

		for (int i = 0; i < 10; i++) {
			Teacher teach = new Teacher(new Date(), 322, new Date());
			// System.out.println(Teachers.getL().size());
		}

		for (int i = 0; i < 12; i++) {
			List<Student> ls = new ArrayList<>();
			for (int p = 0; p < 10; p++) {

				ls.add(Students.l.get(25));
			}
			StdGroup gr = new StdGroup(i + " group", ls);

		}

		for (int i = 0; i < 3; i++) {
			List<Teacher> ls = new ArrayList<>();
			for (int p = 0; p < 3; p++) {
				ls.add(Teachers.getL().get(i * p + p));
			}
			Department dep = new Department(i + " Department", ls);
		}
		for (int i = 0; i < 10; i++) {
			Department randDep = Departments.getL().get(rand.nextInt(Departments.getL().size()));
			addtional.Subject subj = new addtional.Subject(i + " subject ", randDep,
					randDep.getList().get(randDep.getList().size()-1),
					Groups.getL().get(rand.nextInt(Groups.getL().size())).getList());

		}

	}

}
