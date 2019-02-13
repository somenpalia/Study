import java.util.*;

public class CustomException {
	static Scanner scan = new Scanner(System.in);

	public static void customexception() {
		System.out.println("World !! ");
		throw new RuntimeException();

	}

	public static void main(String args[]) {
		/*try {System.out.println("Hello");
		customexception();
		} catch (Exception e) {
			System.out.println("Inside catch");
		}*/
		customexception();
	}// main
}
