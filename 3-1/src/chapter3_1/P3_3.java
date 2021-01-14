package chapter3_1;

import java.util.Scanner;

//보초법
public class P3_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("요소수:");
		int n=s.nextInt();
		int a[]=new int [n+1];
		int key;
		for(int i=0;i<n;i++) {
			System.out.print("x["+i+"]:");
			a[i]=s.nextInt();
		}
		System.out.print("검색할 값:");
		key=s.nextInt();
		int index=seqSearch(a, n, key);
		if(index==-1)
			System.out.println("찾는 값이 없습니다.");
		else
			System.out.println(key+"는 x["+index+"]에 있습니다.");
	

	}
	static int seqSearch(int a[], int n,int key) {
		int i=0;
		//보초 추가
		a[n]=key;
		while(true) {
			//리스트에 key값이 있는 경우
			if(a[i]==key)
				break;
			i++;
		}
		//key값이 없는 경우 
		return i==n?-1:i;
	}

}
