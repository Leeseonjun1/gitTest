package pack02_switch;

public class Ex01_Switch {
public static void main(String[] args) {
	//���:���ù�(���ǹ� ����,��) switch��: ����if���� �����ϰ� ǥ���� ��
	//���ذ�, �񱳰��� �ΰ� �ش��ϴ� ���� ��ġ�Ҷ� ������ case��� �����������
	//switch(���ذ� ex)score){
	//case ��90(ex)score==90):	
	// ����
	//break; <=����� �����ϰ� ����� ��ŷ ������ ��������.
	//}
	int num=2;//�񱳿� ��� �� ���ذ��� �Ǵ� ����
	switch(num-1) {
	case 1:
		System.out.println("����1");
		break;
	case 2:
		System.out.println("����2");
		break;
	default:
		System.out.println("1��2�� �ƴ� else�� ����");
		
	}
	
	
	
}
}