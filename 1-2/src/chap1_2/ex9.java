package chap1_2;

import java.util.Scanner;

//정수 a,b를 포함하여 그사이의 모든 정수의 합을 구하라
public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("a부터 b까지의 합을 구할것이다. a,b의값을 입력하라");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("sum의값은:"+sumof(a,b));
	}
	static int sumof(int a, int b) {
		int sum=0;
		for(int i=a;i<=b;i++) {
			sum+=i;
		}
		return sum;
	}

}
