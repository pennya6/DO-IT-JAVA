package chapter3_1;

import java.util.Scanner;

public class ex5 {

	static int binSearchX(int []a,int n,int key) {
		int pl=0; //�Ǿ��ε���
		int pr=n-1;//�˻������ǵ��� index
		int count;
		do {
			int pc=(pl+pr)/2; //�߾� �ε���
			if(a[pc]==key)
			{
				//�ʱⰪpc=0
				for (pl=0; pc > pl; pc--) // key�� ���� �� ���� ��Ҹ� ã���ϴ�
					if (a[pc - 1] < key)
						break;
				return pc; // �˻�����
			}
			else if(a[pc]<key)
				pl=pc+1;
			else
				pr=pc-1;
		}while(pl<=pr);
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		System.out.print("��ڼ���");
		int num = s.nextInt();
		int[] x = new int[num]; // ��ڼ� num�� �迭

		System.out.println("������������ �Է��ϼ���.");

		System.out.print("x[0]��"); // �� �� ��Ҹ� �о� ����
		x[0] = s.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]��");
				x[i] = s.nextInt();
			} while (x[i] < x[i - 1]); // �ϳ� ���� ��Һ��� ������ �ٽ� �Է�
		}

		System.out.print("ã�� ����"); // Ű ���� �Է� ����
		int key = s.nextInt();

		int idx = binSearchX(x, num, key); // �迭 x���� ���� ky�� ��Ҹ� �˻�

		if (idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(key + "�� x[" + idx + "]�� �ֽ��ϴ�.");
	
	}

}
