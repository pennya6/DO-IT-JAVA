package chap2;

import java.util.Arrays;

//�迭 b�� ��� ��Ҹ� �迭 a�� �����ϴ� �޼��� copy�ۼ�
public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {1,2,3,4,5};
		int b[]=a;
		System.out.println(Arrays.toString(a));
		//copy(a,b);
		System.out.println(Arrays.toString(b));
	}
	//static void copy(int []a,int []b) {
		//b=a.clone();
	//}

}
