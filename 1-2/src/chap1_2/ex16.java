package chap1_2;

import java.util.Scanner;

//n���� �Ƕ�̵� ���
public class ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("n�ǰ��� �Է��Ͻÿ�");
		int a=s.nextInt();
		spira(a);
	}
	static void spira(int n) {
		for (int i = 1; i <= n; i++) { 					// i�� (i = 1, 2, �� ,n)
			for (int j = 1; j <= n - i + 1; j++) 		// n-i+1���� ' '�� ��Ÿ��
				System.out.print(' ');
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	// (i-1)*2+1���� '*'�� ��Ÿ��
				System.out.print('*');
			System.out.println(); 						// ����(�ٺ�ȯ)
		}
	}
}
