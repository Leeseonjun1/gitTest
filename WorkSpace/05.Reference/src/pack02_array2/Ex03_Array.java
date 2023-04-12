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

  
	//2차원 배열은 1차원 배열을 요소로 가진다. (== 1차원배열을 여러개의 그룹화해놓은것)
	//1차원 배열의 개수만 정확하게 주어졌을때 사용하는방법.
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
