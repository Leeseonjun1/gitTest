
public class Ex09_Oper {
public static void main(String[] args) {
	//����Ÿ�� ������= �� �񱳽�?"��ȯ��1":"��ȯ��2"
	//int result= num < 10 ? 1: ��2?��3....:������ ���� �ƴҶ�.
	//score��� ������ ����. �ش� ������ ���� 90���� ũ�ٸ� A��� 80���� ũ�ٸ� b���.. d���
	
	int score = 91;
	String grade = score>90 ? "A": score >80? "B":"D";
	System.out.println(grade);
	
	int score1= 71;
	String grade1= score1>71 ? "c" : score1> 60 ? "D" : "E";
	System.out.println(grade1);
	
}
}
