package chap1_2;

import java.util.Scanner;

//n�� ����� ��쿡�� �� ���ϱ�
public class p1_6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("n�� ���� �Է��Ͻÿ�");
		n=s.nextInt();
		int sum=0;
		if(n>0) {
			for(int i=1;i<=n;i++) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
