import static java.lang.System.out;
import java.util.Scanner;

class JPA01_4 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		double[] numArr = new double[4];
		out.print("請輸入第1組的x和y座標: ");
		inputXY(numArr, 1);
		out.print("請輸入第2組的x和y座標: ");
		inputXY(numArr, 3);
		out.printf("介於(%.2f, %.2f)和(%.2f, %.2f)之間的距離是%.2f", 
				numArr[0], 
				numArr[1], 
				numArr[2], 
				numArr[3], 
				Math.sqrt(
						Math.pow((numArr[2]-numArr[0]), 2) + 
						Math.pow((numArr[3]-numArr[1]), 2)));
	}
	
	private static void inputXY(double[] numArr, int index) {
		for(int i = index-1; i <= index; i++) {
			try { numArr[i] = sc.nextDouble(); }
			catch(Exception ex) { out.println("Input error!"); }
		}
	}
}
