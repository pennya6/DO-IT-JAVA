package chapter4;

public class IntQueue {
	//int형 큐
	private int max;
	private int front;
	private int rear;
	private int num;
	private int [] que;
	
	//큐가 비어있음
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {}
	}
	//큐가 가득참
	public class OverFlowIntQueueException extends RuntimeException{
		public OverFlowIntQueueException() {}
	}
	public IntQueue(int capacity) {
		num=front=rear=0;
		max=capacity;
		try {
			que=new int[max];
		}catch(OutOfMemoryError e) {
			max=0;
		}
	}
	public int enque(int x)throws OverFlowIntQueueException {
		if(num>=max) 
			throw new OverFlowIntQueueException();
			que[rear++]=x;
			num++;
		if(rear==max)
			rear=0;
		
		return x;
	}
	public int dequeue() throws EmptyIntQueueException{
		if(num<=0)
			throw new EmptyIntQueueException();
		int x=que[front++];
		num--;
		if(front==max)
			front=0;
		return x;	
	}
	public int peek() throws EmptyIntQueueException{
		if(num<=0)
			throw new EmptyIntQueueException();
		return que[front];
	}
	public int indexOf(int x) {
		for(int i=0;i<num;i++) {
			int idx=(i+front)%max;
			if(que[idx]==x)
				return idx;
		}
		return -1;
	}
	public void clear() {
		num=front=rear=0;
	}
	public int capacity() {
		return max;
	}
	public int size() {
		return num;
	}
	public boolean isEmpty() {
		return num<=0;
	}
	public boolean isFull() {
		return num>=max;
	}
	public void dump() {
		if(num<=0)
			System.out.println("queue empty");
		else {
			for(int i=0;i<num;i++)
				System.out.print(que[(i+front)%max]+" ");
			System.out.println();
		}
	}
	// 큐에서 x를 검색하여 머리부터 몇 번 째인가(찾지 못하면 0)를 반환
		public int search(int x) {
			for (int i = 0; i < num; i++)
				if (que[(i + front) % max] == x) // 검색성공
					return i + 1;
			return 0; // 검색실패
		}

}
