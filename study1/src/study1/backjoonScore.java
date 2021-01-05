package study1;

import java.util.Scanner;

//시험성적 
public class backjoonScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("시험성적을 입력하시오:");
		int a=s.nextInt();
		int r=a/10;
		switch(r) {
		case 10:
			System.out.println("A");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
			break;
		}
		
	}

}
