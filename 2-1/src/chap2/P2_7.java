package chap2;

import java.util.Scanner;

//모든 요소의 값이 같은가
public class P2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("배열 a의 요솟수:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
			System.out.println("a["+i+"]:"+a[i]);
		}
		System.out.println("배열 b의 요솟수:");
		int p=s.nextInt();
		int []b=new int[p];
		for(int i=0;i<b.length;i++) {
			b[i]=s.nextInt();
			System.out.println("b["+i+"]:"+b[i]);
		}
		System.out.println(equals(a, b));
	}
	static boolean equals(int [] a,int [] b) {
		if(a.length!=b.length) return false;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i]) return false;
		}
		return true;
	}

}
