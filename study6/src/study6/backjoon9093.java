package study6;

//단어 뒤집기
import java.util.Scanner;

public class backjoon9093 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int test=Integer.parseInt(s.nextLine());
		
		StringStack stack=new StringStack(test);
		
		for(int i=0;i<test;i++) {
			String sentence=s.nextLine();
			String p[]=sentence.split(" ");
			
			//p의 값을 차례대로 가져와서 string값에 넣어라
			for(String string :p) {
				for(int j=0;j<=string.length()-1;j++) {
					System.out.print(string.charAt(j));		
				}
				System.out.print(" ");
			}
			System.out.print(" ");
		}		

	}

}
