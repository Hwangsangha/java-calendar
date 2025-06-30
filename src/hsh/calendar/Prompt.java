package hsh.calendar;

import java.util.Scanner;

public class Prompt {
private final int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int maxDaysOfMonth(int m) {
		return maxDays[m-1];
		}
	public void printCalendar() {
		System.out.println("Hello, Calendar!");
		System.out.println("일  월  화  수  목  금  토");
		System.out.println("--------------------");	
		System.out.println("1  2  3  4  5  6  7");
		System.out.println("8  9  10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
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
//			System.out.printf("%d월은 %d일까지 있습니다.\n", m, fmd.maxDaysOfMonth(m));
			
			fmd.printCalendar();
			}
		
		
		System.out.println("프로그램 종료");
		sc.close();
		}
}
