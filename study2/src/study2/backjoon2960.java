package study2;

import java.util.ArrayList;
import java.util.Scanner;

//�����佺�׳׽��� ü
public class backjoon2960 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("N�� ����:");
		int n=s.nextInt();
		System.out.println("���° ������ ���ڸ� ����Ұ��ΰ�?:");
		int k=s.nextInt();
		int count=1;
		
		boolean isPrime[]=new boolean[n+1];
		//�ʱ�ȭ �κ�
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
