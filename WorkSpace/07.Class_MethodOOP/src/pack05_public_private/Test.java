package pack05_public_private;

import pack04_oop2.StudentDTO;
//public: 같은 프로젝트 내에서 접근 가능
//default:같은 패키지 내에서 접근 가능
//private:같은 클래스 내부에서만 접근 가능
	public class Test {
	public static void main(String[] args) {
	
			StudentDTO dto= new StudentDTO(null, 0, 0, 0, 0);
			System.out.println(dto.getNumber());
}
}
