package pack05_public_private;

import pack04_oop2.StudentDTO;
//public: ���� ������Ʈ ������ ���� ����
//default:���� ��Ű�� ������ ���� ����
//private:���� Ŭ���� ���ο����� ���� ����
	public class Test {
	public static void main(String[] args) {
	
			StudentDTO dto= new StudentDTO(null, 0, 0, 0, 0);
			System.out.println(dto.getNumber());
}
}
