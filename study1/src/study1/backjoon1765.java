package study1;

import java.util.Scanner;

//ÇÇÀÚ±Á±â
public class backjoon1765 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int tar=s.nextInt();
		int m=s.nextInt();//¿Àºì±íÀÌ¼ö
		int w=s.nextInt();//¹İÁ×°³¼ö¼ö
		int []a=new int[m];
		int []b=new int[w];
		//¿Àºì±íÀÌÀÔ·Â¹Ş±â
		for(int i=0;i<m;i++) {
			a[i]=s.nextInt();
		}
		//¹İÁ×°³¼öÀÔ·Â¹Ş±â
		for(int i=0;i<w;i++) {
			b[i]=s.nextInt();
		}
	}
	
}
