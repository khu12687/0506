package layout;
import java.awt.*; //awt ������ �ִ� ��� Ŭ������ �ǹ�!!
								 //*�� Ŭ�������� �����Ҽ��ְ�, ��� ��Ű���� �ǹ��ϴ� �ڵ�� ����!!
								 //���� ��Ű������ �ݵ�� ������
public class Ex1{
	//int x=5; //�⺻�ڷ����� �����ڰ� ���� �ʱ�ȭ ���� ������??
					//��Ģ : ������ �ʱ�ȭ ���������� ����������
					//���� : �ɹ������� ��쿣 �����ڰ� ���ϸ� ������ ���⶧����
					//			�����Ϸ��� ������ (�������� ���� ���)
					//��� : �������� 0, ������ false, ��ü���� null�� �ʱ�ȭ
	//int[] arr = new[5]; 
	Frame frame; //��ü�ڷ����� null�� �ʱ�ȭ �Ǿ� �ִ�!
	//��ü�ڷ����� �ڷ����̴�!!
	Panel[] panel = new Panel[5]; //������ 5�� �����, �̰����� ��� �� ���ִ� �ڷ��� Panel�ΰ���
	Button[] bt = new Button[5];
	String[] title = {"��","��","��","��","��"}; //js�� ���ȣ���� java�� �߰�ȣ

	//��,��,��,��,�� ����� ���� �迭 ����
	String[] direction={
		BorderLayout.EAST,
		BorderLayout.WEST,
		BorderLayout.SOUTH,
		BorderLayout.NORTH,
		BorderLayout.CENTER
	};

	public static void main(String[] args){
		Ex1 ex1 = new Ex1(); //���� �ν��Ͻ��� �����ؾ� �Ѵ�!!
		//�� �ν��Ͻ� ������, Ŭ������ ����� �ɹ����� �� static���� ������� ���� �͵���
		//�ش� �ν��Ͻ��� ���� �ö��!!
		ex1.frame = new Frame("�������� ������");
		//�����ڰ� ��ġ�� ������� ������ ����Ʈ�� ����Ǵµ� 
		//Frame�� ��� : BorderLayout�� �����
		//Panel�� ��� : FlowLayout�� �����
		for(int i=0; i<ex1.panel.length; i++){
			ex1.panel[i] = new Panel(); //�г� 1�� ���� �� �迭����
			ex1.bt[i] = new Button(ex1.title[i]);
			ex1.panel[i].add(ex1.bt[i]); //�� �гο� ��ư����!!
			ex1.frame.add(ex1.panel[i],ex1.direction[i]); //�����ӿ� �гκ���!!
		}
		ex1.frame.setVisible(true);
		ex1.frame.setSize(200,200);
		
	}
}
