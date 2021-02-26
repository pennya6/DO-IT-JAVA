package study6;

public class StringStack {
	private int max;//스택 용량
	   private int ptr;//스택 포인터
	   private String[] stk;//스택 본체
	   
	   //실행 시 예외 : 스택이 비어있음
	   public class EmptyStringStackException extends RuntimeException{
	      public EmptyStringStackException() { 
	      }
	   }
	   
	   //실행 시 예외 : 스택이 가득 참
	   public class OverflowStringStackException extends RuntimeException{
	      public OverflowStringStackException() {}
	   }
	   
	   //생성자
	   public StringStack(int capacity) {
	      ptr = 0;
	      max = capacity;
	      
	      try {
	      stk = new String[max];
	      } catch (OutOfMemoryError e) {
	         max = 0;
	      }
	   }
	   
	   //스택에 x를 푸시
	   public String push(String x) throws OverflowStringStackException{
	      if(ptr>=max)
	         throw new OverflowStringStackException();
	      return stk[ptr++] = x;
	   }
	   
	   //스택에 데이터를 팝
	   public String pop() throws EmptyStringStackException{
	      if(ptr <= 0) 
	         throw new EmptyStringStackException();
	      
	      return stk[--ptr];
	   }
	   
	   //스택에 쌓여있는 데이터 수 
	   public int size() { return ptr; }
	}