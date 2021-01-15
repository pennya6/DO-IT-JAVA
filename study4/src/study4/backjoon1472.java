package study4;

import java.util.Arrays;
import java.util.Scanner;

public class backjoon1472 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		//0~9까지 임으로 10
		int count[]=new int[10];
		//문자열로 받음
		String n=s.nextLine();
		
		int a=n.length();
		char [] q=new char[a];
		for(int i=0;i<n.length();i++) {
			q[i]=n.charAt(i);
		}
		//정렬
		Arrays.sort(q);
		//내림차순 정렬
		for(int i=q.length-1;i>=0;i--) {
			System.out.print(q[i]);
		}
		
		
	}

}
