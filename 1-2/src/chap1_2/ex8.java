package chap1_2;

import java.util.Scanner;

//가우스덧셈을 이용하여 n까지의 정수 합 구하기
public class ex8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("1부터 어디까지의 합을 구할것인가?");
		int n=s.nextInt();
		System.out.println(n+"까지의 합은"+sum_g(n)+"이다.");
		
	}
	static int sum_g(int n) { //n의값은 몇까지의 합인지
		int sum_g=(n+1)*n/2;
		return sum_g;
	}
}
