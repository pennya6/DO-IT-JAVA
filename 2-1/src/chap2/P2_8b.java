package chap2;

import java.util.Scanner;

//�����ȯ
public class P2_8b {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int no;//��ȯ�ϴ� ����
		int c;//���
		int dno;//��ȯ���� �ڸ���
		int retry;//�ٽ� �ѹ�?
		char cno[]=new char[32]; //��ȯ���� ���ڸ��� ���ڸ� �־�δ� ������ �迭
		
		System.out.println("10������ �����ȯ�մϴ�.");
		do {
			do {
				System.out.print("������ �ƴ� ��ȯ�ϴ� ������ �Է��Ͻÿ�:");
				no=s.nextInt();
			}while(no<0);
			do {
				System.out.print("� ������ ��ȯ�ұ��?(2~36):");
				c=s.nextInt();
			}while(c<2||c>36);
			//no�� c������ ��ȯ
			dno=cardConvR(no,c,cno);
			System.out.print(c+"�����δ�");
			//���ڸ����� ���ʷ� ��Ÿ���� �ݺ���
			for(int i=dno-1;i>=0;i--) {
				System.out.print(cno[i]);
			}
			System.out.println("�Դϴ�.");
			
			System.out.print("�ѹ��� �ұ��?(1.��/�ƴϿ�):");
			retry=s.nextInt();
		}while(retry==1);

	}
	//������ x�� r������ ��ȯ�Ͽ� �迭 c�� �Ʒ��ڸ����� �־�ΰ� �ڸ��� ��ȯ
	static int cardConvR(int x, int r, char []c) {
		int digits=0;
		String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			c[digits++]=dchar.charAt(x%r);
			x/=r;
		}while(x!=0);
		return digits;
	}

	

}
