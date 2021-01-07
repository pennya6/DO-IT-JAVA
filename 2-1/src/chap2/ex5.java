package chap2;

import java.util.Scanner;

//배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드 rcopy
public class ex5 {

	public static void main(String[] args) {
		System.out.println("역순 복사\n a의 요소수:");
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int a[]=new int[n];
		
		
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		
		System.out.println("b의 요솟수:");
		int m=s.nextInt();
		int b[]=new int[m];
		for(int i=0;i<m;i++) {
			b[m]=s.nextInt();
		}
		//rcopy(a,b);
		System.out.println("역순복사");
		for(int i=0;i<n;i++)
			System.out.println(a[i]);

	}
	static void rcopy(int []a, int[]b) {
		int n=a.length<=b.length?a.length:b.length;
		for(int i=0;i<n;i++) {
			a[i]=b[b.length-i-1];
		}
	}
}
