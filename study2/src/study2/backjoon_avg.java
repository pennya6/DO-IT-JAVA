package study2;

import java.util.Scanner;

public class backjoon_avg {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("테스트 수");
		int n=s.nextInt();
		int num=s.nextInt();
		int a[]=new int[num];
		double sum=0;
		double avg=0;
		for(int i=0;i<n;i++) {
			System.out.print(num);
			for(int j=0;i<num;i++) {
				a[j]=s.nextInt();
				//System.out.print(a[j]);
				sum+=a[j];
			}			
		}
		avg=sum/a.length;
		System.out.println(avg);
		int g=a(a,avg)/n;
		System.out.println(g);
		}
	static int a(int a[],double avg) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>=avg) {
				count++;
				
			}
		}
		return count;
	}

}
