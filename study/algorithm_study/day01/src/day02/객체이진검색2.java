package day02;

import java.util.Arrays;
import java.util.Comparator;

public class °´Ã¼ÀÌÁø°Ë»ö2 {
	public static void main(String[] args) {
		Person[] pArr = {new Person(10, "È«"),
					 	 new Person(20, "±è"),
						 new Person(27, "ÃÖ"),
						 new Person(25, "ÀÌ")};
		
		int idx = Arrays.binarySearch(pArr, new Person(10, ""), Person.AGE_ORDER);
		System.out.println(idx);
	}
}

class Person {
	int age;
	String name;
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return age + " " + name;
	}
	public static final Comparator<Person> AGE_ORDER = new AgeComparator();
}

class AgeComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.age - o2.age;
	}
	
}