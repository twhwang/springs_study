import java.util.*;
/*
 Vector�� ���� (ArrayList�� ��)
 ���ʹ� �׻� ����ȭ�Ǵ� �����̳� ������ ������ �ִ�.
 �����尡 1���� ��쿡�� ����ȭ�� �ϱ� ������ ArrayList���� ������ ��������.
 ArrayList�� �⺻���� ����� �����ϳ�
 �ڵ� ����ȭ ����� �����ְ�, ����ȭ �ɼ��� ������ �����Ѵ�.
 �׸��� ���Ϳ� ���� �ӵ��� �����⿡ ArrayList�� ��������� ���� ���̰� �ִ�.
 */
public class p0331_02 {
	
	public static void main(String[] args) {
		Vector<Integer> aVector = new Vector<Integer>();
		
		aVector.add(5);
		aVector.add(-200);
		aVector.add(35);
		aVector.add(9999);
		aVector.add(200);
		aVector.add(10);
		
		for (Object Temp : aVector) {
			System.out.print(Temp + ",");
		}
		System.out.println();
		
		aVector.add(3, 888);
		for (Object Temp : aVector) {
			System.out.print(Temp + ",");
		}
		System.out.println();
		
		aVector.remove(2);
		for (Object Temp : aVector) {
			System.out.print(Temp + ",");
		}
		System.out.println();
		
		aVector.removeAllElements();
		for (Object Temp : aVector) {
			System.out.print(Temp + ",");
		}
		System.out.println("__________");
	}
	
	public static void main1(String[] args) {
		Vector aVector = new Vector();
		
		aVector.add(5);
		aVector.add(-200);
		aVector.add(3.5);
		aVector.add(9999);
		aVector.add("�ȳ�");
		
		for (Object Temp : aVector) {
			System.out.println(Temp);
		}
		
		System.out.println(aVector.size()); // ũ��
		System.out.println(aVector.capacity()); // �뷮
		
	}
}
