package chap2;
//�迭 ��Ҹ� �������� �����ϴ� ������ �ϳ��ϳ� ��Ÿ����
public class ex2 {

	public static void main(String[] args) {
		int[] h=new int [] {5,10,73,2,-5,42};
		print(h);
		System.out.println();
		
		reverse(h);
		
		System.out.println();
		System.out.println("���� ������ ���ƽ��ϴ�.");
		
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
			System.out.println("a["+i+"]��(��) a["+s+"]�� ��ȯ�մϴ�.");
			print(a);
		}
	}
	
	
}
