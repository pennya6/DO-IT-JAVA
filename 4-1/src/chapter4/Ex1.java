package chapter4;

import java.util.Scanner;

import chapter4.IntStack.OverflowIntStackException;

public class Ex1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		IntStack stack=new IntStack(64);
		
		while(true) {
			System.out.println("현재 데이터수 :"+stack.size()+"/"+stack.capacity());
			System.out.print("1)push 2)pop 3)peek 4)dump 5)indexof 6)clear 7)isEmpty 8)isFull 0)exit : " );
			
			int menu=s.nextInt();
			if(menu==0)
				break;
			int x;
			switch(menu) {
			case 1:
				System.out.print("데이터:");
				x=s.nextInt();
				try {
					stack.push(x);
				}
				catch(IntStack.OverflowIntStackException e) {
					System.out.println("스택이 full");
				}
				break;
				
			case 2:
				try {
					x=stack.pop();
					System.out.println("pop data:"+x);
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 empty");
				}
				break;
			case 3:
				try {
					x=stack.peek();
					System.out.println("peek data :"+x);
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("stack empty");
				}
				break;
			case 4:
				stack.dump();
				break;
			case 5:
				try {
					System.out.print("find data:");
					int f=s.nextInt();
					x=stack.indexOf(f);
					if(x==-1)
						System.out.println("No here");
					else
						System.out.println("find it : "+x +"위치");
					
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("stack empty");
				}
				break;
				
			case 6:
				stack.clear();
				break;
			case 7:
				if(stack.isEmpty()==true) {
					System.out.println("empty");
				}
				else 
					System.out.println("no empty");
				break;
			case 8:
				if(stack.isFull()==true) {
					System.out.println("Full");
				}
				else 
					System.out.println("no Full");
				break;
				
				
			}
		}

	}
}