package chapter3_1;

import java.util.Scanner;


//��Ҽ��� n�� �迭 a���� 
//key�� ��ġ�ϴ� ��� ����� �ε����� 
//�迭 idx�� �Ǿպ��� ������� ����
//��ġ�ϴ� ��ڼ� ��ȯ
public class ex3 {

	static int searchIdx(int [] a,int n,int key,int[] idx) {
		int count=0;
		for(int i=0;i<n;i++) {
			if(a[i]==key) { 
				idx[count++]=i;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("��Ҽ�:");
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.print("ã�°�:");
		int key=s.nextInt();
		
		int[] idx=new int[n];
		int d=searchIdx(a, n, key, idx);

		System.out.print(d);
		if(d==-1)
			System.out.print("ã�� ���� �����ϴ�.");
	}

}
