package chapter3_1;

import java.util.Scanner;

//�����˻�
public class P3_4 {

	static int binSearch(int []a,int n,int key) {
		//�˻������� ù �ε���
		int pl=0;
		//�˻������� �� �ε���
		int pr=n-1;
		
		do {
			int pc=(pl+pr)/2;//�߾� ����� �ε���
			if(a[pc]==key)
				return pc;
			else if(a[pc]<key)
				pl=pc+1; //�˻������� ���� �������� ����
			else
				pr=pc-1;//�˻������� ���� �������� ����
		}while(pl<=pr);
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.print("��Ҽ�:");
		int n=s.nextInt();
		int x[]=new int[n];
		System.out.println("������������ �Է��ϼ���");
		
		System.out.print("x[0]:");
		x[0]=s.nextInt();
		
		for(int i=1;i<n;i++) {
			do {
				System.out.print("x["+i+"]:");
				x[i]=s.nextInt();
			}while(x[i]<x[i-1]); //������ �Ǿ��ִٴ� ����
		}
		
		System.out.print("�˻��Ұ�:");
		int key=s.nextInt();
		int index=binSearch(x, n, key);
		if(index==-1)
			System.out.println("�װ��� ��Ұ� �����ϴ�.");
		else
			System.out.println(key+"�� x["+index+"]�� �ֽ��ϴ�.");
		}
	}


