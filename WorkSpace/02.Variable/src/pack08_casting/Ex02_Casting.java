package pack08_casting;

public class Ex02_Casting {
private static final int Dou = 0;

public static void main(String[] args) {
	
	//���ڿ� ="12"+34 = 1234
	//String + int = DataType String
    //Why? ���ڿ� + ��� = ���ڿ� ��Ģ
	// ���ڿ� ������ ��Ģ
	
	String sum = "12"+34;
	//� ���� String���� �ٲٴ°��� ��û���� �����ϴ�.
	System.out.println(sum);
	String sum2 = ""+1234;
	System.out.println(sum2);
	//String sum ,sum2 ������ ���ڿ��� ���ڸ� �����ص�.
	// �ΰ��� ���� �˰�ʹ�. "1234"+"1234"= 12341234
	// sum + sum2 =
	// ���� 1234 + 1234 =2468�� ����� ���� �Ѵ�.
	
	//int,double ���� ��������� �۾� �ٲ�°� > �⺻Ÿ��
	// �빮�ڷ� �����ϴ°��� ��κ� ClassŸ��
	// �⺻ ������ Ÿ���� Wrapper class��°��� �������ִ�
	// int > Integer , double > Double
	// String�� �ش��ϴ� Ÿ������ �ٲ��ִ� ������ �ϴ°�
	// String�� �ִ� ""< �� �����Ѵ�.
	
	int num = Integer.parseInt(sum);
	int num2 = Integer.parseInt(sum2);
	
    System.out.println(num+num2);
    
    String sAvg = "88.6";
    double dAvg = Double.parseDouble(sAvg)+10;
    
    System.out.println(dAvg);
    
    String str = "123";
    int ivalu= Integer.parseInt(str);
    
    
    
    //wrapperClass.parseDataType(String);=>DataType
//    Float.parseFloat(sAvg);
//    Long.parseLong(sAvg);
//    Byte.parseByte(sAvg);    
}
}
