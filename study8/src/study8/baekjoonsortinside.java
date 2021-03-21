package study8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//소트인사이드 문제
//내림차순 정렬
public class baekjoonsortinside {
	static void swap(String[] a,int idx1,int idx2) {
		String tmp=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=tmp;
	}
	static void bubbleSort(String[] a, int n) {
		for(int i=0;i<n-1;i++) {
			for(int j=n-i;j>i;j--) {
				//if(a[j]>a[j+1])
					swap(a, j-1, j);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner s=new Scanner(System.in);
		String nx=s.next();
		String[] a;
		a=nx.split("");
		for(int i=0;i<nx.length();i++) {
			System.out.println(a[i]);
		}
		int n=nx.length();
		bubbleSort(a, n);

	}
}
