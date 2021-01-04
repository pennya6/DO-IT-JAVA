package chap1_2;

import java.util.Scanner;

//1부터 n까지의 정수합 구하기
public class p1_4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("1부터 n까지의 합");
		System.out.println("n의값을 입력하시오:");
		int n=s.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum+=i;
			
		}
		System.out.println("sum의값"+sum);
	}

}
