package chap1_2;

import java.util.Scanner;

//n단이 피라미드 출력
public class ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("n의값을 입력하시오");
		int a=s.nextInt();
		spira(a);
	}
	static void spira(int n) {
		for (int i = 1; i <= n; i++) { 					// i행 (i = 1, 2, … ,n)
			for (int j = 1; j <= n - i + 1; j++) 		// n-i+1개의 ' '를 나타냄
				System.out.print(' ');
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	// (i-1)*2+1개의 '*'를 나타냄
				System.out.print('*');
			System.out.println(); 						// 개행(줄변환)
		}
	}
}
