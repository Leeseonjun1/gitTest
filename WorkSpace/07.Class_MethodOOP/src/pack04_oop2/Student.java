package pack04_oop2;

public class Student {
	String name;
	int number;
	int kor , en , mat;
	int sum;
	double avg;
	public Student(String name, int number, int kor, int en, int mat) {
		this.name = name;
		this.number = number;
		this.kor = kor;
		this.en = en;
		this.mat = mat;
		this.sum = this.mat+this.en+this.kor;
		this.avg =(double)(this.mat+this.en+this.kor)/3;
	}
	//DTO �� DAO ������ main ���� �Ȱ��� ������ �ǰ� �ϱ�.
	void display() {
		  System.out.println(number);
		  System.out.println(name);
		  System.out.println(en);
		  System.out.println(kor);
		  System.out.println(mat);
		  System.out.println(sum);
		  System.out.println(avg);
	}
	
	
}
