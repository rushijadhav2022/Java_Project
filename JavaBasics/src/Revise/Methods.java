package Revise;

public class Methods {

	int id;
	String name;
	double salary;

	Methods(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	public void showDetails() {
		System.out.println("ID : " + id + " NAME : " + name + " " + "SALARY : " + salary);
	}

	public static void main(String[] args) {

		Methods m = new Methods(1, "Rushikesh", 50000);
		m.showDetails();

	}

}
