package chap1_2;

import java.util.Scanner;

//2�ڸ� ������ �Է������ϱ�
public class P1C_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("���ڸ� ������ �Է��Ͻÿ�");
		int a=s.nextInt();
		do {
			System.out.println("�ٽ� �Է��Ͻÿ�");
			a=s.nextInt();
		}while(a<10||a>99);
		System.out.println(a);
	}

}