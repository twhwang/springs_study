// Calendar
import java.util.*;
public class p0329_09 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println("���ش� "+ today.get(Calendar.YEAR));
		System.out.println("�̹� ����? "+ today.get(Calendar.MONTH));
		System.out.println("������ ���° ��? "+ today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("�̹� ���� ���° ��? "+ today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("������ ��ĥ? "+ today.get(Calendar.DATE));
		System.out.println("������ �̹� ���� ��ĥ? "+ today.get(Calendar.DAY_OF_MONTH));
		System.out.println("������ ������ ��ĥ? "+ today.get(Calendar.DAY_OF_YEAR));
		System.out.println("������? "+ today.get(Calendar.DAY_OF_WEEK));
		System.out.println("����? ����? "+ today.get(Calendar.AM_PM));
		System.out.println("������ �� ��? "+ today.get(Calendar.HOUR));
		System.out.println("������ �� ��?(24�ð� ����) "+ today.get(Calendar.HOUR_OF_DAY));
		System.out.println("������ �� ��? "+ today.get(Calendar.MINUTE));
		System.out.println("������ �� ��? "+ today.get(Calendar.SECOND));
	}

}
