package study2;
//backjoon9498
import java.util.Scanner;

public class backjoon9498 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("시험점수입력:");
		int n=s.nextInt();
		do {
			if(n>=90&&n<=100) System.out.println("A");
			else if(n>=80&&n<=89) System.out.println("B");
			else if(n>=70&&n<=79) System.out.println("C");
			else if(n>=60&&n<=69) System.out.println("D");
			else System.out.println("F");
		}while(n<0&&n>100);

	}
}
