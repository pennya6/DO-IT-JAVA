package study4;

import java.util.Arrays;
import java.util.Scanner;

public class backjoon1472 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		//0~9���� ������ 10
		int count[]=new int[10];
		//���ڿ��� ����
		String n=s.nextLine();
		
		int a=n.length();
		char [] q=new char[a];
		for(int i=0;i<n.length();i++) {
			q[i]=n.charAt(i);
		}
		//����
		Arrays.sort(q);
		//�������� ����
		for(int i=q.length-1;i>=0;i--) {
			System.out.print(q[i]);
		}
		
		
	}

}
