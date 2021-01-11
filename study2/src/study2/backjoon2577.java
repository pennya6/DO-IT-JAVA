package study2;

import java.util.Scanner;

//ABC
//2577
public class backjoon2577 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		int x=a*b*c;
		//str은 숫자 0-9까지
		int [] str=new int[10];
		while(x>0) {
			str[x%10]++;
			x/=10;
		}
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}
	
}
