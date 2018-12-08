package addtional;

import java.util.ArrayList;
import java.util.List;

import person.Student;
import person.Teacher;
import stroing.Groups;
import stroing.Students;
import stroing.Subjects;

public class Subject implements Comparable<Subject> {
	String name;
	Department dept;
	Teacher lecturer;
	List<Student> list=new ArrayList<>();

	public Subject(String name, Department dept, Teacher lecturer, List<Student> list) {
		super();
		this.name = name;
		this.dept = dept;
		this.lecturer = lecturer;
		this.list = list;
		Subjects.addSubj(this);
	}

	@Override
	public String toString() {
		return "Subject [name=" + name + ", dept=" + dept + ", lecturer=" + lecturer + ", list=" + list + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Teacher getLecturer() {
		return lecturer;
	}

	public void setLecturer(Teacher lecturer) {
		this.lecturer = lecturer;
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	@Override
	public int compareTo(Subject arg0) {
		if (name.compareTo(arg0.getName()) != 0) {
			return name.compareTo(arg0.getName());
		} else
			return dept.compareTo(arg0.getDept());
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + ((lecturer == null) ? 0 : lecturer.hashCode());
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (lecturer == null) {
			if (other.lecturer != null)
				return false;
		} else if (!lecturer.equals(other.lecturer))
			return false;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
