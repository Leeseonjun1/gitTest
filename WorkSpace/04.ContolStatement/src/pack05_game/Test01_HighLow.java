package pack05_game;

import java.util.Random;
import java.util.Scanner;

public class Test01_HighLow {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);//����ڿ��� �Է¹ޱ���� ��ĳ��
	int random = new Random().nextInt(100)+1;//1~100������ �� ä��
//   //for���� �̿��ؼ� ���ѷ��� ������
//	for(int i=0; i<1; i++) {
//		i=0; //ù��°���:i �� �����ص� �ٽ� 0���� ���ڸ� �ٲ㼭 ����ؼ� �ݺ��ϰԵȴ�.
//	}
//	for(int i=0; i<1; i--) {
//		//i�� ����x
//	}
	System.out.println("HighLow������ �����մϴ�.");
	int count=0;
	for(;;) {//while(true)����
		System.out.println(random);
		System.out.println("���ڸ� �Է��ؼ� ������ �����ּ���.");
		int userNum=Integer.parseInt(sc.nextLine());
		count++;
		if(userNum==random) {
		System.out.println(count+"�����Դϴ�.");
		break;
		}else if (userNum<random) {
		System.out.println("�� ū���� �Է����ּ���");
		}else {
		System.out.println("�� �������� �Է����ּ���");
	}
    
    
    
	}
    
    
	
	}//main
	
}//class
