package pack01_base;

public class Ex02_CalculatorMain {
public static void main(String[] args) {
	Ex02_Calculator cr= new Ex02_Calculator(); 
	cr.powerOn(0);
    // cr.PowerOff();
	cr.test();//int Ÿ���� ������ return��. >int�� ������ ���� ���
	int result = cr.test()+10;
	System.out.println(result);
	result=cr.plus(5, 5);
     System.out.println(result);	
     
     System.out.println(cr.plsu3(10, 10, 10));
     System.out.println(cr.plsu3(10, 10,10)/3);
     
     
}
}
