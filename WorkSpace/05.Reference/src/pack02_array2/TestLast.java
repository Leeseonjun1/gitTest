package pack02_array2;
import java.lang.reflect.Array;
import java.util.Arrays;

public class TestLast {

	public static void main(String[] args) {
		int[][]array1 = new int[10][10];
		int result= 1;
		for(int i = 2; i<array1.length; i++) {
			System.out.println(i+"´Ü");
			for(int j=1; j<array1[i].length;j++) {
				result=(i*j);
				System.out.println(i+"*"+j+"="+result);
			}
			System.out.println();
		}
		
		int[]arrA= {1,2,3,4};
		int[]arrB= {4,5,6,8};
		int[]tempArr=arrA;
		arrA=arrB;
		arrB=tempArr;
		System.out.println(Arrays.toString(arrA));
		System.out.println(Arrays.toString(arrB));
		System.out.println();
		
		
		int[]arr= {3,4,6,7,8,9,1,2,5};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		//		for(int i=0; i<arr.length;i++) {
//		System.out.println();
//		for(int j=i+1; j<arr.length;j++) {
//		
//			if(arr[i]>arr[j]) {
//				int temp = arr[i];
//				arr[i]= arr[j];
//				arr[j]= temp;
//			}
//			System.out.println(Arrays.toString(arr));
//		}
//		}
	   
		

		
		
		
		
		
		
		
		
		}
	}

