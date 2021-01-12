package study2;
//9020
//골드바흐의 추측
//1.소수 분별
//2.소수가 아닌값만 모으기
//3.더하는 값은 오직 소수
import java.util.Scanner;

public class badkjoon6588 {

	public static final int max=1000000;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("테스트 케이스 개수를 입력하라");
		int num=s.nextInt(); //출력 골드 파티션 수
		
		boolean isnotPrime[]=new boolean[max+1];
		for(int i=2;i<=max;i++) {
			isnotPrime[i]=true;
		}
		for(int i=2;i<=max;i++) {
			for(int j=i*2;j<=max;j+=i) {
				if(!isnotPrime[j]) continue;
				isnotPrime[j]=false;				
			}
		}
		while(true) {
			int n = s.nextInt();
            boolean check = false;
            if(n == 0)
                break;
            for(int i = 2; i <= num; i++) {
                if(isnotPrime[i] && isnotPrime[n-i]) {
                    System.out.println(n + " = " + i + " + " + (n-i));
                    check = true;
                    break;
                }
            }
		}
	}

}
