/*
�ڹٷ� �̺�Ʈ �����ϱ�
���~~��ü�� is a, has a ���踦 ��� �� ����!!
*/
package event;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class ButtonEvent extends JFrame{
	/*Ŭ������ Ŭ������ �ɹ��� �����Ѵٸ�, has a*/
	JButton bt;
	/*has a �� ��ǰ����� ������ ��ǰ�� ��ü�� �¾�� ���ÿ� �����Ǿ�� �ϹǷ�,
		�ʱ�ȭ �۾��� �����ڿ��� ó���ϸ� ���� ���̴�*/
	JTextField t_input;

	public ButtonEvent(){
		setLayout(new FlowLayout());
		bt = new JButton("�� ������");
		t_input = new JTextField(20);

		//js�� ����� ����� �ڵ���
		//bt.addEventLisener(function(){
			
		//});
		/*
		�Ʒ��� �ڵ忡�� �����ʰ�ü�� �ҿ����� ������ �������̽��� 
		�����ڰ� ���� new�� �� ���� ������ �ڽ�Ŭ������ �̿��Ͽ� �޼��带 ������ ����
		�޸𸮿� �÷����Ѵ�..
		*/

		//��ư�� �����ʿ��� ����!!
		bt.addActionListener(new ButtonListener()); //�ŰԺ����� �������̽� ��ü���;���
		
		//�ؽ�Ʈ�ʵ�� �����ʿ��� ����!!
		t_input.addKeyListener(new MyKeyListener());

		//�������� �����Ӱ� �����ʿ��� ����!!
		this.addWindowListener(new MyWindowListener());

		//�����쿡 ��ư����!!
		add(bt); //frame.add(bt) frame ������������ JFrame�� ��ӹ޾ұ⶧����
		add(t_input);
		setVisible(true);
		setSize(300,400);
	}
	
	public static void main(String[] args){
		new ButtonEvent();
	}
}
