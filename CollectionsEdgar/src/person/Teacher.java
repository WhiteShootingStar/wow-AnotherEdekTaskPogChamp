package person;
import java.util.Date;

import enums.Degree;
import enums.Nationality;
import stroing.Persons;
import stroing.Teachers;

public class Teacher extends Person {
	Date hiredate;
	Degree degree;

	public Teacher( Date bd,  long pes, Date hire) {
		super(  );
		hiredate = hire;
		degree = Degree.rand();
		Teachers.addTeacher(this);
	}

	@Override
	public String toString() {
		return "Teacher [hiredate=" + hiredate + ", degree=" + degree + ", surname=" + surname + ", name=" + name
				+ ", birthdate=" + birthdate + ", nationality=" + nationality + ", pesel=" + pesel + "]";
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public Degree getDegree() {
		return degree;
	}

	public void setDegree(Degree degree) {
		this.degree = degree;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((degree == null) ? 0 : degree.hashCode());
		result = prime * result + ((hiredate == null) ? 0 : hiredate.hashCode());
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
		Teacher other = (Teacher) obj;
		if (degree != other.degree)
			return false;
		if (hiredate == null) {
			if (other.hiredate != null)
				return false;
		} else if (!hiredate.equals(other.hiredate))
			return false;
		return true;
	}

	
	public int compareTo(Teacher o) {
	

		int a = super.compareTo(o);
		if (a == 0) {
			if (getHiredate().compareTo(o.getHiredate()) != 0) {
				return getHiredate().compareTo(o.getHiredate());

			}

		}
		return 0;//getDegree().compareTo(temp.getDegree());
	}
}