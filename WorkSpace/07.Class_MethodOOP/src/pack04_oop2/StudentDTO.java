package pack04_oop2;

public class StudentDTO {
	// 메소드나 변수 앞에 접근 제한자라는것을 사용하면, 외부에서의 접근이 제한할수있다.
	// public, protected, default ,private

	private String name;
	private int number;
	private int kor;
	private int en, mat;
	private int sum;
	private double avg;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEn() {
		return en;
	}

	public void setEn(int en) {
		this.en = en;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public StudentDTO(String name, int number, int kor, int en, int mat) {
		this.name = name;
		this.number = number;
		this.kor = kor;
		this.en = en;
		this.mat = mat;
		this.sum = this.mat + this.en + this.kor;
		this.avg = (double) (this.mat + this.en + this.kor) / 3;
	}
}