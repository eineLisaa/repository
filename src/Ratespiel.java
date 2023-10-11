import java.util.*;

public class Ratespiel {

	public static void main(String[] args) {
		// Integrate scanner
		Scanner sc = new Scanner(System.in);

		// Generate random number between 1 and 5
		int rand = (int) (5 * Math.random() + 1);

		System.out.println("Rate eine Zahl zwischen 1 und 5");

		// Enter number
		int number = sc.nextInt();

		// If the random number is guessed then output "Super...".
		if (rand == number) {
			System.out.println("Super, richtig geraten!");
		}
		System.out.println("Du hast die Zahl " + number + " geraten. Es war die Zahl " + rand);
	}

}