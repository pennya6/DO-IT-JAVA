package study3;

import java.util.Scanner;

//���丮�� ����
//��ͻ��
public class backjoon10872 {

	public static void main(String[] args) {
		System.out.println("������ �Է��Ͻÿ�:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=f(n);
		System.out.println(sum);
	}
	//����Լ�
	//Ư���Լ��� �ڱ��ڽ��� �ٽ� ȣ��
	static int f(int n) {
		if(n<=1) return 1;
		return n*f(n-1);
	}

}
