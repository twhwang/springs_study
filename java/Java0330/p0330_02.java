// �÷��� (�̹� ¥���� Ŭ������ ����)
import java.util.ArrayList;
import java.util.Collections;

public class p0330_02 {
	public static void main(String[] args) {
		// �÷����� �ڷ����� �⺻������ ���ʸ��� Ȥ�� Object���̴�.
		ArrayList list1 = new ArrayList(10);
		list1.add(100); // int(�⺻��) -> Integer(��ü)�� Boxing
		list1.add(3.14); // double(�⺻��) -> Double(��ü)�� Boxing
		list1.add("�ȳ�");
		list1.add(new String("�߰���"));
		
		for (int i = 0 ; i < list1.size() ; i++) {
			System.out.println(list1.get(i));
		}
		
		list1.clear(); //*�׸��� ��� �����Ѵ�.
		System.out.println(list1.size()); // �ݷ��� ���� ��ü�� ������ ��ȯ
		
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		
		System.out.println(list1.hashCode()); // �ݷ����� hashCode Ȯ��
		System.out.println(list1.isEmpty()); // �ݷ����� ����ִ��� �ƴ��� Ȯ��
		System.out.println("list1 : " + list1);
		System.out.println(list1.iterator()); // iterator�� ��ȯ
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); // list1���� 2��°(1)���� 4��°(5)������ ���
		System.out.println("list2 : " + list2);
		System.out.println(list1.equals(list2)); // ���� �ݷ������� Ȯ��
		
		Collections.sort(list1); // Collections�� Ŭ�����̴�.
		Collections.sort(list2);
		System.out.println(list1);
		System.out.println(list2);
		
		// containsAll : ������ ��ü���� �÷��ǿ� ���ԵǾ� �ִ��� Ȯ��
		// remainAll : ���Ե� ��ü�� ����� ������ ����
		
	}
}
