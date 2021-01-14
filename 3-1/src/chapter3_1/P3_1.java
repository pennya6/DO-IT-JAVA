package chapter3_1;

import java.util.Scanner;

//선형검색
public class P3_1 {

	public static void main(String[] args) {
		//요솟수가 n인 배열 a에서 key와 같은 요소를 선형검색합니다.
		Scanner s=new Scanner(System.in);
		System.out.print("요소수:");
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("x["+i+"]:");
			a[i]=s.nextInt();
		}
		System.out.println("검색할값:");
		int key=s.nextInt();
		int index=seqSearch(a, n, key);
		if(index==-1)
			System.out.println("값이 없습니다.");
		else
			System.out.println(key+"는 x["+index+"]에 있습니다.");
	}
	static int seqSearch(int [] a, int n,int key){
		int i=0;
		while(true) {
			if(i==n)
				//검색실패 -1반환
				return -1;
			if(a[i]==key)
				//검색성공 인덱스 반환
				return i;
			i++;
		}
	}

}
