package study4;

import java.util.Arrays;
import java.util.Scanner;

//세수정렬
public class backjoon2752 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n=s.nextLine();
		char a[]=new char[n.length()];
		for(int i=0;i<a.length;i++) {
			a[i]=n.charAt(i);
		}
		Arrays.sort(a);
		System.out.println(a);

	}

}
