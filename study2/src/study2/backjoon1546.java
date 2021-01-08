package study2;

import java.util.Scanner;

public class backjoon1546 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("°ú¸ñ¼ö");
		int n=s.nextInt();
		int a[]=new int[n];
		int na[]=new int[n];
		do {
			for(int i=0;i<n;i++) {
				a[i]=s.nextInt();
				max_a(a);
				
			}
			System.out.println(max_a(a));
				for(int i=0;i<n;i++) {
				na[i]=a[i]/max_a(a)*100;
				System.out.println(na[i]);
			}
			System.out.println(avg(na));
		}while(n<=1000);
	}
	static int max_a(int a[]) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<=a[i]) max=a[i];
		}
		return max;
	}
	static double avg(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		double avg=sum/a.length;
		return avg;
	}

}
