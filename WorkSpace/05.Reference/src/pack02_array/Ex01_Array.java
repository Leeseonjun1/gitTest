package pack02_array;

public class Ex01_Array {
	
	public static void main(String[] args) {
		//�迭�̶�?
		//�ڷ��� ������ �����ϰ� ����Ҷ� �ַ� ����
		//��Ģ"������"������ Ÿ���� ��� ����ϰ� �ϸ� ������ ����ŭ ���� ó���ϴ� ��ü
		//��ü(�ѹ� ���� ũ��� �ٽ� �ٲٴ°� �����ϴ�.
		//���� dataType[] name = new dayaType[size];
		//         ������Ÿ��[]���̸�=new ������Ÿ��[ũ��]; ��
		
		//���� ��ĳ�ʳ� ������ ó���� ������ �Է����� ���� ���� 5���� �غ��ص�
		int score1=0, score2=0, score3=0, score4=0, score5=0; 
	    int[]scores = new int[5];//0[0]1[0]2[0]3[0]4[0];
	    // �迭�� �ε��� ��Ģ: n�� ũ�Ⱑ �־��� �迭�� 0���� n-1���� �ּҸ� ������
	    System.out.println("scores[0]��: "+ scores[0]);
	    System.out.println(scores);//���������ּ�(�޸�)��x
		scores[0]=10; //�ش��ϴ� Ÿ���� ������� ����
		System.out.println("scores[0]��: "+ scores[0]);
		
		scores[0]=10; scores[1]=20; scores[2]=30;  scores[3]=40; scores[4]=50;
		System.out.println(scores[0]);
	    
		for(int i=0; i<5; i++) {
			scores[i]=i*5;
			
			System.out.println(scores[i]);
			
//			}
//		for(int i=1; i<=5; i++) {
//			System.out.println(i*10);
			}
//		
//		
		
	}//main
}//class
