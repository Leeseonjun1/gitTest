package pack03_oop1;

//Class:Ư��(�Ӽ�,��������),����(���)�� ���(����)
//Ư��:field(������ ���� �˰��ִ� ���͵�, �޼ҵ�����)
//����:�޼ҵ�(field�� �̿��ϰų� �ƴϸ� �ش��ϴ� class�� �������� ����� ����)
public class Product {
//��ǰ (Product):��ǰ�ǹ�ȣ,��ǰ�� �̸�(�ۼ�)
	
	//�������� :DTO > DTO class, VO Class
	//Data Transper.Object.Value Object
	//�����͸� ����ִ� ��ü
	int num; //��ȣ
	String name;//�̸�

	public Product(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
  //�޼ҵ� ���:DAO Class
	//Data Access Object:DTO���̿��ؼ� �����ϴ�
	//���,�Ǵ� �ش��ϴ� Ŭ������ ���õ� ����� ��Ƶ�
	void display() {
		System.out.println("��ȣ: "+num);
		System.out.println("��ǰ��:"+name);
	}
}
