package pack01_class;

public class Ex01_StudentMain {
	public static void main(String[] args) {
		//��� Ŭ������ �츮�� ����ó�� �޸𸮿� �ø��� ����� �����Ѱ�
		//Ŭ������ �ʱ�ȭ��.
		//��ü����:�ѹ� �� �������� ����� ����ؼ� ��Ȱ���Ҽ��ְ���.
		//�߸������� ����� ���������� ����ϱ⶧���� ����߰��� �ϳ��� Ŭ���������ص� ���������� ��� ����޴°�.
		
		Ex01_Student es1=new Ex01_Student();
		es1.����="12";
	    es1.�̸�="���л�";
	    es1.����="����";
	    es1.study();
	    System.out.println(es1.����);
	    System.out.println(es1.����+es1.�̸�);
	    Ex01_Student es2=new Ex01_Student();
	    es2.����="12";
	    es2.�̸�="���л�";
	    es2.����="����";
	    es2.study();
		System.out.println(es2.����);
		
		
//		System.out.println("es1 ������ Student ��ü�� �����մϴ�."+ es1);
//		es1=null;
//		Ex01_Student es2=null;
//		if(es1==es2) {
//			System.out.println("?"+es1+"/"+es2);
//			}else {
//				System.out.println("������ �ٸ�");
			}
	}

