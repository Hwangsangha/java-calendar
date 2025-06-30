package hsh.calendar;

import java.util.Scanner;

public class Prompt {
	
	private final String PROMPT = "cal>";
	
	public void runPrompt() {
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
	
	public static void main(String[] args) {
		
		
	}
}
