
public class Test06 {
	public static void main(String[] args) {
		// ������Ģ : Class(.Java)������ �빮�ڷ� �����ϱ�.
		// ������ �ҹ��ڷ� �����ϴµ� �ǹ��ִ� �ܾ �����ؼ� ������.
		int subject1, subject2, subject3, subject4, subject5;
		subject1 = 10;
		subject2 = 20;
		subject3 = 30;
		subject4 = 40;
		subject5 = 50;
		System.out.println(subject1);
		System.out.println(subject2);
		System.out.println(subject3);
		System.out.println(subject4);
		System.out.println(subject5);

		// ����ȯ (Casting): ���� �ٸ� Ÿ���� ������ ��ȯ���� �����.
		// ex) int <-> double, String <-> int

		int iValue = 20;
		double dValue = iValue+0.5;
		System.out.println("iValue ��:" + iValue);
		System.out.println("dValue ��:" + dValue);

		iValue = (int) dValue;
		System.out.println("iValue ��:" + iValue);
		System.out.println("dValue ��:" + dValue);
 
		String str = "1234" + 12;// 123412
		// ���ڿ��� � ���� ���ϴ� �� == ��x
		int iData = 1234 + 12;// 1246
		
		System.out.println(iData);
		System.out.println(str);
	    //���ڿ����� -> ���ڷ� �������ϱ�
		int sum = Integer.parseInt(str)+1;
	    System.out.println(sum);
	    
	    // boolean (�ο���) true �Ǵ� false �� ������ ������.
	    
	    
	    int num1 = 20;
	    double num2 = num1;
	    		

    System.out.println(num1);
    System.out.println(num2);
	}
	  

}