package chap1_2;

import java.util.Scanner;

//직각 이등변 삼각형을 출력하는 부분을 아래와 같은 형식의 메서드로 작성하세요
public class ex15 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("n을 입력하시오");
		int n=s.nextInt();
		triangleLB(n);
		triangleLU(n);
		triangleRB(n);
		triangleRU(n);
	}
	//왼쪽아래
	static void triangleLB(int n) {
		for(int j=1;j<=n;j++) {
			for(int i=1;i<=j;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//오른쪽위
	static void triangleRU(int n) {
		for (int i = 1; i <= n; i++) { 				// i행 (i = 1, 2, … ,n)
			for (int j = 1; j <= i - 1; j++) 		// i-1개의 ' '를 나타냄
				System.out.print(' ');
			for (int j = 1; j <= n - i + 1; j++) 	// n-i+1개의 '*'를 나타냄
				System.out.print('*');
			System.out.println();					// 개행(줄변환)
		}
	}
	//왼쪽위
	static void triangleLU(int n) {
		for(int j=1;j<=n;j++) {
			for(int i=1;i<=n-j;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//오른쪽아래
	static void triangleRB(int n) {
		for (int i = 1; i <= n; i++) { 				// i행 (i = 1, 2, … ,ln)
			for (int j = 1; j <= n - i; j++) 		// n-i개의 ' '를 나타냄
				System.out.print(' ');
			for (int j = 1; j <= i; j++) 			// i개의 '*'를 나타냄
				System.out.print('*');
			System.out.println(); 					// 개행(줄변환)
		}
	}


}
