import static java.lang.System.out;
import java.util.Scanner;

class JPA02_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 2; i++) {
			out.println("Input: ");
			compareNum(sc.nextInt(), sc.nextInt());
		}
	}
	
	private static void compareNum(int n1, int n2) {
		if(n1 > n2) out.printf("%d is larger than %d\n", n1, n2);
		else if(n1 < n2) out.printf("%d is larger than %d\n", n2, n1);
		else out.printf("%d equals %d", n1, n2);
	}
}
