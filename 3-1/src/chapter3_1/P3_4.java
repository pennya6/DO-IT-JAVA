package chapter3_1;

import java.util.Scanner;

//이진검색
public class P3_4 {

	static int binSearch(int []a,int n,int key) {
		//검색범위의 첫 인덱스
		int pl=0;
		//검색범위의 끝 인덱스
		int pr=n-1;
		
		do {
			int pc=(pl+pr)/2;//중앙 요소의 인덱스
			if(a[pc]==key)
				return pc;
			else if(a[pc]<key)
				pl=pc+1; //검색범위를 뒤쪽 절반으로 줄임
			else
				pr=pc-1;//검색범위를 앞쪽 절반으로 줄임
		}while(pl<=pr);
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.print("요소수:");
		int n=s.nextInt();
		int x[]=new int[n];
		System.out.println("오름차순으로 입력하세요");
		
		System.out.print("x[0]:");
		x[0]=s.nextInt();
		
		for(int i=1;i<n;i++) {
			do {
				System.out.print("x["+i+"]:");
				x[i]=s.nextInt();
			}while(x[i]<x[i-1]); //정렬이 되어있다는 조건
		}
		
		System.out.print("검색할값:");
		int key=s.nextInt();
		int index=binSearch(x, n, key);
		if(index==-1)
			System.out.println("그값의 요소가 없습니다.");
		else
			System.out.println(key+"는 x["+index+"]에 있습니다.");
		}
	}


