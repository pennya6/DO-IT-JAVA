package chap1_2;

import java.util.Scanner;

//1���� n������ ������ ���ϱ�
public class p1_4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("1���� n������ ��");
		System.out.println("n�ǰ��� �Է��Ͻÿ�:");
		int n=s.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum+=i;
			
		}
		System.out.println("sum�ǰ�"+sum);
	}

}
