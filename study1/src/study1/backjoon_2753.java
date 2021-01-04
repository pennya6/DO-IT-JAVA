package study1;

import java.util.Scanner;

//윤년시 1출력 아닐시 0출력
//윤녕은 4의 배수 이면서 100의 배수가 아닐때 또는 400의 배수 일때
public class backjoon_2753 {

	public static void main(String[] args) {
		System.out.println("연도를 입력하시오:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
			if(n%4==0) {
				if(n%400==0) System.out.println(1);
				else if(n%100==0) System.out.println(0);
				else System.out.println(1);
			}
			else System.out.println(0);
	}

}
