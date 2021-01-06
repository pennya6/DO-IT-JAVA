package chap2;
//배열초기자에 의한 생성
public class P2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,3,4,5}; //배열초기자 -> 배열본체의 생성과 동시에 각 요소의 초기화 가능
		int b[]=new int[] {1,2,3,4,5}; //배열초기자 new연산자를 이용하여 명확하게 선언
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
