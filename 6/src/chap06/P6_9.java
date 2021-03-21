package chap06;

import java.util.Scanner;

//퀵소트
public class P6_9 {
	static void swap(int [] a, int idx1,int idx2) {
		int t=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
	}
	static void quickSort(int []a,int left,int right) {
		int pl=left;
		int pr=right;
		int x=a[(pl+pr)/2];
		do {
			while(a[pl]<x)pl++;
			while(a[pr]>x)pr--;
			if(pl<=pr)
				swap(a, pl++, pr--);
		}while(pl<=pr);
		if(left<pr)quickSort(a, left, pr);
		if(pl<right)quickSort(a, pl, right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("배열을 나눕니다.");
		System.out.print("요솟수:");
		int nx=s.nextInt();
		int []x=new int[nx];
		
		for(int i=0;i<nx;i++) {
			System.out.print("x["+i+"]: ");
			x[i]=s.nextInt();
		}
		quickSort(x, 0, nx-1);
		System.out.println("오릅차순으로 정렬했습니다.");
		for(int i=0;i<nx;i++) {
			System.out.println("x["+i+"]:"+x[i]);
		}

	}

}
