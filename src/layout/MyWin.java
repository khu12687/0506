package layout;
import java.awt.Frame;
import java.awt.Button;
import java.awt.BorderLayout;
/*
�׷��� ���α׷����̶�?
-GUI ���α׷���(������ ���α׷���)
-��� �׷��� ���α׷��ֿ��� ���Ǵ� ������Ʈ�� �ݵ�� ������ȿ� �����ؾ� �Ѵ�!!

�� ���������� ��ġ�����ڸ� ����Ҷ��� ���Ҷ��� �������� ��������!
*/
public class MyWin{
	public static void main(String[] args){
		/*�ڹ��� ���Ŭ������ �ν��Ͻ��� �����Ϸ��� new�� �ϸ� �ȴ�!!
			�ҿ����� Ŭ������ ��ü�� new �����ڸ� ���� ��� �� ������!!
			��ǥ������ �߻�Ŭ������ �������̽��� �߻�޼��带 �������ְ� 
			�߻� �޼��带 ������ �ִٴ� ���� �ҿ����ϴٴ� ���̹Ƿ�, new�����ڸ� ����� �� ����!!
			���� �ڽ�Ŭ������ new �Ҷ�, �̶� �ν��Ͻ� ������ ������!!
		*/
		//�Ʒ��� Frame�� ��� �Ϲ�Ŭ��������, �߻�����, �������̽��������� Ȯ���ؾ��Ѵ�!!
		//�׷��� new ���θ� �������� �� �ִ�!!
		Frame frame = new Frame("���� ������"); //�޸𸮿� �ø���!!

		//������� ����Ʈ�� �Ⱥ���!!
		frame.setVisible(true);
		//���� width, height�� �������� ����
		frame.setSize(300,400);

		//��ġ�����ڸ� �Ű澲�� ������, ���� ���ϴ� �������� ǥ���Ұ�
		/*
		java AWT���� �����ϴ� ��ġ�����ڶ�� ��ü�� �����Ѵ� �ϱ�!
		1) BorderLayout : ��,��,��,��, ������ ��ġ����� ����
								   ������Ʈ�� ũ�Ⱑ ������ 100%Ȯ���
								   �θ��� ũ����� Ȯ���ع��� block
		2) FlowLayout : ������ ũ�⿡ ���� �帣�� ����� ����
								�ֿ�Ư¡ : ������Ʈ�� ũ�⸦ ������
		3) GridLayout : ���������� ��ġ ����
		4) GridBagLayout : ������ ������ ������ ��ġ ����
		5) CardLayout : ��ü����� ��ġ ����
		*/

		//null�̶� �ƹ��� ���� �ƴϴ�, ��ü�� ���۷������� �ƹ��͵� �ο����� �������� null�� ���� �ȴ�!!
		
		//���� ��ġ������ ����!!
		BorderLayout borderLayout=null;
		borderLayout = new BorderLayout();
		
		//���� ������â�� ���� ��ġ�����ڸ� ��������!
		frame.setLayout(borderLayout);

		//��ư�� �ϳ� �����Ͽ�, ��ġ�����ڸ� �Ű澲�� �ʰ� �÷�����
		Button bt = new Button("�� ����");
		//�����쿡 ��ư ����!! 
		frame.add(bt);

		//���ʿ� ��ư ����!!
		Button bt_north = new Button("�� ����");
		frame.add(bt_north, BorderLayout.NORTH);

		Button bt_west = new Button("�� ����");
		frame.add(bt_west, BorderLayout.WEST);

		Button bt_east = new Button("�� ����");
		frame.add(bt_east, BorderLayout.EAST);

		Button bt_south = new Button("�� ����");
		frame.add(bt_south, BorderLayout.SOUTH);


	}
}
