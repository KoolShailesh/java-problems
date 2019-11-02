package org.core.java8.probems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person {

	String name;
	int age;
	ArrayList<Integer> phoneNumbers;

	public Person(String name, int age, ArrayList<Integer> phoneNos) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNumbers = phoneNos;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public ArrayList<Integer> getPhoneNumbers() {
		return phoneNumbers;
	}

	public static void main(String[] args) {
		ArrayList<Integer> phoneNos1 = new ArrayList<Integer>();
		phoneNos1.add(6);
		phoneNos1.add(7);
		Person p1 = new Person("Rahul", 32, phoneNos1);

		ArrayList<Integer> phoneNos2 = new ArrayList<Integer>();
		phoneNos2.add(8);
		phoneNos2.add(9);
		Person p2 = new Person("Ajith", 33, phoneNos2);

		List<Person> pList = Arrays.asList(p1, p2);
		
		
		Stream<ArrayList<Integer>> map = pList.stream().map(p -> p.getPhoneNumbers());
		
//		List<Integer> collect1 = map.flatMap(m -> m.stream()).collect(Collectors.toList());
		
		//Optional<Integer> reduce = map.flatMap(m -> m.stream()).reduce((a,b) -> a+b);
		map.flatMap(Collection:: stream).map(c -> c*2).peek(System.out:: println).collect(Collectors.toList());
//		System.out.println(reduce.get());
		
		
	}

}