package study2;
//4344
import java.util.Scanner;

public class backjoon4344 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("테스트 수");
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			int num=s.nextInt();
			int a[]=new int[num];
			double sum=0;
			double avg=0;
				for(int j=0;j<num;j++) {
					a[j]=s.nextInt();
					sum+=a[j];
				}		
			//평균
			avg=sum/num;
			//평균 넘는 학생수
			double count=0;
			System.out.println(avg);
			for(int j=0;j<num;j++) {
				if(a[j]>avg)
					count++;
			}
			System.out.printf("%.3f%\n",(count/num)*100);
					
			}
		}

}
