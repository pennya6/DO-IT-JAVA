
public class Intset {

	private int max;
	private int num;
	private int [] set;
	
	public Intset(int capacity) {
		num=0;
		max=capacity;
		try {
			set=new int [max];
		}
		catch(OutOfMemoryError e) {
			max=0;
		}
	}
	
	public int capacity() {
		return max;
	}
	public int size() {
		return num;
	}
	public int indexOf(int n) {
		for(int i=0;i<num;i++)
			if(set[i]==n)
				return i;
		return -1;
	}
	public boolean contains(int n) {
		return (indexOf(n)!=-1)? true:false;
	}
	public boolean add(int n) {
		if(num>=max||contains(n)==true)
			return false;
		else {
			set[num++]=n;
		}
		return true;
	}
	public boolean remove(int n) {
		int idx;
		if(num<=0||(idx=indexOf(n))==-1)
			return false;
		else {
			//마지막을 삭제한 원소의 위치로 옮긴다.
			set[idx]=set[-num];
			return true;
		}
	}
	//집합 S에 복사
	public void copyTo(Intset s) {
		int n=(s.max<num)?s.max:num;
		for(int i=0;i<n;i++) {
			s.set[i]=set[i];
		}
		s.num=n;
	}
	//집합 S을 복사
	public void copyFrom(Intset s) {
		int n=(max<s.num)?max:s.num;
		for(int i=0;i<n;i++) {
			set[i]=s.set[i];
		}
		num=n;
	}
}
