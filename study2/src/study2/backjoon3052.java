package study2;

import java.util.Scanner;

//나머지 문제
public class backjoon3052 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		  int[] n = new int[10];
		   int count = 0;
		  
		   for(int i=0;i<10;i++) {   //10개수를 입력받고 42로 나눈다.
		          n[i] = sc.nextInt()%42; 		         
		   }
		 
		   for(int i=0;i<10;i++) {      //10개중 중복값이 있는지 검증하는 부분
		   int cnt = 0;
		   for(int j=i+1 ;j<10 ;j++) {   
		   if(n[i]==n[j]) {     //순차로 진행된 j 부터 같은값을 찾는다.
		   cnt++;
		   }
		   }
		   if(cnt==0) {   //같은값이 없을때만 숫자를 더해준다.
		   count++;
		   }
		   }
		   System.out.println(count);
		   }
	}