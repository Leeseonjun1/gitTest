
public class Ex08_Oper {
public static void main(String[] args) {
	//�񱳿�����: ���ǹ��� ���� ��� �ȴ�.
	//���� : � ���� ������ �Ǵ� ���������� �Ǵ��ϴ� ��
	// id�� pw�� ���� �Է��� ���� DB�� �ִ� ���� ��ġ�ϴ���? "�α���":"���̵� �Ǵ� ��̹�ȣ�� Ȯ���ϼ���"
	// �������ݵ��true�� false�� ���� �������־���Ѵ�.
	int num1 = 10 , num2=10;
	//== !=  <=  >=  <   > 
	// ���� ����x �̻� ���� �ʰ� �̸�
	//���ǽ��� ����ϰ� ������ ����� �ݵ�� true false�� ���´�()
	boolean result1= num1==num2;// true
	boolean result2= num1!=num2;// false
	boolean result3= num1<= num2;// true //10���ϴ� 10�� ���Կ��� true
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	
	System.out.println(num1==num2);
	System.out.println(num1!=num2);
	System.out.println(num1<=num2);
	System.out.println(num1 >= num2); //t
	System.out.println(num1 > num2); //f
	System.out.println(num1 < num2);//f
	
	//���� ���� :�� ������ (���������� �Ǵ�)
	// �������� ��� True�Ǵ� False�� ����� ���´�
	//���ǽ� A && ���ǽ� B : ���ǽ�a�� ���̰� ���ǽ�b�� ���� ��� = True �� �ܿ� False
	//&& (AND,*,����)
	//���ǽ� A || ���ǽ� B : ���ǽ�a�� ���̸� �ڿ� ���ǰ� ������� true
	//||(OR)
	System.out.println("=========����=========");
	System.out.println(10>5 && 20>5);
	System.out.println(10>5 && 20<5);
	System.out.println(5>10 && 20>5);
	System.out.println(5>10 && 5>20);
	System.out.println("=========����=========");
	System.out.println(10>5 || 20>5); //t
	System.out.println(10>5 || 20<5); //t
	System.out.println(5>10 || 20>5); //t
	System.out.println(5>10 || 5>20); //f
	System.out.println(5>10 && 20>5 || 5>10); 
	
	
}
}
