// HashMap
import java.util.*;
/*
 * 2���� ������ �̷���� (Ű, data) 
 * ���� : �߰�, ������ ������. �˻��� ���� ������.
 * ���� : Ű�� �ߺ��� �� ����. (�ߺ� ���� �� ���� �� ����)
 */

public class p0331_03 {
	public static void main(String[] args) {
		HashMap<String, String> aHM = new HashMap<String, String>();
		aHM.put("���", "SAGWA");
		aHM.put("���", "SARANG");
		aHM.put("�Ʊ�", "AGI");
		aHM.put("����", "GAJOK");

		System.out.println(aHM.get("���"));
		System.out.println(aHM.get("���"));
		System.out.println(aHM.get("�Ʊ�"));
		System.out.println(aHM.get("����"));
		
		System.out.println("__________");
		
		HashMap<String, Integer> aHM2 = new HashMap<String, Integer>();
		aHM2.put("����", 02);
		aHM2.put("�λ�", 051);
		aHM2.put("����", 041);
		aHM2.put("����", 061);
		aHM2.put("�뱸", 053);
		
		System.out.println(aHM2.get("����"));
		System.out.println(aHM2.get("����"));
		System.out.println(aHM2.get("�뱸"));
		System.out.println(aHM2.get("�λ�"));
		System.out.println(aHM2.get("����"));
	}
}
