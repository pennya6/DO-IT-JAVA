package chap01;

import java.util.Scanner;

//정수값의 부호 판단
public class p1_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("정수를 입력하세요:");
		int n= s.nextInt();
		if(n>0) System.out.println("양수입니다.");
		else if(n<0) System.out.println("음수입니다.");
		else System.out.println("0입니다.");
	}

}
