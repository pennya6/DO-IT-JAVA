package chap1_2;

import java.util.Scanner;

//���� �̵ �ﰢ���� ����ϴ� �κ��� �Ʒ��� ���� ������ �޼���� �ۼ��ϼ���
public class ex15 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("n�� �Է��Ͻÿ�");
		int n=s.nextInt();
		triangleLB(n);
		triangleLU(n);
		triangleRB(n);
		triangleRU(n);
	}
	//���ʾƷ�
	static void triangleLB(int n) {
		for(int j=1;j<=n;j++) {
			for(int i=1;i<=j;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//��������
	static void triangleRU(int n) {
		for (int i = 1; i <= n; i++) { 				// i�� (i = 1, 2, �� ,n)
			for (int j = 1; j <= i - 1; j++) 		// i-1���� ' '�� ��Ÿ��
				System.out.print(' ');
			for (int j = 1; j <= n - i + 1; j++) 	// n-i+1���� '*'�� ��Ÿ��
				System.out.print('*');
			System.out.println();					// ����(�ٺ�ȯ)
		}
	}
	//������
	static void triangleLU(int n) {
		for(int j=1;j<=n;j++) {
			for(int i=1;i<=n-j;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//�����ʾƷ�
	static void triangleRB(int n) {
		for (int i = 1; i <= n; i++) { 				// i�� (i = 1, 2, �� ,ln)
			for (int j = 1; j <= n - i; j++) 		// n-i���� ' '�� ��Ÿ��
				System.out.print(' ');
			for (int j = 1; j <= i; j++) 			// i���� '*'�� ��Ÿ��
				System.out.print('*');
			System.out.println(); 					// ����(�ٺ�ȯ)
		}
	}


}
