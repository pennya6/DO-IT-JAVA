package study8;

import java.util.Scanner;

//오름차순 정렬
//중복 없음
public class baekjoon2750 {

	static void swap(int a[],int idx1,int idx2) {
		int tmp=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=tmp;
	}
	static void bubbleSort(int a[],int n) {
		int check[]=new int[n];
		for(int i=0;i<n-1;i++) {
			for(int j=n-1;j>i;j--) {
				if(a[j-1]>a[j])
					swap(a, j-1, j);
				//중복방지
				if(a[j-1]==a[j]) {
					check[j]++;
				}
			}
		}
		for(int i=0;i<n;i++) {
			if(check[i]==0)
			System.out.println("a["+i+"]:"+a[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int nx=s.nextInt();
		int a[]=new int [nx];
		
		for(int i=0;i<nx;i++) {
			System.out.print("a["+i+"]:");
			a[i]=s.nextInt();
		}
		bubbleSort(a, nx);
		

	}

}
