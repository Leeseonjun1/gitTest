package pack01_string;

public class Ex01_Null {
public static void main(String[] args) {
	//�⺻�� ���� Ÿ�� : int double float long char boolean
	//������ ���� Ÿ�� : ���� x , �⺻�� ����Ÿ���� �ƴ� ��� �͵�(��ü,Object,Class)
	//���� ������ ���� �������� �����ϰ� ���� ���� ���� ����.
	//Null (���� �������� ���� ���� ������ ���� ���� �߻���)
	String str1= null;
	String str2="a";
	String str3;//null �̶�°��� ������ ����������x ���ÿ� ������ �ö� ����
	//���� ����� �Ҵ����� �� �� null�� �ʱ�ȭ �Ҽ� ����.
	
	System.out.println(str1.length());
	System.out.println(str2.length());
	//System.out.println(str3);

	
	if(str1==str2) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
	
	
	
	
}
}
