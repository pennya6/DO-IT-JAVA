package study6;

import java.util.Scanner;

public class VPS {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      
	      int T = sc.nextInt();//�ݺ�Ƚ��
	      
	      for(int i=0; i<T; i++) {
	         StringStack stack = new StringStack(50);//����
	         int type = 1; //type 0�� ����� ����, type 1�� ��� ��
	         
	         //�Է�
	         String s = sc.next();
	         String[] S = s.split("");
	         
	         for(int j=0; j<S.length; j++) {
	            if(S[j].equals("(")) {
	               stack.push(S[j]);//���ÿ� �־���
	            }
	            else {
	               try{
	                  stack.pop();//���ÿ��� ����
	                  }catch(StringStack.EmptyStringStackException e){//���� ���ÿ��� �� ���� ���ٸ�
	                     System.out.println("NO"); type = 0; break;} //no�� ����ϰ� type�� 0���� ��ȯ
	            }
	         }
	         
	         //���
	         if(type == 1) { //type�� 1�϶� ��, ���� ����� ���� �ʾ��� ��
	         if(stack.size()==0) System.out.println("YES"); //���ÿ� �ƹ��͵� ������ yes
	         else System.out.println("NO");
	         }
	      }   
	   }
	      
	}

