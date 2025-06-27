package hsh.calendar;

import java.util.Scanner;

public class ForMaxDays {
	private final int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int maxDaysOfMonth(int m) {
		return maxDays[m-1];
		}
	public static void main(String[] args) {
		
		String PROMPT = "cal> ";
		Scanner sc = new Scanner(System.in);
		ForMaxDays fmd = new ForMaxDays();
		
		int m = 1;
		while (true) {
			System.out.println("달을 입력하세요.");
			System.out.print(PROMPT);
			m = sc.nextInt();
			if(m == -1) {
				break;
			}
			if(m > 12) {
				continue;
			}
			System.out.printf("%d월은 %d일까지 있습니다.\n", m, fmd.maxDaysOfMonth(m));
			}
		
		
		System.out.println("프로그램 종료");
		sc.close();
		}
}
