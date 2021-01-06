package chap2;

import java.util.Random;
import java.util.Scanner;

//난수 사용해 배열의 요소값 설정
public class P2_5 {

	public static void main(String[] args) {
		System.out.println("키의 최댓갓을 구합니다.");
		Scanner s=new Scanner(System.in);
		System.out.println("사람수:");
		int n=s.nextInt();
		Random rand=new Random(); //random클래스형의 변수를 만들기 위한 선언
		int h[]=new int[n];
		for(int i=0;i<h.length;i++) {
			//요소의 값을 난수로 결정
			//90 : 0~89
			//100+89 : 100~189
			h[i]=100+rand.nextInt(90);
			System.out.println("h["+i+"] : "+h[i]);
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
