package study9;

import java.util.Scanner;

//����Ʈ���� ���
//���� ����Ʈ ����
//�迭 �ΰ� ��� �ϳ��� ����, �ٸ��Ŵ� �̸�
//if ���̰� ������ ù��° �� ���� 


//2���� �迭�� ����Ʈ ����?
//1���� �迭 �ΰ��� ���� ��ĵ �� �Է¹޾� ��? -> ������ : ���� �迭 ����Ʈ �Ϸ��� �̸� �迭�� �ش� �ε������� �𸥴�.
//2���� �迭�� ��? -> 2���� �迭�� �������� ���ʿ�? array.sort(����������)

//������ ����?
//���� ������ �״�� �����ϴ� ����

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
		int nx=s.nextInt();
		//2���� �迭 
		//����, �̸�
		//String a[][]=new String[nx][2];
		//for(int i=0;i<nx;i++) {
			//a[i][0]=s.next();
			//a[i][1]=s.next();
		//}
		
		//1���� �迭 �ΰ��� 
		//int a[]=new int[nx];
		//String b[]=new String[nx];
		//for(int i=0;i<nx;i++) {
			//a[i]=s.nextInt();
			//b[i]=s.next();
		//}
		//quickSort(a, 0, nx-1);
		//for(int i=0;i<nx;i++) {
			//System.out.print(a[i]+" ");
			//if(a[i]==a[i+1]) {
				//System.out.println(b[i]);
			//}
		//}
		
		
	}

}
