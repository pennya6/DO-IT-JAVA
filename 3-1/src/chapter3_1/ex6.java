package chapter3_1;

import java.util.Arrays;
import java.util.Scanner;

//기본 자료형 배열에서 binarySearch메서드 사용
public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("요소수:");
		int n=s.nextInt();
		int[]a=new int[n];
		System.out.println("오름차순으로 입력하세요");
		System.out.print("x[0]:");
		a[0]=s.nextInt();
		
		for(int i=1;i<n;i++) {
			do {
				System.out.print("x["+i+"]:");
				a[i]=s.nextInt();
			}while(a[i]<a[i-1]); //바로 앞의 값보다 작을시 다시 입력 즉 오름차순 정렬이 안됨
		}
		System.out.print("검색할값:");
		int key=s.nextInt();
		int index=Arrays.binarySearch(a, key);
		if(index<0) {
		int point=-index-1;
		System.out.println("그 값의 요소가 없습니다.");
		System.out.printf("삽입 포인트는 %d입니다.\n", point);
		System.out.printf("x[%d]의 바로 앞에 %d를 삽입하면 배열의 정렬 상태가 유지됩니다.", point, key);
		}
		else
			System.out.println(key+"은 x["+index+"]에 있습니다.");
	}

}
