package chap2;

import java.util.Arrays;

//배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy작성
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
