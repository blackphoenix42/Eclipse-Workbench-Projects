package practicalFile;

public class DynamicBindingDemo {
	public static void main(String[] args) {
		m(new GraduateStudent());
		m(new Student());
		m(new Person());
		m(new Object());
	}

	public static void m(Object x) {
		System.out.println(x.toString());
	}
}

class Person extends Object {
	public String toString() {
		return "Person";
	}
}

class Student extends Person {
	public String toString() {
		return "Student";
	}
}

class GraduateStudent extends Student {
}
