package hsh.calendar;

//들여쓰기 자동정렬 : ctrl, shift + f
public class Calendar2 {
	private final int[] max_Days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public boolean isLeapYear(int year) {
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		else
			return false;
	}
	
	public int maxDaysOfMonth(int year, int m) {
		if(isLeapYear(year)) {
			return LEAP_MAX_DAYS[m - 1];
		} else {
			return max_Days[m-1];
		}
		
	}
	public void printCalendar(int year, int m, int weekday) {
		System.out.printf("<<%3d>>\n", m);
		System.out.println("일  월  화  수  목  금  토");
		System.out.println("--------------------");	
		
		//print blank space
		for(int i = 0; i < weekday; i++) {
			System.out.print("   ");
		}
		int maxDay = maxDaysOfMonth(year, m);
		int count = 7 - weekday;
		int delim = (count < 7) ? count : 0;
//		if (count > 7) {
//			delim = count;
//		}else {
//			delim = 0;
//		}
		
		//print first line
		for(int i = 1; i <= count; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		
		count++;
		for(int i = count; i <= maxDay; i++) {
			System.out.printf("%3d",i);
			if(i %7 == delim)
				System.out.println();
		}
		System.out.println();
		System.out.println();
	}
	
	public void printCalendar(int year, int m) {
		System.out.printf("   <<%d년% 3d월>>\n", year, m);
		System.out.println("일  월  화  수  목  금  토");
		System.out.println("--------------------");	
		
		//get weekday automatically
		int weekday = getWeekDay(year, m, 1);
		
		//print blank space
		for(int i = 0; i < weekday; i++) {
			System.out.print("   ");
		}
		int maxDay = maxDaysOfMonth(year, m);
		int count = 7 - weekday;
		int delim = (count < 7) ? count : 0;
//		if (count > 7) {
//			delim = count;
//		}else {
//			delim = 0;
//		}
		
		//print first line
		for(int i = 1; i <= count; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		
		count++;
		for(int i = count; i <= maxDay; i++) {
			System.out.printf("%3d",i);
			if(i %7 == delim)
				System.out.println();
		}
		System.out.println();
		System.out.println();
	}

	private int getWeekDay(int year, int m, int day) {
		int syear = 1970;
		int Sm = 1;
		int sday = 1;
		int standardsweekday = 3; //목요일
		
		int count = 0;
		
		for (int i = syear; i <= year; i++) {
			int delta = isLeapYear(year) ? 366 : 365;
			count += delta;
		}
		System.out.println(count);
		return 0;
			
	}
	
	//simple test code here
	public static void main(String[] args) {
		Calendar2 c = new Calendar2();
		c.getWeekDay(1970, 5, 1);
	}
}
