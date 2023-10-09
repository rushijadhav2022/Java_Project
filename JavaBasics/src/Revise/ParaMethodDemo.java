package Revise;

public class ParaMethodDemo {

	public void AcceptDetails(String name, String village, String state) {
		System.out.println("NAME : " + name + "Village : " + village + "State :" + state);

	}

	public static void main(String[] args) {

		ParaMethodDemo p = new ParaMethodDemo();
		p.AcceptDetails("Rushikesh", "Salshinge", "Maharashtra");

	}

}
