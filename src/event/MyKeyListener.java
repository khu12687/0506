/*
Ű���� �̺�Ʈ�� �����ϴ� �������� KeyListener�� ������ ����
*/

package event;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
public class MyKeyListener implements KeyListener{
	
		//�Ʒ��� �߻�޼������ ���~~������ �ؾ��Ѵ�!!
		public void keyReleased(KeyEvent e){
			System.out.println("Ű���� ������ ������?");
		}
		public void keyPressed(KeyEvent e){
		//	System.out.println("Ű���� ������?");
		}
		public void keyTyped(KeyEvent e){

		}
}
