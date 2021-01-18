package study4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
//10814
public class backjoon_online {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		
		int n= s.nextInt();
		
		String arr[][]=new String[n][2]; // 나이, 이름
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<2;j++) {
				
				arr[i][j] = s.next();			
			}
		}
		
		Arrays.sort(arr,new Comparator<String[]>() { // 0:나이 , 1:이름
			public int compare(String[] n1,String[] n2) {
												
					return Integer.compare(Integer.parseInt(n1[0]), Integer.parseInt(n2[0]));
				
			}		
		});
		
		for(int i=0;i<arr.length;i++) {
	
				System.out.println(arr[i][0]+" "+arr[i][1]);
		
		}
		
	}
	
}