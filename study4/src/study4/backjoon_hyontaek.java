package study4;

import java.util.Scanner;

public class backjoon_hyontaek {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		double z;
		z=y*100/x;
		if(z>=99)
			 System.out.println(-1);
		else
			binarySearch(1,x);
		System.out.println(z);
	}
	private static void binarySearch(long s, long e) {
		long mid=0,ration=0;
		while(s<=e) {
		
		}
	}

}
