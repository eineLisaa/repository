import java.util.*;

public class Ratespiel {

	public static void main(String[] args) {
		// Scanner einbinden
		Scanner sc = new Scanner(System.in);

		// Zufallszahl zwischen 1 und 5 erzeugen
		int rand = (int) (5 * Math.random() + 1);

		System.out.println("Rate eine Zahl zwischen 1 und 5");

		// number eingeben
		int number = sc.nextInt();

		// Wenn die Zufallszahl geraten dann "Super..." ausgeben
		if (rand == number) {
			System.out.println("Super, richtig geraten!");
		}
		System.out.println("Du hast die Zahl " + number + " geraten. Es war die Zahl " + rand);
	}

}