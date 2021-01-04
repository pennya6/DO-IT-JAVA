package chap01;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		Scanner s=new Scanner(System.in);
		System.out.println("총 구할 횟수를 입력하시오 : ");
		int i=s.nextInt();
		for(int j=0;j<i;j++) {
			System.out.println("a,b,c의 값을 입력하시오");
			a=s.nextInt();
			b=s.nextInt();
			c=s.nextInt();
			System.out.println("최소값("+a+","+b+","+c+") = "+ min3(a,b,c));
		}
		System.out.println("총 구할 횟수를 입력하시오 : ");
		int g=s.nextInt();
		for(int j=0;j<g;j++) {
			System.out.println("a,b,c,d의 값을 입력하시오");
			a=s.nextInt();
			b=s.nextInt();
			c=s.nextInt();
			d=s.nextInt();
			System.out.println("최소값("+a+","+b+","+c+","+d+") = "+ min4(a,b,c,d));
			System.out.println("최대값("+a+","+b+","+c+","+d+") = "+ max4(a,b,c,d));
		}

	}
	//네 값의 최댓값을 구하는 max4 메서드 작성하기
	static int max4(int a,int b, int c, int d) {
		int max=a;
		if(b>max) max=b;
		if(c>max) max=c;
		if(d>max) max=d;
		return max;
	}
	//세값의 최소값을 구하는 min3메서드 작성하기
	static int min3(int a,int b, int c) {
		int min=a;
		if(b<min)min=b;
		if(c<min)min=c;
		return min;
	}
	//네값의 최소값을 구하는 min4메서드 작성하기
	static int min4(int a,int b, int c, int d) {
		int min=a;
		if(b<min)min=b;
		if(c<min)min=c;
		if(d<min)min=d;
		return min;
	}
}
