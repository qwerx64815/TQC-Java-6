import static java.lang.System.out;
import java.util.Scanner;

class JPA01_2 {
	public static void main(String[] args) {
		out.print("Please input: ");
		double p = new Scanner(System.in).nextDouble();
		out.printf("%f kg = %f ponds", p, p*2.20462);
	}
}
