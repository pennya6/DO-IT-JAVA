package chap2;
//배열 요소를 역순으로 정렬하는 과정을 하나하나 나타내라
public class ex2 {

	public static void main(String[] args) {
		int[] h=new int [] {5,10,73,2,-5,42};
		print(h);
		System.out.println();
		
		reverse(h);
		
		System.out.println();
		System.out.println("역순 정렬을 마쳤습니다.");
		
	}
	static void swap(int a[],int index1,int index2) {
		int t=a[index1];
		a[index1]=a[index2];
		a[index2]=t;
	}
	static void print(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	static void reverse(int a[]) {
		for(int i=0;i<a.length/2;i++) {
			int s=a.length-i-1;
			swap(a,i,s);
			System.out.println("a["+i+"]과(와) a["+s+"]를 교환합니다.");
			print(a);
		}
	}
	
	
}
