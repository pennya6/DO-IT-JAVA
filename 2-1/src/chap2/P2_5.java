package chap2;

import java.util.Random;
import java.util.Scanner;

//���� ����� �迭�� ��Ұ� ����
public class P2_5 {

	public static void main(String[] args) {
		System.out.println("Ű�� �ִ��� ���մϴ�.");
		Scanner s=new Scanner(System.in);
		System.out.println("�����:");
		int n=s.nextInt();
		Random rand=new Random(); //randomŬ�������� ������ ����� ���� ����
		int h[]=new int[n];
		for(int i=0;i<h.length;i++) {
			//����� ���� ������ ����
			//90 : 0~89
			//100+89 : 100~189
			h[i]=100+rand.nextInt(90);
			System.out.println("h["+i+"] : "+h[i]);
		}
		System.out.println(maxof(h));

	}
	static int maxof(int [] a) {
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(max<a[i]) max=a[i];
		}
		return max;
	}
}
