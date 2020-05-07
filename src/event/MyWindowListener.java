package event;
//������� ���õ� �̺�Ʈ�� �����ϴ� �������� WindowListener�� �������غ���!
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
public class MyWindowListener implements WindowListener{

	//���� ������� ���¸� Ȱ��ȭ��� �ϰ�, ����δ� Activated �� �Ѵ�
	public void windowActivated(WindowEvent e){
		System.out.println("windowActivated ȣ��");
	}

	//������â�� ���ŵɶ� ȣ��Ǵ� �޼���
	public void windowClosed(WindowEvent e){
		System.out.println("windowClosed ȣ��");
	}

	//setVisible(true)�̴� �����찡 false �� �ɶ� ȣ��Ǵ� �޼���
	public void windowClosing(WindowEvent e){
		System.out.println(" windowClosingȣ��");
		//���μ��� ���̱�!!
		System.exit(0); //���α׷�����
	}

	//��Ȱ��ȭ�ɶ� ȣ��Ǵ� �޼���
	public void windowDeactivated(WindowEvent e){
		System.out.println("windowDeactivated ȣ��");
	}

	//�ִ�ȭ�Ǿ� �ٽ� ��Ÿ����
	public void windowDeiconified(WindowEvent e){
		System.out.println("windowDeiconified ȣ��");
	}

	//�ּ��ϵǾ� ���������� ���Ҷ�
	public void windowIconified(WindowEvent e){
		System.out.println(" windowIconified ȣ��");
	}

	//������â�� ��Ÿ���� ȣ��Ǵ� �޼���!!
	public void windowOpened(WindowEvent e){
		System.out.println("windowOpened ȣ��");
	}
}
