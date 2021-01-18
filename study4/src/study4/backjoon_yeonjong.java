package study4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//binarysearch
//2776
public class backjoon_yeonjong {
	//이진탐색-> 반드시 정렬되어있어야함
	public static void main(String[] args) {

		  Scanner sc = new Scanner(System.in);
		  int T = sc.nextInt();
		  ArrayList output = new ArrayList();
		  
		  for (int i = 0; i < T; i++) {

		   int N = sc.nextInt();

		   if(N < 0 || N > 1000000) {
			   
		    System.out.println("범위 초과");
		    
		   } 
		   else {
			   
			    int[] note1 = new int[N];
			    
				    for(int j = 0; j < N; j++) {
				    	
				      note1[j] = sc.nextInt();
				    }
			    
			    Arrays.sort(note1); // 정렬
			    
			    int M = sc.nextInt();
			    // 노드에 값들을 넣었으니, 해당 값들을 찾는 알고리즘 구현하면 된다.
			    for(int k = 0; k < M; k++) {
			     // note1(수첩1)을 검색하여 입력받은 값(수첩2)이 있는지 없는지 판단, 있으면 1, 없으면 0을 sb에 넣는다.
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