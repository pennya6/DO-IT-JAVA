package study5;

import java.util.Scanner;

//�����ڸ���
public class backjoonsun {
	public static boolean check(int[] a, int n, long x) {
        int cnt = 0;
        for (int i=0; i<a.length; i++) {
            cnt += a[i]/x;
        }
        return cnt >= n; //x�� �߶��� ��  n�� �̻����� ����
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int k=s.nextInt();
	int n=s.nextInt();
	int max=0;

		int a[]=new int[k];
		for(int i=0;i<k;i++) {
			a[i]=s.nextInt();
			//������ �ִ뱸�ϱ�
			max=Math.max(max, a[i]);
		}
		
		long answer=0;
		long start=1;
		long end=max; //�����ִ����
		
		while(start<=end) {
			
			//�ڸ� �������� �� ���ϱ� ���� Ž�� ���
			long mid=(start+end)/2; //�������� �ڸ��°�
			
			if(check(a, n, mid)) {
                answer = Math.max(answer,mid);
                start = mid+1;
            } else {
            	//�����ִ���̿��� -1
                end = mid-1;
            }
        }
        System.out.println(answer);
    }
}
	