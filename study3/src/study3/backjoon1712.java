package study3;

import java.util.Scanner;
//손익분기점
public class backjoon1712 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long a=s.nextLong();
		long b=s.nextLong();
		long c=s.nextLong();
		
	
			if(c-b<=0) 
				System.out.println("-1");
						
			else
				System.out.println(a/(c-b)+1);
		}
		
	}

