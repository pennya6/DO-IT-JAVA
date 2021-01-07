package chap2;

import java.util.Scanner;

//기수변환과정을 자세히 나타내는 프로그램
public class ex7 {

	public static void main(String[] args) {
		System.out.println("10진수를 기수변환합니다.");
		Scanner s=new Scanner(System.in);
		System.out.print("변환하는 음이 아닌 정수를 입력하시오:");
		int n=s.nextInt(); //변환하는 정수
		System.out.print("어떤진수로 변환할까요?(2-36):");
		int w;
		do {
			w=s.nextInt();
		}while(w<2||w>36);

		int dno;
		char cno[]=new char[32];
		dno=cardConv(n,w,cno);
		
		System.out.print(w+"진수로 ");
		for(int i=dno-1;i>=0;i--) {
			System.out.print(cno[i]);
		}
		System.out.println("입니다.");
		
	}
	static int cardConv(int x, int r, char d[]) {
		int digits=0;
		int n = ((Integer) x).toString().length(); // 변환 전의 자릿수
		String dchar="0123456789ABCDEFGHIJKLNMOPQRSTUVWXYZ";
		do {
			System.out.printf("   +");
			for (int i = 0; i < n + 2; i++)
				System.out.print('-');
			System.out.println();

			if (x / r != 0)
				System.out.printf(String.format("%%2d | %%%dd    … %%d\n", n), r, x / r, x % r);
			else
				System.out.printf(String.format("     %%%dd    … %%d\n", n), x / r, x % r);
			d[digits++] = dchar.charAt(x % r); // r로 나눈 나머지를 저장
			x /= r;
		}while(x!=0);
		do {
			d[digits++]=dchar.charAt(x%r);
			x/=r;
		}while(x!=0);
		return digits;
	}

}
