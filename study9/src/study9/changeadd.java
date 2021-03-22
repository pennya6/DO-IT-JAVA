package study9;
//�ΰ��� �迭(a[],b[])
//�ΰ��� �迭�� a[]�������� ���� ���Ѵ�. 
//1.����Ʈ ����
//2.a[]�� �ּ� ���� �̰�
//  b[]�� �ִ��� ���� �̾Ƽ� swap
//3.a[]�� �� ���ϱ�

import java.util.Scanner;

public class changeadd {
	static void swap(int []a,int idx1,int idx2) {
		int t=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
	}
	//�ι迭 swap
	static void swap2(int []a,int []b,int idx1,int idx2) {
		int t=a[idx1];
		a[idx1]=b[idx2];
		b[idx2]=t;
	}
	static int add(int []a,int k) {
		int sum=0;
		for(int i=0;i<k;i++) {
			sum+=a[i];
		}
		return sum;
	}
	static void quickSort(int a[],int left, int right) {
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
		Scanner s=new Scanner(System.in);
		int k=s.nextInt(); //�迭����
		int n=s.nextInt(); //�ٲ�ġ�� ���� ��
		int a[]=new int[k];
		int b[]=new int[k];
		
		for(int i=0;i<k;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<k;i++) {
			b[i]=s.nextInt();
		}
		//������
		quickSort(a, 0, k-1);
		quickSort(b, 0, k-1);
		
		for(int i=0;i<k;i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		for(int i=0;i<k;i++) {
			System.out.print(b[i]);
		}
		System.out.println();
		//�迭a�� �ִ� ���� �� n����
		//�迭 b�� �ִ� ū �� n�� �ٲٱ�
		for(int i=0;i<n;i++) {
			
			//k=5
			//a[] 0 1 2
 			//b[] 4 3 2
			if(a[i]<b[k-i-1])
				swap2(a, b,i, k-i-1);
		}
		System.out.println(add(a,k));
		for(int i=0;i<k;i++) {
			System.out.print(a[i]);
		}
		
	}

}
