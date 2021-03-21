package chap06;
//ÄüÁ¤·Ä
public class P6C_1 {
	static void swap(int [] a, int idx1,int idx2) {
		int t=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
	}
	static void quicksort(int []a,int left,int right) {
		int pl=left;
		int pr=right;
		int x=a[(pl+pr)/2];
		
		System.out.printf("a[%d]~a[%d]:{",left,right);
		for(int i=left;i<right;i++) {
			System.out.printf("%d, ",a[i]);
		}
		System.out.printf("%d}\n",a[right]);
		
		do {
			while(a[pl]<x)pl++;
			while(a[pr]>x)pr--;
			if(pl<=pr)
				swap(a,pl++,pr--);
		}while(pl<=pr);
		
		if(left<pr) quicksort(a, left, pr);
		if(pl<right) quicksort(a, pl, right);
	}

	

}
