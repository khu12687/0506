package event;
//������ ��ģ��!!
public class BadMan{
	//has a
	Dog d; //��ģ��
	int money;
	DogMaster master;

	//�������� ��ġ�ؼ� �ڱ��� ������ ����� �޼���!!
	public void catchDog(Dog d){
		this.d= d; 
		System.out.println("������ ���� ��ģ ������ : "+d);
	}
	//���ο��� ��ġ�� ���� �ٽ� �����ִ� �޼���
	public void returnToMaster(){
		
	}
}
