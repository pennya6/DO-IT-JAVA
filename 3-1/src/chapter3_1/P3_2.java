package chapter3_1;

import java.util.Scanner;

//while���� �ƴ϶� for������ ����
//�迭 a�� ���� n���� ��ҿ��� key�� ���� ��Ҹ� �����˻�
public class P3_2 {
	static int seqSearch2(int[] a,int n,int key) {
		for(int i=0;i<n;i++) 
			if(a[i]==key)
				return i;
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("��Ҽ�:");
		int n=s.nextInt();
		int a[]=new int [n];
		int key;
		for(int i=0;i<n;i++) {
			System.out.print("x["+i+"]:");
			a[i]=s.nextInt();
		}
		System.out.print("�˻��� ��:");
		key=s.nextInt();
		int index=seqSearch2(a, n, key);
		if(index==-1)
			System.out.println("ã�� ���� �����ϴ�.");
		else
			System.out.println(key+"�� x["+index+"]�� �ֽ��ϴ�.");
	}

}

