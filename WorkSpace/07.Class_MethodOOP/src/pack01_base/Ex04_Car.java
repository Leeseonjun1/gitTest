package pack01_base;

public class Ex04_Car {
	//생성자 메소드만들기
	int gas;
	//해당하는 Car클래스는 속성 gas를 가진다.
	public Ex04_Car(int gas) {
		this.gas=gas;
	}
	
	//메소드 구현해보기
	boolean isLeftGas(){
	if(gas==0) {
		//System.out.println("가스가없습니다.");
		return false;
	}else {
		//System.out.println("가스가 있습니다.");
	}
		return true;
	}
	
	
	
}
