package chapter3_1;

import java.util.Scanner;
public class ex1 {
//�����˻�
static int binSearch(int []a,int n,int key) {
	int i;

	a[n] = key; // ���ʸ� �߰�

	for (i = 0; a[i] != key; i++);
	//i==n�̸� �����̹Ƿ� ã���� �ϴ� ���� ���� �� -1 ���
	//�ƴϸ� i���
	return i == n ? -1 : i;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.print("��Ҽ�:");
		int n=s.nextInt();
		int x[]=new int[n+1];
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


