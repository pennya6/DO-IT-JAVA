package chapter3_1;

import java.util.Scanner;

//�����˻�
public class P3_1 {

	public static void main(String[] args) {
		//��ڼ��� n�� �迭 a���� key�� ���� ��Ҹ� �����˻��մϴ�.
		Scanner s=new Scanner(System.in);
		System.out.print("��Ҽ�:");
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("x["+i+"]:");
			a[i]=s.nextInt();
		}
		System.out.println("�˻��Ұ�:");
		int key=s.nextInt();
		int index=seqSearch(a, n, key);
		if(index==-1)
			System.out.println("���� �����ϴ�.");
		else
			System.out.println(key+"�� x["+index+"]�� �ֽ��ϴ�.");
	}
	static int seqSearch(int [] a, int n,int key){
		int i=0;
		while(true) {
			if(i==n)
				//�˻����� -1��ȯ
				return -1;
			if(a[i]==key)
				//�˻����� �ε��� ��ȯ
				return i;
			i++;
		}
	}

}
