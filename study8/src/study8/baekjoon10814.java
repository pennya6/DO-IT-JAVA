package study8;

import java.util.Scanner;

//����Ʈ���� ���
//���� ����Ʈ ����
//�迭 �ΰ� ��� �ϳ��� ����, �ٸ��Ŵ� �̸�
//if ���̰� ������ ù��° �� ���� 
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
		//2���� �迭 
		//����, �̸�
		String a[][]=new String[nx][2];
		for(int i=0;i<nx;i++) {
			a[i][0]=s.next();
			a[i][1]=s.next();
		}
		
		
	}

}
