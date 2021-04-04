// Calendar
import java.util.*;
public class p0329_09 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println("올해는 "+ today.get(Calendar.YEAR));
		System.out.println("이번 달은? "+ today.get(Calendar.MONTH));
		System.out.println("올해의 몇번째 주? "+ today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이번 달의 몇번째 주? "+ today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("오늘은 며칠? "+ today.get(Calendar.DATE));
		System.out.println("오늘은 이번 달의 며칠? "+ today.get(Calendar.DAY_OF_MONTH));
		System.out.println("오늘은 올해의 며칠? "+ today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일은? "+ today.get(Calendar.DAY_OF_WEEK));
		System.out.println("오전? 오후? "+ today.get(Calendar.AM_PM));
		System.out.println("지금은 몇 시? "+ today.get(Calendar.HOUR));
		System.out.println("지금은 몇 시?(24시간 기준) "+ today.get(Calendar.HOUR_OF_DAY));
		System.out.println("지금은 몇 분? "+ today.get(Calendar.MINUTE));
		System.out.println("지금은 몇 초? "+ today.get(Calendar.SECOND));
	}

}
