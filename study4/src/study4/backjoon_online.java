package study4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class backjoon_online {
	static class Member{
		private int age; //나이
		private String name; //이름
		
		public Member(String name,int age) {
			this.name=name;
			this.age=age;
		}
		public String toString() {
			return age+" "+name+" ";
		}
		public static final Comparator <Member> OUT=new OutMem();
	
		private static class OutMem implements Comparator<Member>{
			public int compare(Member m1,Member m2) {
				//나이순 정렬
				return (m1.age>m2.age)?1:(m1.age<m2.age)?-1:0;
			}
		};
	}
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//System.out.print("회원수:");
		//int n=s.nextInt();
		Member[]m= {
				new Member("Junkyu", 21),
				new Member("Dohyun", 21),
				new Member("Sunyoung", 20)	
		};
		Arrays.sort(m);
		
		

	}

}
