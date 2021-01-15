package study4;

import java.util.Scanner;
//binarysearch

public class backjoon_yeonjong {
	static int check(int []a,int []b) {
		int index[]=new int[b.length];
		for(int i=0;i<b.length;i++) {
			if(a[i]==b[i])
				index[i]=1;
			else index[i]= 0;
		}
		return index[];
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt(); //test size
		
		for(int i=0;i<t;i++) {
			
			int n=s.nextInt(); //Á¤¼ö¼ö
			int n1[]=new int[n];
			
			for(int j=0;j<n;j++) {
				n1[j]=s.nextInt();
			}
			
			int m=s.nextInt();
			int n2[]=new int[m];
			
			for(int g=0;g<n;g++) {
				n2[g]=s.nextInt();
			}
			
			System.out.println(check(n1,n2));	
		}
	}

}
