package chap01;

import java.util.Scanner;

//������ �߾Ӱ����ϱ�
public class P1C_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("�������� �߾Ӱ��� ������");
		System.out.println("a,b,c�� ���� �Է��϶�");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		System.out.println("�߾Ӱ���:"+med3(a,b,c));

	}
	static int med3(int a, int b, int c) {
		if(a>=b)
			if(b>c) return b;
			else if(a<c) return a;
			else return c;
		else if(a>c) return a;
		else if(b>c)return c;
		else return b;
		
	}

}
