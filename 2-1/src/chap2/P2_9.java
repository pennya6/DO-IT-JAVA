package chap2;
//1000이하의 소수 나열
public class P2_9 {

	public static void main(String[] args) {

		int counter =0; //나눗셈 횟수
		for(int n=2;n<=1000;n++) {
			int i;
			for(i=2;i<n;i++) {
				counter++;
				//나누어 떨어지면 소수가 아니다
				if(n%i==0)
					break;
			}
			//소수
			if(n==i)
				System.out.println(n);
			
		}
		System.out.println(counter);
	}

}
