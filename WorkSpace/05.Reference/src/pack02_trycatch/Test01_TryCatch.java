package pack02_trycatch;

import java.util.Random;
import java.util.Scanner;

public class Test01_TryCatch {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("������ �Է��ϼ���.");
	int[] array = new int[0];
	System.out.println(array.length);
	int lev = 0;
	while (array.length < 2) {
		try {
			lev = Integer.parseInt(sc.nextLine()); // ���� �ܿ� �� �Է� ����!
			array = new int[lev]; // -�� �Ǵ� ������ ����
		} catch (Exception e) {
			System.out.println("���� ���� 2�̻��� ���ڸ� �Է����ּ���.");
		}
	}

	int random = new Random().nextInt(lev);
	array[random] = 1;
	System.out.println("���ڸ� ���߼���.");
	for (;;) {
		try {
			int num = Integer.parseInt(sc.nextLine());
			if (num == random) {
				System.out.println("������");
				break;
			} else if (num > random) {
				System.out.println("��! �� ���� ���� �Է��ϼ���");
			} else {
				System.out.println("��! �� ū ���� �Է��ϼ���");
			}
		} catch (Exception e) {
			System.out.println("���ڸ� �Է����ּ���!!!!����");
		}
	} 
}
}
