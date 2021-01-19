package study5;

import java.util.Scanner;

//랜선자르기
public class backjoonsun {
	public static boolean check(int[] a, int n, long x) {
        int cnt = 0;
        for (int i=0; i<a.length; i++) {
            cnt += a[i]/x;
        }
        return cnt >= n; //x로 잘랐을 때  n개 이상인지 리턴
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int k=s.nextInt();
	int n=s.nextInt();
	int max=0;

		int a[]=new int[k];
		for(int i=0;i<k;i++) {
			a[i]=s.nextInt();
			//랜선중 최대구하기
			max=Math.max(max, a[i]);
		}
		
		long answer=0;
		long start=1;
		long end=max; //랜선최대길이
		
		while(start<=end) {
			
			//자를 랜선길이 값 구하기 이진 탐색 사용
			long mid=(start+end)/2; //랜선길이 자르는거
			
			if(check(a, n, mid)) {
                answer = Math.max(answer,mid);
                start = mid+1;
            } else {
            	//랜선최대길이에서 -1
                end = mid-1;
            }
        }
        System.out.println(answer);
    }
}
	