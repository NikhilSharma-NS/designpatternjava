package designpatternjava.com.myfile;

import java.util.Objects;

public class Employee  implements Comparable<Employee>{
	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		/*
		 * if (this.id > o.id) { return 1; }else if (this.id < o.id){ return -1; }return
		 * 0;
		 */
		return this.id-o.id;
		//return this.name.compareTo(o.name);
	}
	
	
	

}
