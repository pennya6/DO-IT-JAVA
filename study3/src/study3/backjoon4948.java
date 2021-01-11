package study3;

import java.util.Scanner;

//베르트랑 공준
public class backjoon4948 {
	
	public static void main(String[] args) {
		System.out.println("n의 범위를 입력하시오");
		Scanner s=new Scanner(System.in);
		while(true) {
			int n=s.nextInt();
			int count=0;
			int m=2*n;
						
			boolean isPrime[]=new boolean[m+1];
			
			for(int i=2;i<=m;i++) {
				isPrime[i]=true;
			}
			
			for(int i=2;i<=m;i++) {
				//false
				if(!isPrime[i]) continue;
				//false인 경우
				for(int j=i*2;j<=m;j+=i) {
					isPrime[j]=false;
				}
			}						
	
			if(n==0) break;
			
			for(int i=n;i<=m;i++) {
				if(isPrime[i]) count++;
			}
			System.out.println(count);						
		}
		
	}
}
