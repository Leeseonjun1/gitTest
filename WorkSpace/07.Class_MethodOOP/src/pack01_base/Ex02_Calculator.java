package pack01_base;

public class Ex02_Calculator {
//static Ű���尡 �ִ��� �������� �Ǵ�.(��������Ǹſ��߿���)
	//�޼ҵ��Ǳ���
	//������ �޼ҵ� (Constructor):��ü�� �����Ҷ� �ʿ��� �޼ҵ�

	//�޼ҵ屸��:
	//void�޼ҵ��̸�(){
	// �޼ҵ峻��(�ڵ�)          
	//}
	//�Ķ���ͺ�: ����̵� �޼ҵ尡 ���� �ɶ� �ʿ��� (����,Ŭ������)������ �ִٸ� 
	//			�޾ƿ��Բ� ó���ϴ� �κ�
	
	//PowerOff���� main�� ������ �Ǵ�����: static������� �޸𸮿� ���� �ֱ⶧��
	//main���� poweroff������ �ȵǴ�����: �ν��Ͻ�ȭ ������ �Ȱ�ġ�� �޸𸮿� ����
	
	void powerOn(int power) {
		if(power<1) {
			System.out.println("���͸� �������� ����Ұ�");
			PowerOff();
		}else {
			System.out.println("������ �մϴ�.");
		}
	}
	void PowerOff() {
	System.out.println("������ ���ϴ�.");
	}
	//void���� void�� �ƴ����� ���� ����Ÿ���� �����ȴ�.
	//���� �˰��ִ� ��� Ÿ��> ����Ÿ������ ����̰���
	//void:�����̾���(�۾� �� ����� �ʿ䰡 ����)
	
	//return Ÿ���� void�� �ƴϰ� �־����� �ش��ϴ� Ÿ���� ��ȯ�ϴ� return Ű���� �ݵ�� �ʿ��ϴ�.
	
	int test() {
	return 0;	
	}
	
	//1. �Ķ���ͺο� ���ڸ� �ΰ� �Է¹ޱ�
	//2. �Է¹޴� �Ķ���ͺ� �� �������� return�ڵ��غ���
	int plus(int num1, int num2) {
	return num1+num2;	
		}
	int plsu3(int num1,int num2 ,int num3) {
		return num1+num2+num3;
	}
	
}
