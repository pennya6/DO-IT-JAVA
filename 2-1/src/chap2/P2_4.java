package chap2;

import java.util.Scanner;

//배열 요소의 최대값 구하기
//메서드 활용
public class P2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("키의 최댓갓을 구합니다.");
		Scanner s=new Scanner(System.in);
		System.out.println("사람수:");
		int n=s.nextInt();
		int h[]=new int[n];
		for(int i=0;i<h.length;i++) {
			System.out.print("h["+i+"] : ");
			h[i]=s.nextInt();
		}
		System.out.println(maxof(h));
	}
	static int maxof(int [] a) {
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(max<a[i]) max=a[i];
		}
		return max;
	}

}
