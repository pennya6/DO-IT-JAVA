package chap2;

import java.util.Scanner;

//�����ȯ������ �ڼ��� ��Ÿ���� ���α׷�
public class ex7 {

	public static void main(String[] args) {
		System.out.println("10������ �����ȯ�մϴ�.");
		Scanner s=new Scanner(System.in);
		System.out.print("��ȯ�ϴ� ���� �ƴ� ������ �Է��Ͻÿ�:");
		int n=s.nextInt(); //��ȯ�ϴ� ����
		System.out.print("������� ��ȯ�ұ��?(2-36):");
		int w;
		do {
			w=s.nextInt();
		}while(w<2||w>36);

		int dno;
		char cno[]=new char[32];
		dno=cardConv(n,w,cno);
		
		System.out.print(w+"������ ");
		for(int i=dno-1;i>=0;i--) {
			System.out.print(cno[i]);
		}
		System.out.println("�Դϴ�.");
		
	}
	static int cardConv(int x, int r, char d[]) {
		int digits=0;
		int n = ((Integer) x).toString().length(); // ��ȯ ���� �ڸ���
		String dchar="0123456789ABCDEFGHIJKLNMOPQRSTUVWXYZ";
		do {
			System.out.printf("   +");
			for (int i = 0; i < n + 2; i++)
				System.out.print('-');
			System.out.println();

			if (x / r != 0)
				System.out.printf(String.format("%%2d | %%%dd    �� %%d\n", n), r, x / r, x % r);
			else
				System.out.printf(String.format("     %%%dd    �� %%d\n", n), x / r, x % r);
			d[digits++] = dchar.charAt(x % r); // r�� ���� �������� ����
			x /= r;
		}while(x!=0);
		do {
			d[digits++]=dchar.charAt(x%r);
			x/=r;
		}while(x!=0);
		return digits;
	}

}
