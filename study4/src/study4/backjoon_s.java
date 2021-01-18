package study4;

import java.util.Scanner;
//10809
//알파벳 소문자 단어 s
public class backjoon_s {
//indexof
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int count=0;
		String s=sc.nextLine();
		
		int []b=new int[26];
		
		for(int i=0;i<26;i++) {
			b[i]=-1;
		}
		
		for(int i=0;i<s.length();i++) {
			
			char a=s.charAt(i);
			
			int a2=(int)a;
			
			if(b[a-97]==-1) {
				b[a-'a']=i;
			}
			
			else {
				count+=1;
			}
		}
		
		for(int i=0;i<26;i++) {
			System.out.print(b[i]+" ");
		}
	}

}
