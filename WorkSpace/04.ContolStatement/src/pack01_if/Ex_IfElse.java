package pack01_if;

public class Ex_IfElse {
public static void main(String[] args) {
	//if��:�ܼ�if(���ǽ��� �ְ� �ش��ϴ� ���ǽ��� TRUE�ΰ���� ��ŷ(����{})�� ���� �ڵ����)
	//if-else��:�ܼ�if���� ���ǽ���TRUE�϶��� �����̵Ǵ� ���ŷ����� ����.
	//if�� ���ǽ��� TRUE�� �ƴ� FALSE��� else��� Ű���带 if�� �ڿ� �ٿ��� FALSE����θ� �����°�.
	int score=85;
	if(score%2==0) {
		System.out.println("¦��");//TRUE�϶�����
	} else {
		System.out.println("Ȧ��");//FALSE�϶�����
	}
	int num1= 10 , num2= 20;
	if(num1<num2) {
		System.out.println("num2ũ��");
	}else {
		System.out.println("num1�۴�");
	}
	}// main
}//class
