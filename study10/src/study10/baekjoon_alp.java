package study10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//알파벳 소문자 
//길이짧은순 정렬
//길이가 같으면 사전순 정렬
public class baekjoon_alp {
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();//단어 개수
		String a[]=new String[n];
		for(int i=0;i<n;i++) {
			a[i]=s.next();
		}
		
		//길이 짧은 순 출력
		Arrays.sort(a,new Comparator<String>() {
			public int compare(String a1, String a2) {
                if(a1.length() > a2.length()) return 1;
                else if(a1.length() == a2.length()) return 0;
                else return -1;
            }
		});
		//길이가 같은 경우 
		for(int i=0;i<a.length;i++) {
			int j;
			for(j=i+1;j<n;j++ ) {
				if(a[i].length()!=a[j].length()) 
					break;
			}
			Arrays.sort(a,i,j);
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
