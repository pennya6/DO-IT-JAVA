package study6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//ť �̿� -> ���Լ���
public class card2 {

	public static void main(String[] args) {
		
		//�ڹ��� ť �������̽�
		Queue<Integer> q = new LinkedList<>();
		
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		
		for(int i=1;i<n+1;i++) {
			//System.out.println(i);
			q.offer(i);
		}
		while(q.size()>1) {
			//���� ���� ������ �� ��ȯ �� ����
			q.poll();
			//���� ���� ������ �� ��ȯ�� �ؿ� �ֱ� 
			q.offer(q.poll());
		}
		System.out.println(q.poll());
	}

}
