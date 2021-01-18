package study4;

import java.util.Scanner;
//1072
public class backjoon_hyontaek {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		double z;
		z=y*100/x;
		if(z>=99)
			 System.out.println(-1);
		else {
			long low=0;
			long mid=0;
			long high=1000000000;
			//ÀÌºÐÅ½»ö
			while(low<=high) {
				
				mid=(low+high)/2;
				
				if(z<100*(y+mid)/(x+mid)){
					high=mid-1;
				}else {
					low=mid+1;
				}
			}
			System.out.println(low);
		}
	}

}