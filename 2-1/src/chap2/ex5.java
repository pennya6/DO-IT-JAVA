package chap2;

import java.util.Scanner;

//�迭 b�� ��� ��Ҹ� �迭 a�� �������� �����ϴ� �޼��� rcopy
public class ex5 {

	public static void main(String[] args) {
		System.out.println("���� ����\n a�� ��Ҽ�:");
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int a[]=new int[n];
		
		
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		
		System.out.println("b�� ��ڼ�:");
		int m=s.nextInt();
		int b[]=new int[m];
		for(int i=0;i<m;i++) {
			b[m]=s.nextInt();
		}
		//rcopy(a,b);
		System.out.println("��������");
		for(int i=0;i<n;i++)
			System.out.println(a[i]);

	}
	static void rcopy(int []a, int[]b) {
		int n=a.length<=b.length?a.length:b.length;
		for(int i=0;i<n;i++) {
			a[i]=b[b.length-i-1];
		}
	}
}
