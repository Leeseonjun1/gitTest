package pack01_if;
import java.util.Scanner;
public class Test_DiceGame {
public static void main(String[] args) {
	//ex)����ڰ�� ������ ������ ������ ������ �Ǵ°�==����
	System.out.println("�ֻ��� ������ �����մϴ�.");
	System.out.println("-1�� �Է��ϸ� �����մϴ�. �׿ܿ��� ����");
	Scanner sc= new Scanner(System.in);
	int random1= Integer.parseInt(sc.nextLine());
    if (random1==-1) {
    	System.out.println("�����մϴ�");
    }else {
    	System.out.println("���ӽ���");
    	System.out.println("����ڰ� �ֻ����� ���� �����Դϴ�. ������ ����");
    	sc.nextLine();
    	int userNum=(int)(Math.random()*6)+1;
    	System.out.println("������� ��"+ userNum);
    	System.out.println("����ڰ� �ֻ����� ���� �����Դϴ�. ������ ����");
    	sc.nextLine();
    	int comNum=(int)(Math.random()*6)+1;
    	System.out.println("��ǻ���� ��:"+comNum);
    	if(userNum<comNum) {
    		System.out.println("������ ��: "+userNum + "��ǻ���� ��: "+comNum +"������!");
    	}else if(userNum>comNum) {
    		System.out.println("������ ��: "+userNum + "��ǻ���� ��: "+comNum +"������!");
    	}else {
    		System.out.println("������ ��: "+userNum + "��ǻ���� ��: "+comNum +"���º�");
    	}
    } 
	
	 //1~6������ �� �����ϰ� �̴� ��� (�޼ҵ�)
	
	
	
	
	
}
}
