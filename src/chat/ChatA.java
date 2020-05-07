package chat;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
�ڹ� GUI ������Ʈ�� ������ ������ �� �ִ� �� ���θ� �������� ũ�� 2������ �з��ȴ�.
1.������ ������Ʈ(=�Ϲ� ������Ʈ)
	�ٸ� ������Ʈ�� ������ ���Խ�ų �� ���� ��ü��..
	JButton, Checkbox, TextField, TextArea...
2. �����̳�(�ٸ� ������Ʈ�� ������ �� �ִ� �ɷ��ִ� ��ü��..)
	���� �����ؾ� �ϱ� ������, ��ġ�ɷ��� �־���.
	���� �Ʒ��� Ŭ������ ��ġ�����ڸ� �̿��Ͽ� ���ϴ� ��ġ�� ���� �� ���ִ�.
	���� �����ڰ� �ƹ��͵� ��ġ�� ������� ������, ����Ʈ��ġ�� ����ȴ�.
	- Frame : BorderLayout�� �⺻����
	- Panel : FlowLayout�� �⺻����
*/

//�������̽��� Ŭ������ �ƴϹǷ�, ���߻���� �����ϱ� ������, ���ǿ� �����ϴ� ������ �繰�� 
//ǥ���ϱ⿡ �ʹ� �����ϴ�!! 
//ex) class SmartPhone extends Phone implements WebBrowser, TV, MP3, VideoPlayer,Card...
public class ChatA extends JFrame implements ActionListener, KeyListener{
	//has a ���迡 �ִ� ��ü ����!!
	//int x=5; //has a ����� ��ü���� ������� �ǹ̰� �����Ƿ� int x=5 �� �׳� ������
	JPanel p_north; //���� ������ �ٿ��� �����̳�!! has a ���� 5����
	JButton bt_open; //ä�� ģ�������츦 ȣ���ϴ� ��ư
	JTextArea area;
	JScrollPane scroll;
	JTextField t_input;
	ChatB chatB; //�ʿ��ϸ� has a�� ��������!!! ���������ƴϰ� �ν��Ͻ�������

	public ChatA(){
		super("�� ChatA"); //�θ� �����ڴ� ��ӵ��� �ʴ´� why? ����ϸ� �װ� �ڽ��̾ƴ϶� �����̱⶧����
									//���� �θ������ ȣ���, �� ��� �ڽ��� �ڵ庸�� �켱�Ͽ� �ۼ��ؾ��Ѵ�.
									//why? �θ��� ������ ������ ����� �ϹǷ�...
		p_north = new JPanel();
		bt_open = new JButton("ģ������");  
		area = new JTextArea(); //�ްԺ����� 10,20 �̷��� ���൵ �� why? �־������ Ȯ��������
		scroll = new JScrollPane(area);
		t_input = new JTextField();

		//��Ÿ�� �� ����!!
		//������ �гο� ��ư ����!!
		p_north.add(bt_open); //������ �гο� ��ư ����!!
		add(p_north, BorderLayout.NORTH);//�������� ���ʿ� �гκ���!!

		//�������� ���� ��ũ�� ����!!
		add(scroll); 

		//���ʿ� �ؽ�Ʈ�ʵ� ����!!
		add(t_input, BorderLayout.SOUTH);

		//������ ũ�� �� ���̰� ����(setSize��ɿ� ��ġ��ɱ��� �߰��� �޼���)
		setBounds(100,100,300,400); //x,y,width,heigh������ ��ġ�� ���� �� ���ִ�
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//��ư�� ������ ����!!
		bt_open.addActionListener(this);

		//�ؽ�Ʈ�ʵ�� ������ ����
		t_input.addKeyListener(this);
	}

	//�����ʰ� ������ �߻�޼��� ������!!
	public void actionPerformed(ActionEvent e){
		//System.out.println("ģ�� ����;�?");

		//ChatB ����
		chatB = new ChatB();
	}

	//KeyListener �� ������ �߻�޼��� ������! �������̵�
	public void keyReleased(KeyEvent e){
		int key = e.getKeyCode();
		if(key == 10){ //�ڵ尪�� ���Ͷ��..
			//System.out.println(key+"�����׿�?");
			//ģ���� area�� �޼��� �Է�!!
			//���� �ؽ�Ʈ�ʵ尪�� ���� ���ͼ� ����!!
			String msg = this.t_input.getText();
			chatB.area.append(msg+"\n");

			//�Է°� �ٽ� �ʱ�ȭ
			t_input.setText("");
		}
	}
	public void keyPressed(KeyEvent e){
		
	}
	public void keyTyped(KeyEvent e){
		
	}
	public static void main(String[] args){
		//this.x=10; //x ����
		new ChatA();
	}
}
