/*
AWT�� �ڹ��� GUI�� �����ϴ� ��Ű��������, OS�÷������� �������� �ٸ��� ǥ���Ǵ� �������� �ִ�..
�̸� ������ ����� �ٷ� SWING�̸�, javax.swing���� �����Ѵ�!! ���ú��ʹ� ������ ���������ڵ�!
������ ������ awt������Ʈ ��Ī�� J���ξ ���̸�ȴ�. ex)JButton,JTextField
*/

package swing;
import javax.swing.JFrame;
import javax.swing.JButton;
public class SwingTest{
	public SwingTest(){
		JFrame frame = new JFrame("�� ����������");
		frame.setVisible(true);
		frame.setSize(300,400);
		frame.setLayout(new java.awt.FlowLayout());

		//������ ��ġ�����ڴ� ������ awt ���� ����Ѵ�!!

		//swung�� ������ݱ�â�� ��������, setVisible(false)�� �Ǵ� �� ������, ���μ����� ������ �ʴ´�
		//������ â ������ ���α׷��� �����ϰ� �ʹٸ�, �� ������Ѵ�..
		JButton bt = new JButton("�� ������ư");
		frame.add(bt); //�����쿡 ��ư ����!!
	}
	public static void main(String[] args){
		new SwingTest();
	}
}
