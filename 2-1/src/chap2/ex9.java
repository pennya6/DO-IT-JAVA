package chap2;

import java.util.Scanner;

//y년 m월 d일의 그해 남은 일수를 구하는 아래 메서드를 작성하세요
public class ex9 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry; // 한 번 더？

		System.out.println("연내의 남은 일 수를 구합니다.");

		do {
			System.out.print("년：");
			int year = stdIn.nextInt(); // 년
			System.out.print("월：");
			int month = stdIn.nextInt(); // 월
			System.out.print("일：");
			int day = stdIn.nextInt(); // 일

			System.out.printf("연내의 남은 일 수는 %d일입니다.\n", leftdayofyear(year, month, day));

			System.out.print("한번 더 할까요? (1.예/0.아니오)：");
			retry = stdIn.nextInt();
		} while (retry == 1);

	}
	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 윤년
	};
	//윤년계산 
	static int isLeap(int year) {
		return (year%4==0&&year%100!=0||year%400==0)?1:0;
	}
	
	//남은일계산
	static int leftdayofyear(int y, int m, int d) {
		int days=d;
		for (int i = 1; i < m; i++) // 1월~(m-1)월의 일 수를 더함
			days += mdays[isLeap(y)][i - 1];
		return 365 + isLeap(y) - days;
	}

}
