package addtional;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import person.Teacher;
import stroing.Departments;
import stroing.Teachers;

public class Department  implements Comparable<Department>{
	String name;
	List<Teacher> list= new ArrayList<>();

	public Department(String n,List<Teacher> ls) {
		name = n;
		Departments.addDep(this);
		list=ls;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", list=" + list + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Teacher> getList() {
		return list;
	}

	public void setList(List<Teacher> list) {
		this.list = list;
	}

	@Override
	public int compareTo(Department arg0) {
		// TODO Auto-generated method stub
		return name.compareTo(arg0.getName());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Department other = (Department) obj;
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