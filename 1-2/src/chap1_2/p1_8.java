package chap1_2;

import java.util.Scanner;

public class p1_8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("���� �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�."+"\n"+"��� �ﰢ���Դϱ�?");
		int n=s.nextInt();
		for(int j=1;j<=n;j++) {
			for(int i=1;i<=j;i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
