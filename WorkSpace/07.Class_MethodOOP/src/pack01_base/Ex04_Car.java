package pack01_base;

public class Ex04_Car {
	//������ �޼ҵ常���
	int gas;
	//�ش��ϴ� CarŬ������ �Ӽ� gas�� ������.
	public Ex04_Car(int gas) {
		this.gas=gas;
	}
	
	//�޼ҵ� �����غ���
	boolean isLeftGas(){
	if(gas==0) {
		//System.out.println("�����������ϴ�.");
		return false;
	}else {
		//System.out.println("������ �ֽ��ϴ�.");
	}
		return true;
	}
	
	
	
}
