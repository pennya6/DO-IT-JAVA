package chap1_2;

import java.util.Scanner;

//n이 양수인 경우에만 합 구하기
public class p1_6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("n의 값을 입력하시오");
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
