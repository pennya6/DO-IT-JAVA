package study1;

import java.util.Scanner;

//���� ������ �ð����� 45�� ���� �︮�� ����
public class backjoon2884 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner (System.in);
		System.out.println("��� ������� �Է��϶�");
		int h=s.nextInt();
		int m=s.nextInt();
		int nm=0;
		if(m<45) {//���� 45�� �����ΰ��
			nm=60-(45-m);
			h--;
			if(h<0) {
				h=23;
			}
		}
		else nm=m-45;
		System.out.println(h+":"+nm);
	}
}
