package study1;

import java.util.Scanner;

//���ڱ���
public class backjoon1765 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int tar=s.nextInt();
		int m=s.nextInt();//������̼�
		int w=s.nextInt();//���װ�����
		int []a=new int[m];
		int []b=new int[w];
		//��������Է¹ޱ�
		for(int i=0;i<m;i++) {
			a[i]=s.nextInt();
		}
		//���װ����Է¹ޱ�
		for(int i=0;i<w;i++) {
			b[i]=s.nextInt();
		}
	}
	
}
