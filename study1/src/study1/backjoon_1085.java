package study1;

import java.util.Scanner;

//�Ѽ��� ���� (x,y)
//���簢���� ���� �Ʒ� ��������(0,0)
//������ ����������(w,h)
//���簢���� ��輱���� �Ÿ��� �ּڰ�
public class backjoon_1085 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("x,y,w,h�� ���� �Է��Ͻÿ�");
		int x=s.nextInt();
		int y=s.nextInt();
		int w=s.nextInt();
		int h=s.nextInt();
		
		//java.lang.MathŬ����
		//���а� ���õ� �Ϸ��� �۾����� ó���� �� �ִ� Ŭ����
		//x���ּ�
		int xmin=Math.min(x, w-x); 
		//y���ּ�
		int ymin=Math.min(y, h-y);
		
		System.out.println("�ּҰ�:"+Math.min(xmin, ymin));
	}
}
