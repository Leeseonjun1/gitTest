package pack09_scanner;

import java.util.Scanner;

public class Ex01_Scanner {
public static void main(String[] args) {
	// Scanner (�Է�)>> �ڹ� (���)>>> �ܼ�
	Scanner sc = new Scanner(System.in);
	// �ܺο��� ������ �����͸� ����غ������ؼ� �ܿ��� ��� 
	System.out.println("����Ҳ���?");
	String inputData= sc.nextLine();
	System.out.println(inputData);
	System.out.println("��������Դ���");
	int num1 =Integer.parseInt(inputData);
	System.out.println(num1+10);
	
}
}
