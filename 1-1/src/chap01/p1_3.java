package chap01;

import java.util.Scanner;

//�������� ��ȣ �Ǵ�
public class p1_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("������ �Է��ϼ���:");
		int n= s.nextInt();
		if(n>0) System.out.println("����Դϴ�.");
		else if(n<0) System.out.println("�����Դϴ�.");
		else System.out.println("0�Դϴ�.");
	}

}
