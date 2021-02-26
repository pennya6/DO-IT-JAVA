package study6;

import java.util.Scanner;
import java.util.Stack;

//스택사용
public class parenthesis {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		
		StringStack stack=new StringStack(t); 
		
		String str=s.nextLine();
		//a에 괄호의 값들을 넣어서 비교
		
		//아무것도 없는 경우 try catch로 잡기
		String a[]=new String[str.length()];
		for(int i=0;i<t;i++) {
			a[i]=str.substring(i, i+1);
			if(a[i]==")") {
				stack.push(a[i]);
			}
			else {
				stack.pop();
			}
		}
		if(stack.pop().length()>0) {
			System.out.println("NO");
		}
		else
			System.out.println("YES");
	}

}
