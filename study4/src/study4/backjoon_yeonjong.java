package study4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//binarysearch
//2776
public class backjoon_yeonjong {
	//����Ž��-> �ݵ�� ���ĵǾ��־����
	public static void main(String[] args) {

		  Scanner sc = new Scanner(System.in);
		  int T = sc.nextInt();
		  ArrayList output = new ArrayList();
		  
		  for (int i = 0; i < T; i++) {

		   int N = sc.nextInt();

		   if(N < 0 || N > 1000000) {
			   
		    System.out.println("���� �ʰ�");
		    
		   } 
		   else {
			   
			    int[] note1 = new int[N];
			    
				    for(int j = 0; j < N; j++) {
				    	
				      note1[j] = sc.nextInt();
				    }
			    
			    Arrays.sort(note1); // ����
			    
			    int M = sc.nextInt();
			    // ��忡 ������ �־�����, �ش� ������ ã�� �˰��� �����ϸ� �ȴ�.
			    for(int k = 0; k < M; k++) {
			     // note1(��ø1)�� �˻��Ͽ� �Է¹��� ��(��ø2)�� �ִ��� ������ �Ǵ�, ������ 1, ������ 0�� sb�� �ִ´�.
			     if(Arrays.binarySearch(note1, sc.nextInt()) > -1) {
			      output.add(1);
			     }else {
			      output.add(0);
			     }
			    }
			    
			    for(int q = 0; q < note1.length; q++) {
			     System.out.println(output.get(q));
			    }
		   }
		  }
		 }
		}