package chapter3_1;

import java.util.Scanner;
public class ex1 {
//이진검색
static int binSearch(int []a,int n,int key) {
	int i;

	a[n] = key; // 보초를 추가

	for (i = 0; a[i] != key; i++);
	//i==n이면 보초이므로 찾고자 하는 값이 없음 즉 -1 출력
	//아니면 i출력
	return i == n ? -1 : i;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.print("요소수:");
		int n=s.nextInt();
		int x[]=new int[n+1];
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


