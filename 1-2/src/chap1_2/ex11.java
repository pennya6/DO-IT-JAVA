package chap1_2;

import java.util.Scanner;

//���� ������ �Է��ϰ� �ڸ����� ����϶�
public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("���� ������ �Է��Ͻÿ�");
		do {
			System.out.print("��������");
			n = s.nextInt();
		} while (n <= 0);

		int no = 0; 			// �ڸ���
		while (n > 0) {
			n /= 10; 			// n�� 10���� ����
			no++;
		}

		System.out.println("�� ���� " + no + "�ڸ��Դϴ�.");
	}

}
