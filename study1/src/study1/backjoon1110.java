package study1;

import java.util.Scanner;

public class backjoon1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("값을 입력하시오:");
		int a=s.nextInt();
		int x=0;//first
		int y=0; //second
		int i=0;//number
		int z=0;//storage
		
		x=a/10; //2
		y=a%10; //6
		while(true) {
			i++; //1
			z=y; //z=6
			y=(x+y)%10; //8
			x=z;
			if(a==x*10+y) {
				break;
			}
		}
		System.out.println(i);
	}

}
