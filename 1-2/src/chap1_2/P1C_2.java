package chap1_2;

import java.util.Scanner;

//2자리 정수만 입력저장하기
public class P1C_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("두자리 정수를 입력하시오");
		int a=s.nextInt();
		do {
			System.out.println("다시 입력하시오");
			a=s.nextInt();
		}while(a<10||a>99);
		System.out.println(a);
	}

}
