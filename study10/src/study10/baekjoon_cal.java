package study10;

import java.util.Arrays;
import java.util.Scanner;

//점수 계산 문제
public class baekjoon_cal {
	public static void main(String[] args) {
	
		
        Scanner s=new Scanner(System.in);
        int [] score= new int[8];
        //점수입력
        for(int i=0;i<8;i++) {
            score[i]=s.nextInt();
        }
        //인덱스 값
        int [] idx=new int[8];
        //최대 5개 
        int [] max=new int[5];
        int cnt=0;
        
        //idx[0]=score[0]
        for(int i=0;i<8;i++) {
            idx[cnt]=score[i];
            cnt++;
        }
        
        
        int sum=0;
        //정렬
        Arrays.sort(score);
        
        cnt=0;
        
        //max[0]=score[3]
        //sum=sum+max[0];
        for(int i=3;i<8;i++) {
            max[cnt]=score[i];
            sum+=max[cnt];
            cnt++;              
        }
        
        System.out.println(sum);
        //idx[0]==max[0]
        for(int i=0;i<8;i++) {
            for(int j=0;j<5;j++) {
                if(idx[i]==max[j]) {
                    System.out.print(i+1+" ");
                }
            }
        }

}
}