package chap1_2;

import java.util.Scanner;

//���� a,b�� �����Ͽ� �׻����� ��� ������ ���� ���϶�
public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("a���� b������ ���� ���Ұ��̴�. a,b�ǰ��� �Է��϶�");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("sum�ǰ���:"+sumof(a,b));
	}
	static int sumof(int a, int b) {
		int sum=0;
		for(int i=a;i<=b;i++) {
			sum+=i;
		}
		return sum;
	}

}