import static java.lang.System.out;
import java.util.Scanner;

class JPA02_1 {
	public static void main(String[] args) {
		for(int i = 0; i < 2; i++) {
			out.println("Please enter score: ");
			compareNum(new Scanner(System.in).nextInt());
		}
	}
	
	private static void compareNum(int n) {
		if(n >= 60) out.println("You pass");
		out.println("End");
	}
}
