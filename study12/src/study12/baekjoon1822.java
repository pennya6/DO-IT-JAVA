package study12;

import java.util.Scanner;


public class baekjoon1822 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a_c=s.nextInt();
		int b_c=s.nextInt();
		
		Intset a=new Intset(a_c);
		Intset b=new Intset(b_c);
		
		for(int i=0;i<a_c;i++) {
			int a_in=s.nextInt();
			a.add(a_in);
		}
		for(int i=0;i<b_c;i++) {
			int b_in=s.nextInt();
			b.add(b_in);
		}
		
		a.remove(b);
		//for(int n : a) System.out.print(n + " ");
		System.out.println(a.size());
		System.out.println(a);	
	
		

	}

}
