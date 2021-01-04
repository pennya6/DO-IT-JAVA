package chap1_2;

import java.util.Scanner;

//양의 정수를 입력하고 자릿수를 출력하라
public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("양의 정수를 입력하시오");
		do {
			System.out.print("정수값：");
			n = s.nextInt();
		} while (n <= 0);

		int no = 0; 			// 자릿수
		while (n > 0) {
			n /= 10; 			// n을 10으로 나눔
			no++;
		}

		System.out.println("그 수는 " + no + "자리입니다.");
	}

}
