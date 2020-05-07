package event;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import java.awt.Color;

public class MultiButton extends JFrame{
	JButton bt_red;
	JButton bt_yellow;
	JButton bt_blue;
	JTextArea area;
	JScrollPane scroll;

	public MultiButton(){
		//���̾ƿ��� �÷ο�
		setLayout(new FlowLayout()); //1ȸ���ϋ�
		
		bt_red = new JButton("red");
		bt_yellow = new JButton("yellow");
		bt_blue = new JButton("blue");

		area = new JTextArea(10,20); //��,�� �ŰԺ����� �־�!!
		scroll = new JScrollPane(area);
		
		//��Ÿ�Ϻο�
		bt_red.setBackground(Color.RED); //����� �������� ����
		bt_yellow.setBackground(Color.YELLOW);
		bt_blue.setBackground(Color.BLUE);

		//��ư�� �����ʿ��� ����
		MultiButtonListener mbt = new MultiButtonListener(this);

		bt_red.addActionListener(mbt);
		bt_yellow.addActionListener(mbt);
		bt_blue.addActionListener(mbt);

		//��ư,�ؽ�Ʈarea, ��ũ�� �����쿡 ����!!
		add(bt_red);
		add(bt_yellow);
		add(bt_blue);
		add(scroll);

		setSize(400,300);
		setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	public static void main (String[] args){
		new MultiButton();
	}
}
