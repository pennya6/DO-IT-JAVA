package study6;

import java.util.Scanner;
import java.util.Stack;

import study6.IntStack.EmptyIntStackException;
import study6.IntStack.OverflowIntStackException;

//����
public class backjoon10773 {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		
		System.out.println("��� �ݺ�? : ");
		int k=s.nextInt();
		
		//�ڹ��� ���� Ŭ����
		Stack<Integer> stack = new Stack<Integer>();
		
		int n;
		int sum=0;
		for(int i=0;i<k;i++) {
			n=s.nextInt();
			//0�� ��ġ�� pop -> ����
			if(n==0) {
				stack.pop();
					}
			//�ƴ� ��쿡�� �°� �θ�
			else {
				stack.push(n);
					}
		}
		//pop�� ���̵��� ������ ��� ������ ��
		for(int o:stack) {
			sum+=o;
			}
		System.out.println(sum);
		}
}

