package pack01_if;

public class Ex04_Ifif {
public static void main(String[] args) {
	//��ŷ�� �⺻ ����:{<�޸𸮿ø�       }<�޸𸮿�������
    //�ڹ����α׷��� �޸𸮸� ȿ�������� �������ؼ� �޸𸮿� �ø��� ������ ������ ������.
	//��ŷ(����)�� ����ؼ� ��ø�� �����ϴ�.
int score =10;
//if (score%2==0) {
//	System.out.println("¦��");
//}else {
//	System.out.println("Ȧ��");
//}
//if(score==10) {
//	System.out.println("10");
//}else {
//	System.out.println("else10�ƴ�");
//}
//if(score<11) {
//	System.out.println("else11����");
//}
	
if(score %2==0) {
	System.out.println("¦��");
	if(score==10) {
		System.out.println("10");
		if(score<11) {
			System.out.println("11��������");
		}
	}
  	} else {
	  System.out.println("Ȧ��");
	  if(score==10) {
		 System.out.println("10");
		 if(score <11) {
			 System.out.println();
		 }
	  }else {
		  System.out.println("10�ƴ�");
	  }
  }
 
	




	
	}//main
}//class
