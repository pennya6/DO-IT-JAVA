package study12;

import java.util.Scanner;

//대칭차집합
public class baekjoon1269 {

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
		
		Intset x=new Intset(a_c);
		Intset y=new Intset(b_c);
		x.copyFrom(a);
		//System.out.println(x);
		x.remove(b);
		
		y.copyFrom(b);
		//System.out.println(y);
		y.remove(a);
		
		int sum=x.size()+y.size();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(sum);
		
		
	}

}
