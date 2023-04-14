package pack02_field;

import pack01_class.Ex01_Student;

public class Ex01_CrarMain {
	public static void main(String[] args) {
	Ex01_Car myCar=new Ex01_Car();//초기화식(인스턴스화:객체 클래스를 메모리에 올려서 사용하게 만드는것.)
	
	System.out.println("제조사:" +myCar.company);
	System.out.println("차종: "+myCar.model);
	System.out.println("색깔: "+myCar.color);
	System.out.println("현재속도: "+myCar.speed);
	System.out.println("최고속도: "+myCar.maxSpeed);
	
	myCar.speed=30;
	System.out.println(myCar.speed+"가 앞으로 달리기 시작");
	
	
	
}	
	
}
