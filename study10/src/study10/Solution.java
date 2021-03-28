package study10;

import java.util.Scanner;
//arrays=[1,5,2,6,3,7,4]
//commands=[[2,5,3],[4,4,1],[1,7,3]]
//return=[5,6,3]

class Solution {
    //ÄüÁ¤·Ä
    static void swap(int a[],int idx1, int idx2){
        int t=a[idx1];
        a[idx1]=a[idx2];
        a[idx2]=t;
    }
    static void quickSort(int a[],int left,int right){
        int pl=left;
        int pr=right;
        int x=a[(pl+pr)/2];
        
        do{
            while(a[pl]<x) pl++;
            while(a[pr]>x) pr--;
            if(pl<=pr)
                swap(a,pl++,pr--);
        }while(pl<=pr);
        
        if(left<pr) quickSort(a,left,pr);
        if(pl<right) quickSort(a,pl,right);
    }
   
    static void solution(int[] array, int[][] commands) {
    	int n=0;
    	int []answer=new int [commands.length];
    	
    	while(n<commands.length) {
    		//m=5-3=2
    		int m=commands[n][1]-commands[n][0]+1;
    		
    		if(m==1) {
    			//[0][0]=2 2-1=1
    			//answer[0]=array[1];
    			answer[n]=array[commands[n++][0]-1];
    			continue;
    		}
    		int a[]=new int[m];
    		int j=0;
    		for(int i = commands[n][0]-1; i < commands[n][1]; i++)
                a[j++] = array[i];

            quickSort(a, 0, m-1);

            answer[n] = a[commands[n++][2]-1];
            
            for(int i=0;i<answer.length;i++) {
            	System.out.print(answer[i]+" ");
            }
        
    	}
        
    }
    public static void main(String[] args){
    	int a[]=new int[] {1,5,2,6,3,7,4};
    	int commands[][]= {{2,5,3},{4,4,1},{1,7,3}};
    	
    	//System.out.println(commands.length);
    	solution(a, commands);
    }
}