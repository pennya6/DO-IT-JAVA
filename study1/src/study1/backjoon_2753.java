package study1;

import java.util.Scanner;

//����� 1��� �ƴҽ� 0���
//������ 4�� ��� �̸鼭 100�� ����� �ƴҶ� �Ǵ� 400�� ��� �϶�
public class backjoon_2753 {

	public static void main(String[] args) {
		System.out.println("������ �Է��Ͻÿ�:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
			if(n%4==0) {
				if(n%400==0) System.out.println(1);
				else if(n%100==0) System.out.println(0);
				else System.out.println(1);
			}
			else System.out.println(0);
	}

}
