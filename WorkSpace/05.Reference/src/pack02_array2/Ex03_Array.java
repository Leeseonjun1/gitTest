package pack02_array2;

public class Ex03_Array {
public static void main(String[] args) {
	int[][]array1 = new int[2][3];
	int[][]array2 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
					};
	
	System.out.println(array2[0][0]);
	System.out.println(array2[0][1]);
	System.out.println(array2[0][2]);

  
	//2���� �迭�� 1���� �迭�� ��ҷ� ������. (== 1�����迭�� �������� �׷�ȭ�س�����)
	//1���� �迭�� ������ ��Ȯ�ϰ� �־������� ����ϴ¹��.
	int[][]array3= new int[5][];
	array3[0]=new int[3];//int[]arr={1.2};
	//0 ? ? ? ?
	//1 ? ? ? ?
	//2 ? ? ? ? 
	//3 ? ? ? ? 
	//4 ? ? ? ? 
	//5 ? ? ? ?
	 System.out.println(array3.length);
  

}
}
