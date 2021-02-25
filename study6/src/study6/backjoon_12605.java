package study6;

import java.util.Scanner;

//단어 순서 뒤집기
//역순 문자 출력 -> 스택의 후입선출 특징 사용
public class backjoon_12605 {

	
	public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	IntStack stack=new IntStack();
	System.out.println("역순 할 단어의 개수를 입력하시오 : ");
	int r=s.nextInt(); //역순 단어 개수
	
		while(true) {
			try {
				//배열의 단위로 스택 입력받기
				for(int i=0;i<r;i++) {
					
					String x=s.next();
					//배열
					//스택의 성질 이용 
					//문자의 끝이 0일경우로 잘라서 스택에 push
					//이후에 pop 하면 반대로 출력
					
					//x의 문자열 빈칸을 기준으로 쪼개기
					String word[]=x.split("\\s");
					
					//word의 값을 차례대로 가져와서 wo에 넣어라
					String rword[]=new String[] {};
	
					for(int k=0;k<word.length-1;i++) {
						for(String wo:word) {
							//System.out.println(wo);
							//rword[1]=wo;
							//System.out.println(rword[k]);
							//stack.push(rword[k]);
							//stack.push(wo);
						}
					//stack.pop();
					}
					//for(int j=0;j<stack.size();j++) {
						//stack.pop();
					//}
					
				}	
			}catch(IntStack.OverflowIntStackX2Exception e) {
				System.out.println("스택이 가득 찼습니다.");
				break;
			}catch(IntStack.EmptyIntStackX2Exception e) {
				System.out.println("스택이 비어있습니다.");
				break;
			}
			
		}
	
	}
}

