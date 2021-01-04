package chap1_2;

import java.util.Scanner;

public class p1_8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다."+"\n"+"몇단 삼각형입니까?");
		int n=s.nextInt();
		for(int j=1;j<=n;j++) {
			for(int i=1;i<=j;i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
