package designpatternjava.com.myfile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {
	
	public static void main(String[] args) {
		List<Employee> emplist=new ArrayList<>();
		
		emplist.add(new Employee(1, "nik"));
		emplist.add(new Employee(4, "jay"));
		emplist.add(new Employee(3, "pari"));

		emplist.add(new Employee(1, "mohit"));

		emplist.add(new Employee(5, "sandeep"));

		emplist.add(new Employee(6, "seema"));
		
		//Collections.sort(emplist);
		
	//Collections.sort(emplist, new OwnCom());
		
		Collections.sort(emplist, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				if (o1.getId()==o2.getId()){
					return  o1.getName().compareTo(o2.getName());
				}
				return o1.getId()-o2.getId();
			}
		});
		
		emplist.forEach(System.out::println);
		
		List<String> li=new ArrayList<>();
		li.add("1");
		li.add("2");
		
		Collections.sort(li);
		
		li.forEach(System.out::println);

		

		
	}

}

class OwnCom implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if (o1.getId()==o2.getId()){
		return	o1.getName().compareTo(o2.getName());
		}
		return o1.getId()-o2.getId();
	}
	
}
