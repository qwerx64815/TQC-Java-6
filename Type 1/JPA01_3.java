import static java.lang.System.out;
import java.util.Scanner;

class JPA01_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		out.println("Please input: ");
		double nums = 0.0;
		for(int i = 0; i < 3; i++) {
			try { nums += sc.nextInt(); }
			catch(Exception ex) { out.println("Input error!"); }
		}
		out.printf("Average: %.2f", nums/3);
	}
}
