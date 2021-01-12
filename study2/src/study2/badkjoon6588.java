package study2;
//9020
//�������� ����
//1.�Ҽ� �к�
//2.�Ҽ��� �ƴѰ��� ������
//3.���ϴ� ���� ���� �Ҽ�
import java.util.Scanner;

public class badkjoon6588 {

	public static final int max=1000000;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("�׽�Ʈ ���̽� ������ �Է��϶�");
		int num=s.nextInt(); //��� ��� ��Ƽ�� ��
		
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
