package chap1_2;

import java.util.Scanner;

//�κ��� a,b�� ������ �Է��ϰ� b-a�� ����϶�
public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("�κ��� a,b�� �Է��Ͻÿ�");
		int a=s.nextInt();
		int b=s.nextInt();
		if(a==b) {System.out.println("a���� ū���� �Է��Ͻÿ�:");
		b=s.nextInt();}
		int abs=b-a;
		System.out.println(abs);
	}

}