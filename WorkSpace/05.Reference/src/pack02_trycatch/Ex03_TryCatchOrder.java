package pack02_trycatch;

import java.util.Scanner;

public class Ex03_TryCatchOrder {
public static void main(String[] args) {
	int data2=0;
	try {
		int data1=10;
		int result=data1/data2;
		Scanner sc= new Scanner(System.in);
		sc.nextLine();
		args[10]="1";
		String data3="100";
	} catch (ArithmeticException e) {//������� 0���� ��� �������ϸ�߻�
		int data3=100;
		System.out.println("data2�� ����(��:"+data2+")����������"+e.getMessage());
	}catch (NullPointerException e) {
		System.out.println("NullPointerException"+e.getMessage());
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("�迭 ����!!"+e.getMessage());
	}catch (StringIndexOutOfBoundsException e) {
		System.out.println("���� ����!!" + e.getMessage());
	}
	
	
	
	
	
	
	
}
}