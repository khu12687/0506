package event;
/*2���̻��� ������Ʈ�� ����, �׼��̺�Ʈ�� �����ϴ� ��*/
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
public class MultiButtonListener implements ActionListener{
	MultiButton mb; //�ʿ��� ��ü�� �ִٸ� �����Ѵ�!! has a

	//������ Ŭ������ �μ� �ִ� ������ ����!!
	public MultiButtonListener(MultiButton mb){
		//�Ѱܹ��� �ּҰ� +mb
		this.mb=mb; //���������̹Ƿ�, ������� ���� �ɹ������� ���Խ��ѳ���!! �� �����츦 �޾ƿ� ����!!
	}

	//�������� �޼���!!
	//�Ʒ��� �޼����� �μ��� e�� ����, JVM�� �޸𸮿� �ø� ActionEvent��ü�� �ν��Ͻ��� ���޵ȴ�
	public void actionPerformed(ActionEvent e){
		//e�� �̺�Ʈ�� ���õ� ���~~������ �� ��������Ƿ�,
		//������ � ��ư�� �������� ������ ����ִ�!!
		// �� ������ �̿��Ͽ�, ��ư���� �����ϸ� �ȴ�!
		//�̺�Ʈ�� ����Ų ������Ʈ�� ������ �̺�ƮSource�� �ϸ�, �̺�Ʈ ��ü����
		// �� �̺�Ʈ�ҽ��� ������ �� �ִ� �޼��尡 �ִ�!!
		//�� ��ȯ���� Button�� �ƴ϶� Object�ϱ�?
		//Action �̺�Ʈ�� ��ư���� �����ų �� �ִ°� �ƴϴ�
		//��ư �̿ܿ��� ���� ������Ʈ���� ActionEvent�� �����Ѵ�
		//�����ڰ� ������ �̺�Ʈ �ҽ��� ������ ���� ������ �� �����Ƿ�, �׳� �ֻ��� ��ü�� �޾ƹ��ȱ⶧����..
		Object obj = e.getSource();

		//�츮�� ������ �̹Ƿ�, ��ư�� ���ؼ� �߻��ߴٴ°��� �˱� ������ ����ȯ�Ͽ� ����غ���!!
		JButton bt = (JButton)obj; //down casting

		
		if(bt==mb.bt_red){
			System.out.println("������");
			mb.area.append("������\n");
		}
		if(bt==mb.bt_yellow){
			System.out.println("�����");
			mb.area.append("�����\n");
		}
		if(bt==mb.bt_blue){
			System.out.println("�Ķ���");
			mb.area.append("�Ķ���\n");
		}
	}
}
