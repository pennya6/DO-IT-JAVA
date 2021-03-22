package study9;

import java.util.Scanner;

//퀵소트정렬 사용
//나이 퀵소트 정렬
//배열 두개 사용 하나는 나이, 다른거는 이름
//if 나이가 같으면 첫번째 온 숫자 


//2차원 배열의 퀵소트 정렬?
//1차원 배열 두개로 각각 스캔 값 입력받아 비교? -> 문제점 : 나이 배열 퀵소트 완료후 이름 배열에 해당 인덱스값을 모른다.
//2차원 배열로 비교? -> 2차원 배열은 퀵정렬이 불필요? array.sort(안정적정렬)

//안정적 정렬?
//들어온 순서를 그대로 유지하는 정렬

public class baekjoon10814 {
	static void swap(int []a,int idx1,int idx2) {
		int t=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
	}
	static void quickSort(int a[],int left, int right) {
		int pl=left;
		int pr=right;
		int x=a[(pl+pr)/2];
		do {
			while(a[pl]<x)pl++;
			while(a[pr]>x)pr--;
			if(pl<=pr)
				swap(a, pl++, pr--);
		}while(pl<=pr);
		if(left<pr)quickSort(a, left, pr);
		if(pl<right)quickSort(a, pl, right);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int nx=s.nextInt();
		//2차원 배열 
		//나이, 이름
		//String a[][]=new String[nx][2];
		//for(int i=0;i<nx;i++) {
			//a[i][0]=s.next();
			//a[i][1]=s.next();
		//}
		
		//1차원 배열 두개로 
		//int a[]=new int[nx];
		//String b[]=new String[nx];
		//for(int i=0;i<nx;i++) {
			//a[i]=s.nextInt();
			//b[i]=s.next();
		//}
		//quickSort(a, 0, nx-1);
		//for(int i=0;i<nx;i++) {
			//System.out.print(a[i]+" ");
			//if(a[i]==a[i+1]) {
				//System.out.println(b[i]);
			//}
		//}
		
		
	}

}
