package hsh.calendar;

import java.util.Scanner;

public class Prompt {
	
	/**
	 * 
	 * @param week 요일명
	 * @return 0 ~ 6 (0 == Sunday, 6 = Saturday)
	 */
	public int parseDay(String week) {
		if (week.equals("su"))
			return 0;
		else if(week.equals("mo"))
			return 1;
		else if(week.equals("tu"))
			return 2;
		else if(week.equals("we"))
			return 3;
		else if(week.equals("th"))
			return 4;
		else if(week.equals("fr"))
			return 5;
		else if(week.equals("sa"))
			return 6;
		else
			return 0;
	}
	
	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		int m = 1;
		int year = 2025;
		int weekday = 0;
		
		while (true) {
			System.out.println("년도를 입력하세요.(exit: -1)");
			System.out.print("YEAR>");
			year = sc.nextInt();
			if(year == -1)
				break;
			
			System.out.println("달을 입력하세요.");
			System.out.print("MONTH>");
			m = sc.nextInt();
			System.out.println("첫번째 요일을 입력하세요.(su, mo, tu, wd, th, fr, sa)");
			System.out.print("WEEK>");
			String str_weekday = sc.next();
			weekday = parseDay(str_weekday);
			
			if(m > 12 || m < 1) {
				System.err.println("잘못된 입력입니다.");
				continue;
			}
			cal.printCalendar(year, m, weekday);
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
	
	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
		
	}
}
