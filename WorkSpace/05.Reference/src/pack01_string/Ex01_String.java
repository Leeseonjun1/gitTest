package pack01_string;
import java.util.Scanner;
public class Ex01_String {
public static void main(String[] args) {
	//String : �⺻�� ����x ����������
	//������ ������ �����̶�� �޸𸮰����� �� ������ �ּҸ� �����ϰ� ���� ���� �� ������ �ִ� ����
	//�⺻�� ������ �� ���� ��� x
	String strVar1="Kym";
	String strVar2="Kym";
	
	if(strVar1==strVar2) {
	 System.out.println("����");
	}else{
		System.out.println("�ٸ�");
	}
	System.out.println();
	String strVar3=new String("Kym");
	String strVar4=new String("Kym");
	Scanner sc= new Scanner(System.in);
	String StrVar5 =sc.nextLine();
	if(strVar1==StrVar5) {
		System.out.println("strVar1==strVar5");
	}else if(strVar3==StrVar5) {
		System.out.println("strvar3==strVar5");
	}else {
		System.out.println("strVar1, strVar3, strVar5");
	}
	
	
	if(strVar3==strVar4) {
		System.out.println("����");
	}else {
		System.out.println("�ٸ�");
	}
	
	
	}
}

