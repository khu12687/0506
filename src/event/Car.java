package event;

public class Car{
	//this. �� this��
	//this�� �ܺ��� ��3�ڰ� �ƴ� , �ν��Ͻ� �����ΰ� �ڱ� �ڽ��� �ν��Ͻ��� ����Ű�� ���� ���۷�������!!

	int price=500;

	public Car(){
		System.out.println("this�� �ڵ����߽ɰ��� �ּҰ�"+this);
	}
	public static void main(String[] args){
		//this. �� this�� ������???
		Car c1 = new Car();
		System.out.println("��3�� �������� ���۷��������� �̿��� �ּҰ�"+c1);
	}
}
