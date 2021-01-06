package chap2;
//array clone
public class P2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int [] {1,2,3,4,5};
		int b[]=a.clone(); //b는 a의 복제를 참조
		
		//b[3]=4인상태
		//b[3]요소에만 0대입
		b[3]=0; 
		for(int i=0;i<a.length;i++) {
			System.out.println("array a: "+a[i]);
		}
		for(int i=0;i<b.length;i++) {
			System.out.println("array b: "+b[i]);
		}
		
	}

}
