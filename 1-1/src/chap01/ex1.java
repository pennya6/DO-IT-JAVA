package chap01;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		Scanner s=new Scanner(System.in);
		System.out.println("�� ���� Ƚ���� �Է��Ͻÿ� : ");
		int i=s.nextInt();
		for(int j=0;j<i;j++) {
			System.out.println("a,b,c�� ���� �Է��Ͻÿ�");
			a=s.nextInt();
			b=s.nextInt();
			c=s.nextInt();
			System.out.println("�ּҰ�("+a+","+b+","+c+") = "+ min3(a,b,c));
		}
		System.out.println("�� ���� Ƚ���� �Է��Ͻÿ� : ");
		int g=s.nextInt();
		for(int j=0;j<g;j++) {
			System.out.println("a,b,c,d�� ���� �Է��Ͻÿ�");
			a=s.nextInt();
			b=s.nextInt();
			c=s.nextInt();
			d=s.nextInt();
			System.out.println("�ּҰ�("+a+","+b+","+c+","+d+") = "+ min4(a,b,c,d));
			System.out.println("�ִ밪("+a+","+b+","+c+","+d+") = "+ max4(a,b,c,d));
		}

	}
	//�� ���� �ִ��� ���ϴ� max4 �޼��� �ۼ��ϱ�
	static int max4(int a,int b, int c, int d) {
		int max=a;
		if(b>max) max=b;
		if(c>max) max=c;
		if(d>max) max=d;
		return max;
	}
	//������ �ּҰ��� ���ϴ� min3�޼��� �ۼ��ϱ�
	static int min3(int a,int b, int c) {
		int min=a;
		if(b<min)min=b;
		if(c<min)min=c;
		return min;
	}
	//�װ��� �ּҰ��� ���ϴ� min4�޼��� �ۼ��ϱ�
	static int min4(int a,int b, int c, int d) {
		int min=a;
		if(b<min)min=b;
		if(c<min)min=c;
		if(d<min)min=d;
		return min;
	}
}
