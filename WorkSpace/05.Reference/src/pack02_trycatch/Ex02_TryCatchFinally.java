package pack02_trycatch;

public class Ex02_TryCatchFinally {
public static void main(String[] args) {
	
	try {
		System.out.println("������ ON");
		System.out.println("�丮����");
		int errorlnt =10/0; //�丮�ϴٰ� ���ڱ� �������� ����
		System.out.println("�丮��");
		System.out.println("������OFF");
		System.out.println("����");
		}catch (Exception e) {
		System.out.println("���� �߻�");
		}finally {
		  //�ݵ�� ����Ǿ���ϴ� ����(�ڵ�)�� �ִٸ� �־��ִ� �κ�
			System.out.println("�丮��");
			System.out.println("������OFF");
			System.out.println("����");
		}
	
	
	
	
	
	
	
	
	
}
}
