/*
�޸����� �ڹٷ� �����غ���!!
*/
package swing;
//�ڹٿ����� �޴��ٴ� �����ڰ� �� ��ġ�� ����� ������ �� ���� Ư���� ������Ʈ�̴�.
//���� ��ġ�� ������ ���� ����̴�!! ��ġ�����������!
import javax.swing.*; //������ �ִ� ��� Ŭ����
public class MenoEditor extends JFrame{
	
	JMenuBar bar; //�޴����� ������ �޴���!!
	JMenu m_file, m_edit, m_style, m_view, m_help;
	JMenuItem item_new, item_open, item_save, item_print;
	JTextArea area; //����â
	JScrollPane scroll; //����â�� ���� ��ũ��


	public MenoEditor(){
		bar = new JMenuBar();

		m_file = new JMenu("����");
		m_edit =new JMenu("����");
		m_style =new JMenu("����");
		m_view =new JMenu("����");
		m_help =new JMenu("����");

		area = new JTextArea(25,40); //������ ���Ϳ� �����Ƿ�, ��üũ��� ����
		scroll = new JScrollPane(area);

		//�޴� ������
		item_new = new JMenuItem("������");
		item_open = new JMenuItem("����");
		item_save = new JMenuItem("����");
		item_print = new JMenuItem("�μ�");

		//'����' �޴��� ����!!
		m_file.add(item_new);
		m_file.add(item_open);
		m_file.add(item_save);
		m_file.add(item_print);
		

		//������ �޴��� �ٿ� ����!!
		bar.add(m_file);
		bar.add(m_edit);
		bar.add(m_style);
		bar.add(m_view);
		bar.add(m_help);

		setJMenuBar(bar);

		//add(area); //�����쿡 ���� 
		add(scroll);
		setSize(700,550);
		setVisible(true);

		//������â ������ ���μ����� ���̴� ��
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new MenoEditor(); //�ڽ� ������ ȣ���, �θ��� JFrame�� ���� �ʱ�ȭ�Ǳ� ������
									 //�ڽ��� new�ϸ� �������� �����ϴ� ����
	}
}
