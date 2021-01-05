package study1;

import java.util.Scanner;

//내가 설정한 시간보다 45분 빨리 울리게 설정
public class backjoon2884 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner (System.in);
		System.out.println("몇시 몇분인지 입력하라");
		int h=s.nextInt();
		int m=s.nextInt();
		int nm=0;
		if(m<45) {//분이 45분 이하인경우
			nm=60-(45-m);
			h--;
			if(h<0) {
				h=23;
			}
		}
		else nm=m-45;
		System.out.println(h+":"+nm);
	}
}
