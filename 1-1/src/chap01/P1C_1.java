package chap01;

import java.util.Scanner;

//세값의 중앙값구하기
public class P1C_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("세정수의 중앙값을 구하자");
		System.out.println("a,b,c의 값을 입력하라");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		System.out.println("중앙값은:"+med3(a,b,c));

	}
	static int med3(int a, int b, int c) {
		if(a>=b)
			if(b>c) return b;
			else if(a<c) return a;
			else return c;
		else if(a>c) return a;
		else if(b>c)return c;
		else return b;
		
	}

}
