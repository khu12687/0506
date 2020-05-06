/*
�ڹپ����� ��ü���� �������� �����Ͽ� ������ �ϴµ�,
�̶� ��ü�鰣���� ���� �� �� ���� ���谡 �ְ� �����̴�.
sun������ ��ü�� ��� ���踦 �� �ΰ����� ���Ҵ�.
1) is a ���� : ��Ӱ���
2) has a ���� : �ɹ��� �ٸ� ��ü�� ������ ����
*/
package swing;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.*; //�ε��� �ƴϴ�!! ����Ŭ�������� ����� �ܺ� Ŭ�������� ��ġ�� �˷��ִ°Ŵ�!!
public class Chat extends JFrame{ //extends is a ����
	int x =5; //����� ��ü�鰣�� ������� �ϹǷ�, �Ϲ� �����ʹ� has a ���谡 �ƴϴ�
	
	JLabel la_title;
	JTextArea area; //������ area�� ������ �ִ� has a ����
	JScrollPane scroll;
	JPanel p_south; // ���ʿ� ��ư�� �ؽ�Ʈ�ʵ带 �Ȱ� ���� �г�
	JTextField t_input;
	JButton bt;

	//���� ��ǰ���� ��ü�� �̷�� ����̹Ƿ�, ���������� ���� �����Ǿ�� ������ ���̴�..
	//���� �����ڸ� �̿��غ���!

	public Chat(){
		la_title= new JLabel("īī����");
		area = new JTextArea();
		scroll = new JScrollPane(area);
		p_south = new JPanel();
		t_input = new JTextField(10);
		bt = new JButton("����");

		//��Ÿ�� �ο�����!!
		la_title.setFont(new Font("����",Font.BOLD,30));
		la_title.setHorizontalAlignment(SwingConstants.CENTER);

		//������ �ν��Ͻ����� ��������!!	
		add(la_title,BorderLayout.NORTH);
		
		//���Ϳ����� ��ũ�� ����!
		add(scroll);

		//���ʿ� ��ġ�� �ؽ�Ʈ�ʵ�� ��ư ����
		p_south.add(t_input); //�гο� �ؽ�Ʈ�ʵ� ����
		p_south.add(bt); //�гο� ��ư ����!!

		//���������� �г��� �������� ���� ������ ����!!
		add(p_south, BorderLayout.SOUTH);

		setSize(300,400);
		setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args){
		new Chat();
	}
}
