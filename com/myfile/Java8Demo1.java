package designpatternjava.com.myfile;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Java8Demo1 {
	
	public static void main(String[] args) {
		
		
		List<Integer> lst= new ArrayList<>();
		lst.add(1);
		lst.add(12);

		System.out.println("iterator for");

		for (Iterator iterator = lst.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
			
		}
		System.out.println("iterator for each");

		for (Integer integer : lst) {
			System.out.println(integer);
		}
		System.out.println("for each");

		lst.forEach((i)-> System.out.println(i));
		
		Predicate<Integer> p1=new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				if (t > 10) {
					return true;
				}
				return false;
			}
		};
		
		Consumer<Integer> co=new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println("Value- "+t);
				
			}
		};
		
		Predicate<Integer> p = i -> (i<10);
		System.out.println("filter");
		lst.stream().filter(p).forEach((i)->System.out.println(i));
		System.out.println("filter2");

		lst.stream().filter(p1).forEach((i)->System.out.println(i));
		
		System.out.println("Own Consumer");
		
		lst.forEach(co);
		System.out.println("Lam Consumer");

		lst.forEach(System.out::println);
		
		
			


	}

}
