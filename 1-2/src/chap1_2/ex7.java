package chap1_2;

import java.util.Scanner;

//n=7이고 출력은 1+2+3+4+5+6+7=28
public class ex7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("n의 값을 입력하시오");
		int n=s.nextInt();
		System.out.print(1);
		for(int i=2;i<=n;i++) {
			System.out.print("+"+i);
		}
		System.out.print("="+sum(n));
	}
	static int sum(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
}
