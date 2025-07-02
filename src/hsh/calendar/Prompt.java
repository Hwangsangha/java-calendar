package hsh.calendar;

import java.util.Scanner;

public class Prompt {
	
	private final String PROMPT = "cal>";
	
	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		int m = 1;
		int year = 2025;
		
		while (true) {
			System.out.println("년도를 입력하세요.");
			System.out.print(PROMPT);
			year = sc.nextInt();
			System.out.println("달을 입력하세요.");
			System.out.print(PROMPT);
			m = sc.nextInt();
			if(year == -1 || m == -1) {
				break;
			}
			if(m > 12) {
				continue;
			}
			cal.printCalendar(year, m);
		}
		
		System.out.println("프로그램 종료");
		sc.close();
	}
	
	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
		
	}
}
