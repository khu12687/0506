package layout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
public class LoginForm{
	Frame frame;
	Label la_id, la_pw; //����� ������Ʈ, �ܼ��� �ؽ�Ʈ ǥ���� ���
	TextField t_id, t_pw; //HTML������ input ������Ʈ�� ����
	Button bt; //�α��� ��ư
	Panel panel; //�κ������� �ٸ� ���̾ƿ��� �����ϱ� ���Ͽ�, �����Ӿȿ� �����̳ʸ� �ϳ� �����Ѵ�!!
					   //����) �ٸ� ������Ʈ�� ������ �� �ִ� ������Ʈ�� Ư�� �����̳ʶ� �Ѵ�..(Container)
					   //ex) �����̳��� ��ǥ�� ������Ʈ : Frame, Panel
					   //�׷��� ���� , �����̳ʿ��� ��ġ�� ����ȴ�

	public LoginForm(){
		frame = new Frame();
		frame.setSize(200,135);
		frame.setVisible(true);

		//��ó��
		la_id = new Label("ID");
		la_pw = new Label("PW");
		
		// �ؽ�Ʈ�ʵ�
		t_id = new TextField(10); //10�� ũ�� ����) 10�� ������ �ƴϴ�
		t_pw = new TextField(10);

		bt = new Button("Login");

		//�����ڰ� Frame�� �ƹ��� ���̾ƿ��� �������� �ʾ�����
		//Frame�� Default ��ġ�����ڴ� BorderLayout 
		
		//��ư�� ���ʿ� ����!!
		frame.add(bt,BorderLayout.SOUTH);

		panel = new Panel() ; 
		panel.setLayout(new GridLayout(2,2)); //2�� 2��¥�� �ױ׵�

		//�������� ���� �г� ����!!
		frame.add(panel,BorderLayout.CENTER);

		//���� �칰 ó�� ���� Ŭ������ ��������, ��ó��
		//����ؾ� �ϹǷ�, 

		//��� �������? ������
		panel.setBackground(Color.YELLOW);

		panel.add(la_id);
		panel.add(t_id);
		panel.add(la_pw);
		panel.add(t_pw);

	}

	public static void main(String[] args){
		new LoginForm(); //������ �� ��������?why?���� �� ���� �۾��� ������ ����. �� ������ ���� ���⶧����

	}
}
