package study1;

import java.util.Scanner;

//한수는 지금 (x,y)
//직사각형의 왼쪽 아래 꼭짓점은(0,0)
//오른쪽 위꼭짓점은(w,h)
//직사각형의 경계선까지 거리의 최솟값
public class backjoon_1085 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("x,y,w,h의 값을 입력하시오");
		int x=s.nextInt();
		int y=s.nextInt();
		int w=s.nextInt();
		int h=s.nextInt();
		
		//java.lang.Math클래스
		//수학과 관련된 일련의 작업들을 처리할 수 있는 클래스
		//x축최소
		int xmin=Math.min(x, w-x); 
		//y축최소
		int ymin=Math.min(y, h-y);
		
		System.out.println("최소값:"+Math.min(xmin, ymin));
	}
}
