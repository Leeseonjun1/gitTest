
package pack01_if;

import java.util.Scanner;

public class Ex01_If {
	
	public static void main(String[] args) {// {���α׷� ������
		//if�� : ����߿� ���ǹ��̴�.
		//� ������ �ְ� �ش� ������ TRUE�϶��� ����(��ŷ{})�� ����� �� ������ �ڵ带 �����Ѵ�.
		//���׿����ںκ��� ���� ����� ��밡��> if���� ������ �ڵ��� ����ν� ����� �����ϴ�.
		// if (���ǽ�:TRUE��FALSE�� ����� �������ִ°�) {
		    // ���ǽ��� TRUE�϶� �����ϴ� �κ�.
		//}
		int score = 80; //������ �Է¹޾ƿ� ID�� PW�� ���Ҷ� �����.
		if(score>=90) {
			//���ǽ��� TRUE�϶��� ���డ���ϴ�.
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A��� �Դϴ�.");
		}
		System.out.println("������� �������?");
		//score�� ���ڰ� Ȧ������ ¦�������� �Ǵ��ؼ� ����� ����غ���
		if(score%2==0) {
		    System.out.println("¦��");
			}
		if(score%2==1) {
			System.out.println("Ȧ��");
		}
		
		
//         Scanner sc = new Scanner(System.in);
//         System.out.print("������ ��������: ");
//         int money =Integer.parseInt(sc.nextLine());
//	   
//	    if(money > 2500) {
//	    	System.out.println("Ŀ��");
//	    }
//	    if(money < 2500) {
//	    	System.out.println("��");
	    }
		}// ���α׷� ����
	
	


