package chap1_2;

import java.util.Scanner;

//두변수 a,b에 정수를 입력하고 b-a를 출력하라
public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("두변수 a,b를 입력하시오");
		int a=s.nextInt();
		int b=s.nextInt();
		if(a==b) {System.out.println("a보다 큰값을 입력하시오:");
		b=s.nextInt();}
		int abs=b-a;
		System.out.println(abs);
	}

}
