package chap2;
//�޼��� dayofyear�� ���� i�� days���� �����϶� 
//while�� ���
public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // ���
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // ����
	};
	//������ 
	static int isLeap(int year) {
		return (year%4==0&&year%100!=0||year%400==0)?1:0;
	}
	static int dayofyear(int y,int m,int d) {
		while(--m!=0)
			d+=mdays[isLeap(y)][m-1];
		return d;
	}

}
