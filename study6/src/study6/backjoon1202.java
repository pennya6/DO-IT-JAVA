package study6;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
//�˰��� ���
//���� V�� ���� �켱���� ť�� �����ؼ� ��
//�켱���� ť���� ���� ������ K�� ��������
//�� �����ö�  ���� M�� ���ؼ� �۰ų� ������ ��ȯ �ƴϸ� �н� 

//�켱���� ť ���
public class backjoon1202 {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		
		//n�� k�� �Է�
		int n=s.nextInt();
		int k=s.nextInt();
		
		//�ڹ��� ť �������̽�
		//�켱������ ���� ����
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
		
		//swap->�켱����
		for(int i=0;i<n;i++) {
			priorityQueue.add(s.nextInt());
			
		}
	
			
	}

}
