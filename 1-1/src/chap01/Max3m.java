//3���� ������ ��� �ִ밪�� ���Ͽ� ����մϴ�.
package chap01;

import java.util.Scanner;

public class Max3m {

	//�ִ밪�� ���ϴ� �Լ� 
	static int Max3(int a,int b,int c) {
		int max=a;
		if(b>max) max=b;
		if(c>max) max=c;
		return max;
	}
	public static void main(String args[]) {
		int a;
		int b;
		int c;
		Scanner s=new Scanner(System.in);
		System.out.println("�� �ִ밪�� ���� Ƚ���� �Է��Ͻÿ� : ");
		int i=s.nextInt();
		for(int j=0;j<i;j++) {
			System.out.println("a,b,c�� ���� �Է��Ͻÿ�");
			a=s.nextInt();
			b=s.nextInt();
			c=s.nextInt();
			System.out.println("�ִ밪("+a+","+b+","+c+") = "+ Max3(a,b,c));
		}
	}
}