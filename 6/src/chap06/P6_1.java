package chap06;

import java.util.Scanner;

public class P6_1 {
	static void swap(int a[],int idx1,int idx2) {
		int t=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
	}
	static void bubbleSort(int a[],int n) {
		for(int i=0;i<n-1;i++) {
			for(int j=n-1;j>i;j--) {
				if(a[j-1]>a[j])
					swap(a, j-1, j);
			}
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
