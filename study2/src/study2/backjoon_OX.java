package study2;

import java.util.Scanner;

public class backjoon_OX {

	public static void main(String[] args) {
		System.out.println("test n?");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		
		int score[]=new int[100];
		String a[]=new String[1000];
		
		String ox[]=new String[] {"ooxxoxxooo","ooxoxoxo"};
		
		for(int i=0;i<ox.length;i++) {
			a[i]=ox[i].substring(i,i+1);
			System.out.println(a[i]);
			if(a[i]==a[i+1]) {
				score[i+1]++;
			}
			if(a[i]=="x") {
				score[i]=0;
			}
			else
				score[i]=1;
			sum+=score[i];
		}
		System.out.println(sum);
	}

}
