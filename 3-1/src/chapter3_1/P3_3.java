package chapter3_1;

import java.util.Scanner;

//���ʹ�
public class P3_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("��Ҽ�:");
		int n=s.nextInt();
		int a[]=new int [n+1];
		int key;
		for(int i=0;i<n;i++) {
			System.out.print("x["+i+"]:");
			a[i]=s.nextInt();
		}
		System.out.print("�˻��� ��:");
		key=s.nextInt();
		int index=seqSearch(a, n, key);
		if(index==-1)
			System.out.println("ã�� ���� �����ϴ�.");
		else
			System.out.println(key+"�� x["+index+"]�� �ֽ��ϴ�.");
	

	}
	static int seqSearch(int a[], int n,int key) {
		int i=0;
		//���� �߰�
		a[n]=key;
		while(true) {
			//����Ʈ�� key���� �ִ� ���
			if(a[i]==key)
				break;
			i++;
		}
		//key���� ���� ��� 
		return i==n?-1:i;
	}

}
