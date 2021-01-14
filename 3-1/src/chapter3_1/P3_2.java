package chapter3_1;

import java.util.Scanner;

//while문이 아니라 for문으로 구현
//배열 a의 앞쪽 n개의 요소에서 key와 같은 요소를 선형검색
public class P3_2 {
	static int seqSearch2(int[] a,int n,int key) {
		for(int i=0;i<n;i++) 
			if(a[i]==key)
				return i;
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("요소수:");
		int n=s.nextInt();
		int a[]=new int [n];
		int key;
		for(int i=0;i<n;i++) {
			System.out.print("x["+i+"]:");
			a[i]=s.nextInt();
		}
		System.out.print("검색할 값:");
		key=s.nextInt();
		int index=seqSearch2(a, n, key);
		if(index==-1)
			System.out.println("찾는 값이 없습니다.");
		else
			System.out.println(key+"는 x["+index+"]에 있습니다.");
	}

}

