package pack02_array2;

public class Ex01_Array {
public static void main(String[] args) {
	//1���� �迭(Array):������ �ϳ��� ������ ���� �� ����.(ex String str="a") 
	//������ �ִ� ���� ������ Ÿ���� �ϳ��� ������� �׷� �̶�� �����ϸ��.
	//1���� �迭�� �����ϴ� ���=> ������(�����͵�)
	//2���� �迭(Array):1���� �迭�� x��(����)�Ǵ�y��(����)�������� �� �Ǵ� ���� �ִ� ����.
	//2���� �迭�� 1���� �迭�� ��ҷ� ������ ������ x��� y���� ���ÿ� ������ �ִ� �࿭ ����.
	//��Ģ:������==for������ �����ָ� ��� index(�ּ�)�� ������ �����ϴ�.
	int[]array=new int[3];
	System.out.println(array[0]);
	
	int[]tempArr  = { 1, 2 };
	int[][] tempArray = {
			tempArr,
			{3,4,5},
			{6,7,8,9}
			
	};
	
	
	//            		  0~1 0~2
	int[][]array2 = new int[2][3];//2�� 3�� �������ִ� �迭 �ʱ�ȭ ��Ŵ
	//0[1][2][3]
	//1[4][5][6]
	//�迭�� ũ�� ��ȸ.
	System.out.println("�迭�� ũ����ȸ: "+array.length);
	System.out.println("2�����迭 ���� 1���� ũ��: "+array2[0].length);
	System.out.println("2�����迭�� ũ����ȸ: "+array2.length);
	System.out.println();
	//���� �ְ� ����غ���
	
	array2[0][0]=1;
	array2[0][1]=2;
	array2[0][2]=3;
	
	array2[1][0]=4;
	array2[1][1]=5;
	array2[1][2]=6;
	


		               //1[].��    2[].��
	for(int i=0; i<3; i++) {
	System.out.println(array2[0][i]);
//	
//	for(int j=0; j<array2[i].length; j++) {
//		System.out.println(array2[i][j]);
//
//	
	}
	
	

	

	

	
	

	
	
}//main	
}//class
