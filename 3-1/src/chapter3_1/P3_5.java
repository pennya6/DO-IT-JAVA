package chapter3_1;

import java.util.Arrays;
import java.util.Scanner;

//�⺻ �ڷ��� �迭���� binarySearch�޼��� ���
public class P3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("��Ҽ�:");
		int n=s.nextInt();
		int[]a=new int[n];
		System.out.println("������������ �Է��ϼ���");
		System.out.print("x[0]:");
		a[0]=s.nextInt();
		
		for(int i=1;i<n;i++) {
			do {
				System.out.print("x["+i+"]:");
				a[i]=s.nextInt();
			}while(a[i]<a[i-1]); //�ٷ� ���� ������ ������ �ٽ� �Է� �� �������� ������ �ȵ�
		}
		System.out.print("�˻��Ұ�:");
		int key=s.nextInt();
		int index=Arrays.binarySearch(a, key);
		if(index<0)
			System.out.println("�װ��� ��Ұ� �����ϴ�.");
		else
			System.out.println(key+"�� x["+index+"]�� �ֽ��ϴ�.");
	}

}
