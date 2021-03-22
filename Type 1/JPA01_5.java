import static java.lang.System.out;
import java.util.Scanner;

class JPA01_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		out.print("請輸入您的姓名： ");
		String name = sc.next();
		
		int coinSum = 0;
		out.printf("Hi, %s, 請輸入您的銅板個數。\n", name);
		out.print("請輸入 1 元數量： ");
		coinSum = sc.nextInt();
		out.print("請輸入 5 元數量： ");
		coinSum += sc.nextInt() * 5;
		out.print("請輸入 10 元數量： ");
		coinSum += sc.nextInt() * 10;
		out.print("請輸入 50 元數量： ");
		coinSum += sc.nextInt() * 50;
		out.printf("您的錢總共有： %d 千 %d 百 %d 十 %d 元", 
				coinSum/1000, 
				(coinSum%1000)/100, 
				(coinSum%100)/10, 
				coinSum%10);
	}
}
