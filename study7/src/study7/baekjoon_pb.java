package study7;

import java.util.Scanner;

public class baekjoon_pb {
//피보나치수열
	static int ph(int n) {
		if(n<=1)
			return n;
		else
			return ph(n-2)+ph(n-1);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(ph(n));
	}
}
