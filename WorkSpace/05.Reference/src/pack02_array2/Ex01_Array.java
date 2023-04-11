package pack02_array2;

public class Ex01_Array {
public static void main(String[] args) {
	//1차원 배열(Array):변수는 하나의 정보만 담을 수 있음.(ex String str="a") 
	//연관이 있는 같은 데이터 타입을 하나로 묶어놓은 그룹 이라고 생각하면됨.
	//1차원 배열을 구성하는 요소=> 변수들(데이터들)
	//2차원 배열(Array):1차원 배열은 x축(가로)또는y축(세로)방향으로 행 또는 열만 있는 구조.
	//2차원 배열은 1차원 배열을 요소로 가지기 때문에 x축과 y축을 동시에 가지고 있는 행열 구조.
	//규칙:차원수==for문수를 맞춰주면 모든 index(주소)에 접근이 가능하다.
	int[]array=new int[3];
	System.out.println(array[0]);
	
	int[]tempArr  = { 1, 2 };
	int[][] tempArray = {
			tempArr,
			{3,4,5},
			{6,7,8,9}
			
	};
	
	
	//            		  0~1 0~2
	int[][]array2 = new int[2][3];//2행 3열 가지고있는 배열 초기화 시킴
	//0[1][2][3]
	//1[4][5][6]
	//배열의 크기 조회.
	System.out.println("배열의 크기조회: "+array.length);
	System.out.println("2차원배열 내부 1차원 크기: "+array2[0].length);
	System.out.println("2차원배열의 크기조회: "+array2.length);
	System.out.println();
	//값을 주고 출력해보기
	
	array2[0][0]=1;
	array2[0][1]=2;
	array2[0][2]=3;
	
	array2[1][0]=4;
	array2[1][1]=5;
	array2[1][2]=6;
	


		               //1[].행    2[].열
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
