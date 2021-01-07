package chap2;

import java.util.Scanner;

//���� ��� �ϼ� ���ϴ� ���α׷�
public class P2_13 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int retry;
		
		System.out.println("���� ��� �ϼ��� ���մϴ�.");
		
		do {
			System.out.print("��:");
			int year=s.nextInt();
			System.out.print("��:");
			int month=s.nextInt();
			System.out.print("��:");
			int day=s.nextInt();
			System.out.println(dayofyear(year, month, day)+"�Դϴ�.");
			System.out.println("retry?(1:yes/0:no)");
			retry=s.nextInt();
		}while(retry ==1);

	}
	//�Ű�����(year)�� ���޹��� ������ �����̸� 1��ȯ ����̸� 0��ȯ
	static int isLeap(int year) {
		return(year%4==0&&year%100!=0||year%400==0)?1:0;
	}
	//������ �ϼ�
	static int [][]mdays= {
			{31,28,31,30,31,30,31,31,30,31,30,31},//���
			{31,29,31,20,31,30,31,31,30,31,30,31} //����
	};
	//���� y�� m�� d���� ������ ��� �ϼ��� ����
	static int dayofyear(int y,int m,int d) {
		int days=d; //�ϼ�
		for(int i=1;i<m;i++)
			days+=mdays[isLeap(y)][i-1];
		return days;
	}

}
