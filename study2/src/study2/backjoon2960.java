package study2;

import java.util.ArrayList;
import java.util.Scanner;

//에라토스테네스의 체
public class backjoon2960 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("N의 범위:");
		int n=s.nextInt();
		System.out.println("몇번째 지워진 숫자를 출력할것인가?:");
		int k=s.nextInt();
		int count=1;
		
		boolean isPrime[]=new boolean[n+1];
		//초기화 부분
		for(int i=2;i<=n;i++) {
			isPrime[i]=true;
		}
		
		for(int i=2;i<=n;i++) {
			if(!isPrime[i]) {
				continue;
			}
			for(int j=i*2;j<=n;j+=i) {
				count++;
				if(count==k)
					System.out.println(j);
			}
		}
		
		

		
	}
}
