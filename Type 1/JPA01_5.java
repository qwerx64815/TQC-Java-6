import static java.lang.System.out;
import java.util.Scanner;

class JPA01_5 {
	static Scanner sc = new Scanner(System.in);
	static int coinSum = 0;
	
	public static void main(String[] args) {
		out.print("請輸入您的姓名： ");
		try { 
			String name = sc.next();
			out.printf("Hi, %s, 請輸入您的銅板個數。\n", name);
		} catch(Exception ex) { out.println("Input name error!"); }
		
		out.print("請輸入 1 元數量： ");
		inputCoin(1);
		out.print("請輸入 5 元數量： ");
		inputCoin(5);
		out.print("請輸入 10 元數量： ");
		inputCoin(10);
		out.print("請輸入 50 元數量： ");
		inputCoin(50);
		
		out.printf("您的錢總共有： %d 千 %d 百 %d 十 %d 元", 
				coinSum / 1000, 
				(coinSum % 1000) / 100, 
				(coinSum % 100) / 10, 
				coinSum % 10);
	}
	
	private static void inputCoin(int times) {
		try { coinSum += sc.nextInt() * times; }
		catch(Exception ex) { out.println("Input coin error!"); }
	}
}
