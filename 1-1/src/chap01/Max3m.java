//3개의 정수값 가운데 최대값을 구하여 출력합니다.
package chap01;

import java.util.Scanner;

public class Max3m {

	//최대값을 구하는 함수 
	static int Max3(int a,int b,int c) {
		int max=a;
		if(b>max) max=b;
		if(c>max) max=c;
		return max;
	}
	public static void main(String args[]) {
		int a;
		int b;
		int c;
		Scanner s=new Scanner(System.in);
		System.out.println("총 최대값을 구할 횟수를 입력하시오 : ");
		int i=s.nextInt();
		for(int j=0;j<i;j++) {
			System.out.println("a,b,c의 값을 입력하시오");
			a=s.nextInt();
			b=s.nextInt();
			c=s.nextInt();
			System.out.println("최대값("+a+","+b+","+c+") = "+ Max3(a,b,c));
		}
	}
}
