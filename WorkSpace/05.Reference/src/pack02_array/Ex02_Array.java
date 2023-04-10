package pack02_array;

public class Ex02_Array {
public static void main(String[] args) {
	  int[]scores = new int[10];
//     scores[0]=10;
//     scores[1]=20;
//     scores[2]=30;
//     scores[3]=40;
//     scores[4]=50;
//     scores[5]=60;
//     scores[6]=70;
//     scores[7]=80;
//     scores[8]=90;
//     scores[9]=100;
//     System.out.println(scores[0]);
//	
	 
	for(int i=0; i<10; i++) {
		scores[i]=(i+1)*10;

		System.out.println(scores[i]);
	}
	
	  int result=0;
	  for(int i=0; i<10; i++) {
		  result += scores[i];
        System.out.println("누적값:"+ result);
		System.out.println("평균값:"+(double)result/2);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
}
