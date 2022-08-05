
public class InheritanceDemo1 {
	public static void main(String[] args) {
		Manager m =new Manager();
		Employee e = new Employee();
		System.out.println(m.salary);
		System.out.println(e.name);
	}
}

class Manager {
	int salary = 1000000;
}

class Employee extends Manager {
	String name = "한지민";
}
