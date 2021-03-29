package study10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//���ĺ� �ҹ��� 
//����ª���� ����
//���̰� ������ ������ ����
public class baekjoon_alp {
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();//�ܾ� ����
		String a[]=new String[n];
		for(int i=0;i<n;i++) {
			a[i]=s.next();
		}
		
		//���� ª�� �� ���
		Arrays.sort(a,new Comparator<String>() {
			public int compare(String a1, String a2) {
                if(a1.length() > a2.length()) return 1;
                else if(a1.length() == a2.length()) return 0;
                else return -1;
            }
		});
		//���̰� ���� ��� 
		for(int i=0;i<a.length;i++) {
			int j;
			for(j=i+1;j<n;j++ ) {
				if(a[i].length()!=a[j].length()) 
					break;
			}
			Arrays.sort(a,i,j);
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
