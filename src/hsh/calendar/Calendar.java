package hsh.calendar;

import java.util.Scanner;

//들여쓰기 자동정렬 : ctrl, shift + f
public class Calendar {
	private final int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int maxDaysOfMonth(int m) {
		return maxDays[m-1];
	}
	public void printCalendar(int m) {
		System.out.printf("<<%3d>>\n", m);
		System.out.println("일  월  화  수  목  금  토");
		System.out.println("--------------------");	
		
		int maxDay = maxDaysOfMonth(m);
		
		for(int i = 1; i < maxDay; i++) {
			System.out.printf("%3d",i);
			if(i %7 == 0)
				System.out.println();
		}
		System.out.println();
//		System.out.println("1  2  3  4  5  6  7");
//		System.out.println("8  9  10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
	}
	
	public static void main(String[] args) {
		

		
		System.out.println("달을 입력하세요.");
		Calendar cal = new Calendar();
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		
		System.out.printf("%d월은 %d일까지 있습니다.\n", m, cal.maxDaysOfMonth(m));
		
		sc.close();
	}
}
