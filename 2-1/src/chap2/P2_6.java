package chap2;

import java.util.Scanner;

public class P2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("요소수");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int h[]=new int [n];
		for(int i=0;i<n;i++) {
			h[i]=s.nextInt();
			System.out.println("x["+i+"]:"+h[i]);
		}
		System.out.println("요소를 역순으로 정렬했습니다.");
		reverse(h);
		for(int i=0;i<n;i++) {
			System.out.println("x["+i+"]:"+h[i]);
		}
	}
	//역수 실제로 되는 메소드
	static void reverse(int []a) {
		for(int i=0;i<a.length/2;i++) {
		swap(a,i,a.length-1-i);
		}
	}
	//역수 취하는 메소드
	//인덱스 끼리 바꾸는 방법
	static void swap(int []a,int index1,int index2) {
		int t=a[index1];
		a[index1]=a[index2];
		a[index2]=t;
	}

}
