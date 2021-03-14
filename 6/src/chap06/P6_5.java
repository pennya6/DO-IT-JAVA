package chap06;

import java.util.Scanner;

public class P6_5 {

	static void insertionSort(int[] a,int n) {
		for(int i=1;i<n;i++) {
			int j;
			int tmp=a[i];
			for(j=i;j>0&&a[j-1]>tmp;j--) {
				a[j]=a[j-1];
			}
			a[j]=tmp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int nx=s.nextInt();
		int[]a=new int[nx];
		for(int i=0;i<nx;i++) {
			System.out.println("a["+i+"]:");
			a[i]=s.nextInt();
		}
		insertionSort(a, nx);
		for(int i=0;i<nx;i++) {
			System.out.println(a[i]);
		}

	}

}
