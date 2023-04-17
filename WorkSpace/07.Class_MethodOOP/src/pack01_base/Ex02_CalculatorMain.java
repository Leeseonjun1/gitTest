package pack01_base;

public class Ex02_CalculatorMain {
public static void main(String[] args) {
	Ex02_Calculator cr= new Ex02_Calculator(); 
	cr.powerOn(0);
    // cr.PowerOff();
	cr.test();//int 타입을 무조건 return함. >int형 변수랑 같이 취급
	int result = cr.test()+10;
	System.out.println(result);
	result=cr.plus(5, 5);
     System.out.println(result);	
     
     System.out.println(cr.plsu3(10, 10, 10));
     System.out.println(cr.plsu3(10, 10,10)/3);
     
     
}
}
