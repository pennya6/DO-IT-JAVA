package chapter3_1;

import java.util.Scanner;


//요소수가 n인 배열 a에서 
//key와 일치하는 모든 요소의 인덱스를 
//배열 idx의 맨앞부터 순서대로 저장
//일치하는 요솟수 반환
public class ex3 {

	static int searchIdx(int [] a,int n,int key,int[] idx) {
		int count=0;
		for(int i=0;i<n;i++) {
			if(a[i]==key) { 
				idx[count++]=i;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("요소수:");
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.print("찾는값:");
		int key=s.nextInt();
		
		int[] idx=new int[n];
		int d=searchIdx(a, n, key, idx);

		System.out.print(d);
		if(d==-1)
			System.out.print("찾는 값이 없습니다.");
	}

}
