package study2;

import java.util.Scanner;

//������ ����
public class backjoon3052 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		  int[] n = new int[10];
		   int count = 0;
		  
		   for(int i=0;i<10;i++) {   //10������ �Է¹ް� 42�� ������.
		          n[i] = sc.nextInt()%42; 		         
		   }
		 
		   for(int i=0;i<10;i++) {      //10���� �ߺ����� �ִ��� �����ϴ� �κ�
		   int cnt = 0;
		   for(int j=i+1 ;j<10 ;j++) {   
		   if(n[i]==n[j]) {     //������ ����� j ���� �������� ã�´�.
		   cnt++;
		   }
		   }
		   if(cnt==0) {   //�������� �������� ���ڸ� �����ش�.
		   count++;
		   }
		   }
		   System.out.println(count);
		   }
	}