package pack01_if;

public class Ex05_IfElself {
public static void main(String[] args) {
	//if else �����δ� � ������ �ٶ� true ������ false���� �ΰ��� ��츸 ���������

	int score= 81;
	
	if(score>=90) {
		System.out.println("A");
	} 
	if(score>=80 && score <90) {
		System.out.println("B");
	}
	if(score>=70 && score <80) {
		System.out.println("c");
	}
	if (score <70) {
		System.out.println("D");
	}
	
	
	//90~100 :A
	//80~89 : B
	//70~79:C
	//�׿ܿ� (70�̸�:D)
	if(score >=90 ) {
		System.out.println("A");
		}else if (score>=80) {
			System.out.println("B");
		
		}else {
			System.out.println("E");
		}
	
	
	
	
}//main
}//class
