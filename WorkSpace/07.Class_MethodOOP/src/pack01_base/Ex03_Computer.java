package pack01_base;

public class Ex03_Computer {
//sum1�̶�� �޼ҵ带 ����.
//�迭��
 int sum1(int arr[]) {
	 int sum= 0;
	 for(int i =0; i<arr.length; i++) {
		 sum+=arr[i];
	 }
	 return sum;
 }
 
 // ���� �Ⱦ��� ������ �޼ҵ� �Ķ����
 int sum2(int...values) {
	 int sum=0;
	 for(int i=0; i<values.length;i++) {
		 sum+=i;
	 }
	 return sum;
 }
 
}
