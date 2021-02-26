package study6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//큐 이용 -> 선입선출
public class card2 {

	public static void main(String[] args) {
		
		//자바의 큐 인터페이스
		Queue<Integer> q = new LinkedList<>();
		
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		
		for(int i=1;i<n+1;i++) {
			//System.out.println(i);
			q.offer(i);
		}
		while(q.size()>1) {
			//가장 먼저 보관한 값 반환 후 삭제
			q.poll();
			//다음 먼저 보관한 값 반환후 밑에 넣기 
			q.offer(q.poll());
		}
		System.out.println(q.poll());
	}

}
