package pack02_field;

import pack01_class.Ex01_Student;

public class Ex01_CrarMain {
	public static void main(String[] args) {
	Ex01_Car myCar=new Ex01_Car();//�ʱ�ȭ��(�ν��Ͻ�ȭ:��ü Ŭ������ �޸𸮿� �÷��� ����ϰ� ����°�.)
	
	System.out.println("������:" +myCar.company);
	System.out.println("����: "+myCar.model);
	System.out.println("����: "+myCar.color);
	System.out.println("����ӵ�: "+myCar.speed);
	System.out.println("�ְ�ӵ�: "+myCar.maxSpeed);
	
	myCar.speed=30;
	System.out.println(myCar.speed+"�� ������ �޸��� ����");
	
	
	
}	
	
}
