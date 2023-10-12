import java.util.*;
public class Money {

	public static void main(String[] args) {
		
		// Integrate Scanner
		Scanner sc = new Scanner(System.in);
		// Print out ("Bitte geben Sie...")
		System.out.println("Bitte geben Sie den Dollar Betrag ein:");
		double d = sc.nextDouble();
		
		System.out.print("Umgerechnet in Euro sind das ");
		System.out.print(d * 0.86);
		System.out.println("€");

	}

}
// d Dollar * 0.86 = y Euro
// 1 Dollar = 0,86 Euro