package chap06;

import java.util.Scanner;

public class P6_6 {
	static void shellSort(int a[],int n) {
		for(int h=n/2;h>0;h/=2) {
			for(int i=h;i<n;i++) {
				int j;
				int tmp=a[i];
				for(j=i-h;j>=00&&a[j]>tmp;j-=h)
					a[j+h]=a[j];
				a[j+h]=tmp;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int nx=s.nextInt();
		int a[]=new int[nx];
		for(int i=0;i<nx;i++) {
			System.out.println("a["+i+"]:");
			a[i]=s.nextInt();
		}
		shellSort(a, nx);
		for(int i=0;i<nx;i++) {
			System.out.println(a[i]);
		}
	}

}
