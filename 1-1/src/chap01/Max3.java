//3개의 정수를 입력받아 최대값구하기
package chap01;

import java.util.Scanner;

public class Max3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("세정수의 최대값을 구하자");
		System.out.print("a:");
		int a= sc.nextInt();
		System.out.print("b:");
		int b= sc.nextInt();
		System.out.print("c:");
		int c= sc.nextInt();
		int max=a;
		if(b>max) max=b;
		if(c>max) max=c;
		System.out.print("최대값"+max);
	}

}
