package chap1_2;

import java.util.Scanner;

//���콺������ �̿��Ͽ� n������ ���� �� ���ϱ�
public class ex8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("1���� �������� ���� ���Ұ��ΰ�?");
		int n=s.nextInt();
		System.out.println(n+"������ ����"+sum_g(n)+"�̴�.");
		
	}
	static int sum_g(int n) { //n�ǰ��� ������� ������
		int sum_g=(n+1)*n/2;
		return sum_g;
	}
}