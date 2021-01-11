package study3;

import java.util.Scanner;

//����Ʈ�� ����
public class backjoon4948 {
	
	public static void main(String[] args) {
		System.out.println("n�� ������ �Է��Ͻÿ�");
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
				//false�� ���
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
