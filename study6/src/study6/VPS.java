package study6;

import java.util.Scanner;

public class VPS {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      
	      int T = sc.nextInt();//반복횟수
	      
	      for(int i=0; i<T; i++) {
	         StringStack stack = new StringStack(50);//스택
	         int type = 1; //type 0은 출력이 끝남, type 1은 출력 전
	         
	         //입력
	         String s = sc.next();
	         String[] S = s.split("");
	         
	         for(int j=0; j<S.length; j++) {
	            if(S[j].equals("(")) {
	               stack.push(S[j]);//스택에 넣어줌
	            }
	            else {
	               try{
	                  stack.pop();//스택에서 빼줌
	                  }catch(StringStack.EmptyStringStackException e){//만약 스택에서 뺄 것이 없다면
	                     System.out.println("NO"); type = 0; break;} //no를 출력하고 type은 0으로 변환
	            }
	         }
	         
	         //출력
	         if(type == 1) { //type이 1일때 즉, 아직 출력이 되지 않았을 때
	         if(stack.size()==0) System.out.println("YES"); //스택에 아무것도 없으면 yes
	         else System.out.println("NO");
	         }
	      }   
	   }
	      
	}

