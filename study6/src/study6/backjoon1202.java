package study6;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
//알고리즘 방법
//가격 V의 값을 우선순위 큐에 대입해서 비교
//우선순위 큐에서 상위 개수를 K개 가져오기
//단 가져올때  무게 M을 비교해서 작거나 같으면 반환 아니면 패스 

//우선순위 큐 사용
public class backjoon1202 {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		
		//n과 k값 입력
		int n=s.nextInt();
		int k=s.nextInt();
		
		//자바의 큐 인터페이스
		//우선순위가 높은 숫자
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
		
		//swap->우선순위
		for(int i=0;i<n;i++) {
			priorityQueue.add(s.nextInt());
			
		}
	
			
	}

}
