package chap1_2;
//곱셈표를 출력하라
public class ex12 {
	public static void main(String[] args) {
		System.out.print("  |");
		for(int a=1;a<=9;a++) {
			System.out.printf("%4d",a);
		}
		System.out.println();
		
		System.out.println("---------------------------------------");
		for(int i=1;i<=9;i++) {
			System.out.print(i+" |");
			for(int j=1;j<=9;j++) {
				System.out.printf("%4d",i*j);//printf는 형식에서 사용
			}
			System.out.println();
		}
	}

}
