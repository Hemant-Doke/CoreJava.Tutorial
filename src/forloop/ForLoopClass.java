package forloop;

public class ForLoopClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 90;
		boolean flag = false;

		for (int i = 5; i > 0; i--) {
			System.out.println("Inside for loop");
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("Inside for loop 1");
			System.out.println("Inside for loop 2");
			System.out.println("Inside for loop 3");
			System.out.println(i);
		}

		for (; a < 100;) {
			System.out.println("Inside for loop 1");
			System.out.println("Inside for loop 2");
			System.out.println("Inside for loop 3");

		}

		for (; false;) {
			System.out.println("inside for");
		}

		for (; true;) {
			System.out.println("inside for");
		}

	}

}
