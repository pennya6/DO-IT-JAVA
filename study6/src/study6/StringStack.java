package study6;

public class StringStack {
	private int max;//���� �뷮
	   private int ptr;//���� ������
	   private String[] stk;//���� ��ü
	   
	   //���� �� ���� : ������ �������
	   public class EmptyStringStackException extends RuntimeException{
	      public EmptyStringStackException() { 
	      }
	   }
	   
	   //���� �� ���� : ������ ���� ��
	   public class OverflowStringStackException extends RuntimeException{
	      public OverflowStringStackException() {}
	   }
	   
	   //������
	   public StringStack(int capacity) {
	      ptr = 0;
	      max = capacity;
	      
	      try {
	      stk = new String[max];
	      } catch (OutOfMemoryError e) {
	         max = 0;
	      }
	   }
	   
	   //���ÿ� x�� Ǫ��
	   public String push(String x) throws OverflowStringStackException{
	      if(ptr>=max)
	         throw new OverflowStringStackException();
	      return stk[ptr++] = x;
	   }
	   
	   //���ÿ� �����͸� ��
	   public String pop() throws EmptyStringStackException{
	      if(ptr <= 0) 
	         throw new EmptyStringStackException();
	      
	      return stk[--ptr];
	   }
	   
	   //���ÿ� �׿��ִ� ������ �� 
	   public int size() { return ptr; }
	}