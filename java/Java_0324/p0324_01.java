// ��������� �ʱ�ȭ
public class p0324_01 {
	static {
		System.out.println("static { }");
	} // Ŭ���� �ʱ�ȭ �� *���� ���� �����
	
	{
		System.out.println("{ }");
	} // �ν��Ͻ� �ʱ�ȭ
	public p0324_01(){
		System.out.println("������"); // ���� ���������� ����
	}  // *Ŭ���� �ʱ�ȭ ���� 1���� ����ǳ� �ν��Ͻ� �ʱ�ȭ ���� �ν��Ͻ��� ������ ������ ����ȴ�.
	public static void main(String[] args) { // �ι�°�� �����
		System.out.println("p0324_01 bt = new p0324_01();");
		p0324_01 bt = new p0324_01();
		
		System.out.println("p0324_01 bt2 = new p0324_01();");
		p0324_01 bt2 = new p0324_01();
	}
}
