package chap2;
//배열의 모든 요소의 합을 구하여 출력함(확장 for문)
public class P2C_1 {

	public static void main(String[] args) {
		double a[]= {1.0,2.0,3.0,4.0,5.0};
		
		for(int i=0;i<a.length;i++)
			System.out.println("a["+i+"]="+a[i]);
		double sum=0;
		
		//확장 for문
		//:의 의미는 ~안에 있는
		for(double i:a)
			sum+=i;
		
		System.out.println("모든 요소의 합은"+sum+"입니다.");
	}

}
