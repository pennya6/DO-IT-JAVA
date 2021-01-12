package study3;

import java.util.Scanner;

//팩토리얼 문제
//재귀사용
public class backjoon10872 {

	public static void main(String[] args) {
		System.out.println("정수를 입력하시오:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=f(n);
		System.out.println(sum);
	}
	//재귀함수
	//특정함수내 자기자신을 다시 호출
	static int f(int n) {
		if(n<=1) return 1;
		return n*f(n-1);
	}

}
