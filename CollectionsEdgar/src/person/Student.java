package person;

import java.util.Date;

import enums.Nationality;
import stroing.Persons;
import stroing.Students;

public class Student extends Person {
	int stdBookNumb;

	public Student(Date bd, long pes, int bookN) {
		super();
		stdBookNumb = bookN;
		Students.addStudent(this);
	}

	@Override
	public String toString() {
		return "Student [stdBookNumb=" + stdBookNumb + ", surname=" + surname + ", name=" + name + ", birthdate="
				+ birthdate + ", nationality=" + nationality + ", pesel=" + pesel + "]";
	}

	public int getStdBookNumb() {
		return stdBookNumb;
	}

	public void setStdBookNumb(int stdBookNumb) {
		this.stdBookNumb = stdBookNumb;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + stdBookNumb;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (stdBookNumb != other.stdBookNumb)
			return false;
		return true;
	}

	// @Override
	/*
	 * public int compareTo(Person o) { int a = super.compareTo(o); Student temp =
	 * null; if (o instanceof Student) { temp = (Student) o; }
	 * 
	 * if (a == 0) { if (getStdBookNumb() > temp.getStdBookNumb()) { return 1; }
	 * else if (getStdBookNumb() < temp.getStdBookNumb()) { return -1; } } return 0;
	 * }
	 */

	public int compareTo(Student o) {
		int a = super.compareTo(o);
		if(a==0) {
			if (getStdBookNumb() > o.getStdBookNumb()) {
				return 1;
			} else if (getStdBookNumb() < o.getStdBookNumb()) {
				return -1;
			}
		}
	
		return 0;
	}

}
