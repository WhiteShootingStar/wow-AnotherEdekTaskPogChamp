package addtional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import person.Student;
import stroing.Groups;
import stroing.Students;

public class StdGroup implements Comparable<StdGroup> {
	String name;
	List<Student> list =null;

	public StdGroup(String n,List<Student> list) {
		name = n;
		Groups.addGr(this);
		this.list=list;
	}

	@Override
	public String toString() {
		return "StdGroup [name=" + name + ", list=" + list + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	@Override
	public int compareTo(StdGroup arg0) {
		
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
		StdGroup other = (StdGroup) obj;
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
