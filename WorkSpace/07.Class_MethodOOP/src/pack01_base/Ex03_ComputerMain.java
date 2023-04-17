package pack01_base;

public class Ex03_ComputerMain {
public static void main(String[] args) {
	Ex03_Computer co = new Ex03_Computer();
	int arr[]= new int [5];
	arr[0]=1;
	arr[1]=2;
	arr[2]=3;
	arr[3]=4;
	arr[4]=5;
	System.out.println(co.sum1(arr));
	System.out.println(co.sum2(1,2,3,4));
	System.out.println(co.sum2(arr));
	
}


}
