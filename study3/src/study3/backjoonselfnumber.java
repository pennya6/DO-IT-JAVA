package study3;

import java.util.Scanner;

public class backjoonselfnumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean[] check=new boolean[10001];
		for(int i=1;i<10001;i++) {
			int n=d(i);
			if(n<10001) check[n]=true;
		}
		for(int i=1;i<10001;i++) {
			if(!check[i]) {
				System.out.println(i);
			}
		}

	}
	public static int d(int n) {
		int sum=n;
		while(n!=0) {
			sum+=(n%10);
			n/=10;
		}
		return sum;
	}

}
