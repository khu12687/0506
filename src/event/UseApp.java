package event;
public class UseApp{
	public static void main(String[] args){
		//����� ���ΰ��� ������ ����
		Dog merry = new Dog("�޸�",5,"white");
		Dog bony = new Dog("�ǹ�",9,"black");
		Dog arong = new Dog("�Ʒ���",7,"yellow");

		//���۳� ����
		BadMan badMan = new BadMan();

		//�޸��� �ּҰ��� �ѱ����!!
		badMan.catchDog(merry); //call by reference 

		//������ ����
		DogMaster master = new DogMaster();
		master.saveDog(merry); //call by reference �ּҰ��� ���� ȣ���̶� �Ѵ�!!
	}
}
