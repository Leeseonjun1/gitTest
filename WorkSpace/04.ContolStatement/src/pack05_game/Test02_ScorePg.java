package pack05_game;

import java.util.Scanner;

public class Test02_ScorePg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int kor= -1  ,eng=-1 , mat=-1 ;
		while(kor==-1) {//�ʱ⿡ -1�� ���� �ʱ�ȭ �س��⶧���� �ʱ�ȭ�� �Ȼ��¿����� ����ؼ� �ݺ�
			kor=Integer.parseInt(sc.nextLine());
			if(kor>0 && kor<=100) {
				System.out.println("������Է¿Ϸ�");
			}else {
				System.out.println("�߸��Է� 1~100������ ����!!");
				kor=-1;
			}
			
		}//while
		System.out.println("��������:"+kor);
	}//main

}//class
