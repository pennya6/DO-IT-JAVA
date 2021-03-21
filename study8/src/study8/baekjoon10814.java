package study8;

import java.util.Scanner;

//퀵소트정렬 사용
//나이 퀵소트 정렬
//배열 두개 사용 하나는 나이, 다른거는 이름
//if 나이가 같으면 첫번째 온 숫자 
public class baekjoon10814 {
	static void swap(int []a,int idx1,int idx2) {
		int t=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
	}
	static void quickSort(int a[],int left, int right) {
		int pl=left;
		int pr=right;
		int x=a[(pl+pr)/2];
		
		//System.out.printf("a[%d]~a[%d]:{",left,right);
		//for(int i=left;i<right;i++) {
			//System.out.printf("%d, ",a[i]);
		//}
		//System.out.printf("%d}\n",a[right]);
		
		do {
			while(a[pl]<x)pl++;
			while(a[pr]>x)pr--;
			if(pl<=pr)
				swap(a,pl++,pr--);
		}while(pl<=pr);
		
		if(left<pr) quickSort(a, left, pr);
		if(pl<right) quickSort(a, pl, right);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int nx=s.nextInt();
		//2차원 배열 
		//나이, 이름
		String a[][]=new String[nx][2];
		for(int i=0;i<nx;i++) {
			a[i][0]=s.next();
			a[i][1]=s.next();
		}
		
		
	}

}
