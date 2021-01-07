package chap2;

import java.util.Scanner;

//y�� m�� d���� ���� ���� �ϼ��� ���ϴ� �Ʒ� �޼��带 �ۼ��ϼ���
public class ex9 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry; // �� �� ����

		System.out.println("������ ���� �� ���� ���մϴ�.");

		do {
			System.out.print("�⣺");
			int year = stdIn.nextInt(); // ��
			System.out.print("����");
			int month = stdIn.nextInt(); // ��
			System.out.print("�ϣ�");
			int day = stdIn.nextInt(); // ��

			System.out.printf("������ ���� �� ���� %d���Դϴ�.\n", leftdayofyear(year, month, day));

			System.out.print("�ѹ� �� �ұ��? (1.��/0.�ƴϿ�)��");
			retry = stdIn.nextInt();
		} while (retry == 1);

	}
	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // ���
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // ����
	};
	//������ 
	static int isLeap(int year) {
		return (year%4==0&&year%100!=0||year%400==0)?1:0;
	}
	
	//�����ϰ��
	static int leftdayofyear(int y, int m, int d) {
		int days=d;
		for (int i = 1; i < m; i++) // 1��~(m-1)���� �� ���� ����
			days += mdays[isLeap(y)][i - 1];
		return 365 + isLeap(y) - days;
	}

}
