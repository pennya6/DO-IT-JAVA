package chap2;
//counter에 곱셈과 나눗셈 횟수를 함계 저장
//1000이하의 소수열거
public class P2_11 {

	public static void main(String[] args) {
		//곱셈과 나눗셈 횟수
		int counter=0;
		//찾은 소수개수
		int ptr=0;
		//찾은 소수 저장하는 배열
		int prime[]=new int[500];

		prime[ptr++]=2;
		prime[ptr++]=3;
		
		//홀수만 계산
		for(int n=5;n<=1000;n+=2) {
			boolean flag=false;
			//제곱근 이하의 어떤 소수로
			//제곱근계산이 성립하지 않는 경우에도 계산은 했으니까 counter++해야한다. -> !flag에서 계산
			//곱셈
			for(int i=1;prime[i]*prime[i]<=n;i++) {
				//다음 연산의 수행횟수를 계산하기 위해서
				counter+=2;
				//나눗셈
				if(n%prime[i]==0) {
					flag=true;
					break;
				}
			}
			//제곱근 조건 불충족시 counter계산
			if(!flag) {
				prime[ptr++]=n;
				counter++;
			}
		}
		for(int i=0;i<ptr;i++) {
			System.out.println(prime[i]);
		}
		System.out.println(counter);
	}

}
