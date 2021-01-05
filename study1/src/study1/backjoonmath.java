package study1;

import java.util.Scanner;

//a-b-3
public class backjoonmath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("몇줄 계산을 할것인가?");
		int i=s.nextInt();
		int q[]=new int[i];
		for(int j=0;j<i;j++) {
			System.out.println("a,b을 입력하라");
			int a=s.nextInt();
			int b=s.nextInt();
			q[j]=a+b;
		}
		for(int j=0;j<i;j++) {
			System.out.println(q[j]);
		}
	}

}
