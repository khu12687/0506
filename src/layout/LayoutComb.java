package layout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
/*
�ڹ� AWT���� �����ϴ� ���̾ƿ����� Ư¡�� �ִ�..
������, FlowLayout�� �����ϰ��� ��� ������Ʈ ������ ũ�⸦ ������ ������!!
BorderLayout, GridLayout���� �̿��ϸ鼭 ������Ʈ�� ũ�⸦ �����Ϸ���?
*/
public class LayoutComb{
	public static void main(String[] args){
		BorderLayout layout = new BorderLayout();
		Frame frame = new Frame("�� ������");
		frame.setLayout(layout); //�����쿡 ��ġ����!!

		//BorderLayout�� ��ư �ϳ��� ���̸鼭 �����ڰ� ������ ������� ������
		//����Ʈ�� CENTER�̴�!!
		//���� ��ư�� �Ѱ��ϰ�� ��չ�ư���� ������ ����
		//CENTER�� �����(empty) ������ ������ ħ���ϱ� ������

		Button bt = new Button("�� ����");
		Button bt_north = new Button("�� ����");
		Button bt_west = new Button("�� ����");
		Button bt_east = new Button("�� ����");
		Button bt_south = new Button("�� ����");
		//frame.add(bt, BorderLayout.CENTER); //�ǹ̾���!

		//��ư�� ������ ũ�⸦ ������Ű�� �����??
		//BorderLayout�� FlowLayout�� ��ĥ�� ������??
		//FlowLayout flowLayout = new FlowLayout();
		//frame.setLayout(flowLayout);

		//�ϳ��� �����ӿ� �ΰ��� ��ġ�� ���������Ҽ��� ���� ������ 
		//��ư�� ũ�⸦ �����ϰ� �ʹٸ�, html ���� div�ȿ� div �ֵ�
		//���� ������ ��ư�� �׳� ����������, FlowLayout�� �⺻������ ����ϴ�
		//�����̳ʸ� �ϳ� �����ϸ� �Ǹ�, �� �����̳ʿ� ��ư�� �־��ָ� �ȴ�!! Panel�� �̿��ϸ�ȴ�!!

		//����̶�? �ܾ��� ���� ���ڸ� �ǹ�, �� ���ڴ� �ٸ� ������Ʈ���� ������ �� �ִ�..
		//Frame�� ���̰� �ֳ�??
		//Panel�� �ܵ����� ������ �� ������, �ݵ�� ������ �ȿ����� ������ �� �ִ�!!
		for(int i=1; i<=5; i++){
			Panel panel = new Panel(); // ���� �ʺ��δ�!!
		}

		frame.add(panel); //������ ��κ���!!
		
		frame.add(bt_north, BorderLayout.NORTH);

		frame.add(bt_west, BorderLayout.WEST);

		frame.add(bt_east, BorderLayout.EAST);

		frame.add(bt_south, BorderLayout.SOUTH);
		//����� �⺻������ FlowLayout�� ����� �����̱� ������ �гξȿ� ��ġ�ϴ� ��� ������Ʈ��
		//�ڱ� �ڽ��� ������ ũ�Ⱑ ������ �� �ִ�.. ���� ��ư�� �����쿡 ���� ����������,
		//�гο� ��������!!
		panel.add(bt); ///�гο� ��ư ����!

		//������ ���̰�, ũ�� ����
		frame.setSize(400,300);
		frame.setVisible(true);
		
	}
}
