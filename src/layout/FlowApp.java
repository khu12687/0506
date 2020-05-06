package layout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Frame;
import java.awt.Button;

/*
�ڹ� AWT�� ��ġ������ �� FlowLayout�� �н��Ѵ�
FlowLayout : �귯���� ��ġ����� �����ϸ�, �ҼӵǴ� ������Ʈ�� �ڽź�����ũ�⸦ ���� �� ���ִ�
					android������ LinearLayout(����,������ ������ ���� ���� ���̾ƿ��� �ǹ�)�� �����
*/
public class FlowApp{
	public static void main(String[] args){
		//FlowLayout���� ��ġ����� ����
		//FlowLayout layout = new FlowLayout();

		//���������� ���̾ƿ�!!(���α�����)
		//2���� 5ȣ�� ¥�� ����Ʈ ����!!
		GridLayout layout = new GridLayout(2,5);

		Frame frame = new Frame("�÷ο� ���̾ƿ�");
		//frame �����쿡 �÷ο� ����!!
		frame.setLayout(layout);

		//��ư 10���� �����쿡 ����!!
		for(int i=0; i<=10; i++){
			Button bt = new Button("��ư"+i);
			frame.add(bt);
		}

		//������ ���̰�, ���μ��� ũ�� ����
		frame.setVisible(true);
		frame.setSize(400,300);
		
	}
}
