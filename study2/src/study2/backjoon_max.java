package study2;

import java.util.Scanner;

//최대값구하기
public class backjoon_max {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("몇개?");
		int n=s.nextInt();
		int m[]=new int [n];
		for(int i=0;i<n;i++) {
			m[i]=s.nextInt();
		}
		int count=0;
		int max=m[0];
		for(int i=0;i<n;i++) {
			count++;
			if(max<m[i]) max=m[i];			
		}
		System.out.println(max);
		System.out.print(count);

	}

}
