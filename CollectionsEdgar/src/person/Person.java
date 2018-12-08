package person;
import java.util.Date;

import enums.DateGen;
import enums.Name;
import enums.Nationality;
import enums.PeselGen;
import enums.Surname;
import stroing.Persons;

public abstract class Person implements Comparable<Person> {
	String surname, name;
	Date birthdate;
	Nationality nationality;
	String pesel;

	public Person( ) {
		surname = Surname.rand().getSurname();
		name = Name.rand().getName();
		birthdate = DateGen.generate();
		nationality =Nationality.rand();
		pesel = PeselGen.generatePes(birthdate);
		Persons.addPerson(this);
	}

	@Override
	public String toString() {
		return "Person [surname=" + surname + ", name=" + name + ", birthdate=" + birthdate + ", nationality="
				+ nationality + ", pesel=" + pesel + "]";
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public Nationality getNationality() {
		return nationality;
	}

	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthdate == null) ? 0 : birthdate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nationality == null) ? 0 : nationality.hashCode());
		result = prime * result + ((pesel == null) ? 0 : pesel.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Person other = (Person) obj;
		if (birthdate == null) {
			if (other.birthdate != null)
				return false;
		} else if (!birthdate.equals(other.birthdate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nationality != other.nationality)
			return false;
		if (pesel == null) {
			if (other.pesel != null)
				return false;
		} else if (!pesel.equals(other.pesel))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}
	@Override
	public int compareTo(Person o) {
		if (getSurname().compareTo(o.getSurname()) != 0) {
			return getSurname().compareTo(o.getSurname());
		}
		if (getName().compareTo(o.getName()) != 0) {
			return getName().compareTo(o.getName());
		}
		if (getBirthdate().compareTo(o.getBirthdate()) != 0) {
			return getBirthdate().compareTo(o.getBirthdate());
		}
		if (getNationality().compareTo(o.getNationality()) != 0) {
			return getNationality().compareTo(o.getNationality());
		}
		if (getPesel() .compareTo(o.getPesel())!=0) {
			return getPesel() .compareTo(o.getPesel());
		}else
		return 0;
	}
}
