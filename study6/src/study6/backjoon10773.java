package study6;

import java.util.Scanner;
import java.util.Stack;

import study6.IntStack.EmptyIntStackException;
import study6.IntStack.OverflowIntStackException;

//제로
public class backjoon10773 {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		
		System.out.println("몇번 반복? : ");
		int k=s.nextInt();
		
		//자바의 스택 클래스
		Stack<Integer> stack = new Stack<Integer>();
		
		int n;
		int sum=0;
		for(int i=0;i<k;i++) {
			n=s.nextInt();
			//0을 외치면 pop -> 삭제
			if(n==0) {
				stack.pop();
					}
			//아닌 경우에는 맞게 부름
			else {
				stack.push(n);
					}
		}
		//pop된 아이들을 제외한 모든 스택의 합
		for(int o:stack) {
			sum+=o;
			}
		System.out.println(sum);
		}
}


