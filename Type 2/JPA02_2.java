import static java.lang.System.out;
import java.util.Scanner;

class JPA02_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 2; i++) {
			out.println("Input: ");
			try { compareNum(sc.nextInt(), sc.nextInt()); }
			catch(Exception ex) { out.println("Input error!"); }
		}
	}
	
	private static void compareNum(int n1, int n2) {
		if(n1 != n2) 
			out.printf("%d is larger than %d\n", 
				Math.max(n1, n2), 
				Math.min(n1, n2));
		else out.printf("%d equals %d", n1, n2);
	}
}
