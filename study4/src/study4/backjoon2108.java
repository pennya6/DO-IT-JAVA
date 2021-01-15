package study4;

import java.util.*;

public class backjoon2108 {
	//산술평균
	static int avg(int[] arr) { 
		double result =0; //반올림
		double sum=0;
		for(int x=0;x<arr.length;x++) {
			sum+=x;
		}
		//반올림
		//실수의 소수점 첫번째 자리를 반올림하여 정수로 리턴
		result = Math.round(sum / arr.length);
		//올림값
		return (int)Math.ceil(result); 
	}
	// 중앙값
	static int middle(int[] arr) { 		
		return arr[(arr.length/2)]; 
	}
	//최빈값
	static int manny(int[] arr) { 
		// 절대값 4000까지의 정수를 저장 총 8000개
		//-4000~4000
		int cnt[] = new int [8001]; 
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		//최소값
		int max = Integer.MIN_VALUE;
		for(int x=0;x<arr.length;x++) {
			
			if(x<0) { // 음수의 경우 4000을 더해서 해당 인덱스를 증가
				//인자값에 대한 절대값 반환 
				cnt[Math.abs(x)+4000]++;
			}else cnt[x]++; // 나머지는 인덱스만 증가
		}
		
		int idx =0;
		for(int i=0;i<cnt.length;i++) {
			if(cnt[i]!=0 && cnt[i]>max) {	//카운트 배열에서 최빈값을 찾는다.			
				max = cnt[i];
				idx = i;				
			}
		}

		for(int i=0;i<cnt.length;i++) {
			int x=i;
			if(cnt[i]==max) { // 카운트 배열의 값들과 최빈값과 일치하면,
				if(i>4000) { // 4000이상은 음수를 바꿔준것이므로 다시 원래의 숫자로 바꿔준다
					x-=4000;
					x*=-1;
					arrayList.add(x); // 어레이 리스트에 추가
				}else
					arrayList.add(i); // 나머지는 그냥 i값을 추가
			}
		}
		Collections.sort(arrayList); // 추가 된 최빈값들이 다수 존재하면 오름차순 정렬
		
		if(arrayList.size()>1) return arrayList.get(1); // 최빈값이 여러개 존재한다면, 가장 작은 숫자에서 두 번째 숫자를 반환
		else return 	arrayList.get(0); // 그외에는 그냥 최빈값을 반환
	}
	// 범위
	static int range(int[] arr) { 
		// 정렬 후 마지막 숫자와 첫 번째 숫자를 빼줌
		return arr[arr.length-1] - arr[0]; 
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		
		int n= s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr); // 입력받은 정수를 오름차순 정렬
		 
		System.out.println(avg(arr));
		System.out.println(middle(arr));
		System.out.println(manny(arr));
		System.out.println(range(arr));
		
	}
	
}