package chap2;
//배열 a의 모든 요소의 합계를 구하여 반환하는 메서드를 작성하세요.
public class ex3 {

	public static void main(String[] args) {
		int h[]=new int[] {5,10,73,2,-5,42};
		int sum=0;
		for(int i=0;i<h.length;i++) {
			sum+=h[i];
		}
		System.out.println(sum);

	}

}
