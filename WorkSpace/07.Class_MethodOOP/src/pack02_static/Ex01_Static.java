package pack02_static;

public class Ex01_Static {
	//static�� ���ο� ���� ����� �����Ѵ�.
	//static�� ���ο� ���� �޸𸮿� �ö󰡴� �������ٸ���.
	//static:���α׷� �������� ���� �޸𸮿� �Ҵ�. ���α׷� ����� �Ҹ�
	//instance:�ν��Ͻ�ȭ �����Ŀ� �޸𸮿� �Ҵ�. ���α׷� ����� �Ҹ�
	//���: Ŭ�����Ǹɹ�=>Ŭ�������߰�ȣ ���̿� �ִ� ���͵�
	
	static void sMethod() {
		System.out.println("����ƽ����̴ϴ�.");
		//imethod();//�ν��Ͻ�
	}
	 //����ƽ�̵��͵Ǵµ� �ν��Ͻ������ ����
	//�ν��Ͻ� ���
	void imethod() {
		System.out.println("�ν��ͽ� ��� �Դϴ�.");
		
	}
	void imethod2() {
		imethod();//�ν��Ͻ� ���ٰ���
		sMethod();//����ƽ ���ٰ���
	}
	
	public static void main(String[] args) {
//	Ex01_Static sc = new Ex01_Static();
//	sc.imethod();
     Ex01_Static.sMethod();	
	
	
	}	
}
