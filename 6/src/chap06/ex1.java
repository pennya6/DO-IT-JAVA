package chap06;

import java.util.Scanner;

//버블정렬을 왼쪽부터 수행
public class ex1 {
	
	static void swap(int a[],int idx1,int idx2) {
		int t=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
	}
	static void bubbleSort(int[] a, int n) {
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) // 머리→꼬리로로 스캔
				if (a[j] > a[j + 1])
					swap(a, j, j + 1);
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int nx=s.nextInt();
		int a[]=new int[nx];
		for(int i=0;i<nx;i++) {
			System.out.print("a["+i+"]:");
			a[i]=s.nextInt();
		}
		bubbleSort(a, nx);
		for(int i=0;i<nx;i++) {
			System.out.println("a["+i+"]:"+a[i]);
		}

	}

}
