package hsh.calendar;

import java.util.Scanner;

public class ForMaxDays {
	private final int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int maxDaysOfMonth(int m) {
		return maxDays[m-1];
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ForMaxDays fmd = new ForMaxDays();
		
		System.out.println("반복횟수를 입력하세요.");
		int repeat = sc.nextInt();
		
		for (int i = 0; i < repeat; i++) {
			System.out.println("달을 입력하세요.");
			int m = sc.nextInt();
			
			System.out.printf("%d월은 %d일까지 있습니다.\n", m, fmd.maxDaysOfMonth(m));
			}
		System.out.println("프로그램 종료");
		sc.close();
		}
}
