package chap2;

import java.util.Scanner;

//배열의 특성확인
public class P2_1 {

	public static void main(String[] args) {
		int []a=new int[5];
		a[1]=37;
		a[0]=0;
		a[2]=51;
		a[3]=0;
		a[4]=74;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
	}

}
