package chap1_2;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("사각형을 출력합니다."+"\n"+"단수");
		int n=s.nextInt();
		for(int j=1;j<=n;j++) {
			for(int i=1;i<=n;i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
