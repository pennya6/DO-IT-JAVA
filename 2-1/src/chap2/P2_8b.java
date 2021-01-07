package chap2;

import java.util.Scanner;

//기수변환
public class P2_8b {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int no;//변환하는 정수
		int c;//기수
		int dno;//변환후의 자리수
		int retry;//다시 한번?
		char cno[]=new char[32]; //변환후의 각자리의 숫자를 넣어두는 문자의 배열
		
		System.out.println("10진수를 기수변환합니다.");
		do {
			do {
				System.out.print("음수가 아닌 변환하는 정수를 입력하시오:");
				no=s.nextInt();
			}while(no<0);
			do {
				System.out.print("어떤 진수로 변환할까요?(2~36):");
				c=s.nextInt();
			}while(c<2||c>36);
			//no을 c진수로 변환
			dno=cardConvR(no,c,cno);
			System.out.print(c+"진수로는");
			//윗자리부터 차례로 나타내는 반복문
			for(int i=dno-1;i>=0;i--) {
				System.out.print(cno[i]);
			}
			System.out.println("입니다.");
			
			System.out.print("한번더 할까요?(1.예/아니요):");
			retry=s.nextInt();
		}while(retry==1);

	}
	//정숫값 x를 r진수로 변환하여 배열 c에 아래자리부터 넣어두고 자릿수 반환
	static int cardConvR(int x, int r, char []c) {
		int digits=0;
		String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			c[digits++]=dchar.charAt(x%r);
			x/=r;
		}while(x!=0);
		return digits;
	}

	

}
