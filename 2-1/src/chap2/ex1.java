package chap2;

import java.util.Random;

//Ű�Ӹ� �ƴ϶� ������� ������ �����Ͽ� �ִ� Ű ���ϱ�
public class ex1 {

	public static void main(String[] args) {
		System.out.print("�����:");
		Random rand=new Random();
		int n=rand.nextInt(51);//0~50
		System.out.println(n);
		int h[]=new int[n];
		for(int i=0;i<h.length;i++) {
			h[i]=rand.nextInt(90)+100; //100~189
		}
		System.out.println(maxof(h));
		
	}
	static int maxof(int a[]) {
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(max<a[i]) max=a[i];
		}
		
		return max;
	}

}
