package study4;

import java.util.*;

public class backjoon2108 {
	//������
	static int avg(int[] arr) { 
		double result =0; //�ݿø�
		double sum=0;
		for(int x=0;x<arr.length;x++) {
			sum+=x;
		}
		//�ݿø�
		//�Ǽ��� �Ҽ��� ù��° �ڸ��� �ݿø��Ͽ� ������ ����
		result = Math.round(sum / arr.length);
		//�ø���
		return (int)Math.ceil(result); 
	}
	// �߾Ӱ�
	static int middle(int[] arr) { 		
		return arr[(arr.length/2)]; 
	}
	//�ֺ�
	static int manny(int[] arr) { 
		// ���밪 4000������ ������ ���� �� 8000��
		//-4000~4000
		int cnt[] = new int [8001]; 
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		//�ּҰ�
		int max = Integer.MIN_VALUE;
		for(int x=0;x<arr.length;x++) {
			
			if(x<0) { // ������ ��� 4000�� ���ؼ� �ش� �ε����� ����
				//���ڰ��� ���� ���밪 ��ȯ 
				cnt[Math.abs(x)+4000]++;
			}else cnt[x]++; // �������� �ε����� ����
		}
		
		int idx =0;
		for(int i=0;i<cnt.length;i++) {
			if(cnt[i]!=0 && cnt[i]>max) {	//ī��Ʈ �迭���� �ֺ��� ã�´�.			
				max = cnt[i];
				idx = i;				
			}
		}

		for(int i=0;i<cnt.length;i++) {
			int x=i;
			if(cnt[i]==max) { // ī��Ʈ �迭�� ����� �ֺ󰪰� ��ġ�ϸ�,
				if(i>4000) { // 4000�̻��� ������ �ٲ��ذ��̹Ƿ� �ٽ� ������ ���ڷ� �ٲ��ش�
					x-=4000;
					x*=-1;
					arrayList.add(x); // ��� ����Ʈ�� �߰�
				}else
					arrayList.add(i); // �������� �׳� i���� �߰�
			}
		}
		Collections.sort(arrayList); // �߰� �� �ֺ󰪵��� �ټ� �����ϸ� �������� ����
		
		if(arrayList.size()>1) return arrayList.get(1); // �ֺ��� ������ �����Ѵٸ�, ���� ���� ���ڿ��� �� ��° ���ڸ� ��ȯ
		else return 	arrayList.get(0); // �׿ܿ��� �׳� �ֺ��� ��ȯ
	}
	// ����
	static int range(int[] arr) { 
		// ���� �� ������ ���ڿ� ù ��° ���ڸ� ����
		return arr[arr.length-1] - arr[0]; 
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		
		int n= s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr); // �Է¹��� ������ �������� ����
		 
		System.out.println(avg(arr));
		System.out.println(middle(arr));
		System.out.println(manny(arr));
		System.out.println(range(arr));
		
	}
	
}