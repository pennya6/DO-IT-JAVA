package chap2;
//3이 소수인지 판단하는 과정
public class P2_10 {

	public static void main(String[] args) {
	
		//나눗셈 횟수
		int counter=0;
		//소수개수
		int ptr=0;
		//소수저장배열
		int []prime=new int[500];
	
		//prime[0]=2
		//2는 소수
		prime[ptr++]=2;
		
		//홀수만 계산
		for(int n=3;n<=1000;n+=2) {
			int i;
			//찾은 소수로 나눠주기
			for(i=1;i<ptr;i++) {
				counter++; //소수가 아니더라도 일단 계산을 했으니 카운터 더하기
				if(n%prime[i]==0) {
					break; //찾은 소수로 나눠진다면 소수가 아니다
				}
			}
			//마지막까지 안나누어진다면
			if(ptr==i) {
				prime[ptr++]=n;//소수
			}
		}
		for(int i=0;i<ptr;i++) {
			System.out.println(prime[i]);
		}
		System.out.println(counter);
	}
}
