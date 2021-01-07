package chap2;

import java.util.Scanner;

//그해 경과 일수 구하는 프로그램
public class P2_13 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int retry;
		
		System.out.println("그해 경과 일수를 구합니다.");
		
		do {
			System.out.print("년:");
			int year=s.nextInt();
			System.out.print("월:");
			int month=s.nextInt();
			System.out.print("일:");
			int day=s.nextInt();
			System.out.println(dayofyear(year, month, day)+"입니다.");
			System.out.println("retry?(1:yes/0:no)");
			retry=s.nextInt();
		}while(retry ==1);

	}
	//매개변수(year)로 전달받은 연도가 윤년이면 1반환 평년이면 0반환
	static int isLeap(int year) {
		return(year%4==0&&year%100!=0||year%400==0)?1:0;
	}
	//각달의 일수
	static int [][]mdays= {
			{31,28,31,30,31,30,31,31,30,31,30,31},//평년
			{31,29,31,20,31,30,31,31,30,31,30,31} //윤년
	};
	//서기 y년 m월 d일의 그해의 경과 일수를 구함
	static int dayofyear(int y,int m,int d) {
		int days=d; //일수
		for(int i=1;i<m;i++)
			days+=mdays[isLeap(y)][i-1];
		return days;
	}

}
