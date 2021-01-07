package chap2;
//메서드 dayofyear를 변수 i와 days없이 구현하라 
//while문 사용
public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 윤년
	};
	//윤년계산 
	static int isLeap(int year) {
		return (year%4==0&&year%100!=0||year%400==0)?1:0;
	}
	static int dayofyear(int y,int m,int d) {
		while(--m!=0)
			d+=mdays[isLeap(y)][m-1];
		return d;
	}

}
