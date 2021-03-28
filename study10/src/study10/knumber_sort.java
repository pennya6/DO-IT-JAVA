package study10;

import java.util.Arrays;
//arrays=[1,5,2,6,3,7,4]
//commands=[[2,5,3],[4,4,1],[1,7,3]]
//return=[5,6,3]

public class knumber_sort {
    static void solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int [] temp = {};

        for(int i =0;i < commands.length;i++) {
        	//Array.copyOfRange(�迭,�����ε���,�������ε���) �迭����
        	//���� �ε����� ���� ������ �ε����� ������
        	//commands[0][0]=2 2-1=1
        	
        	//commands[i][0]-1 �� ���� �ε���
        	//commands[i][1]�� ������ �ε���
        	
        	//Arrays.copyOfRange(array,1,2)/(array,3,4)/(array,5,6)
        	//temp=[5,6,3]
        	
            temp = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            Arrays.sort(temp);
            //commands[0][2]=3, 3-1=2
            //answer[0]=temp[2];
            //
            answer[i]=temp[commands[i][2]-1];
        }
       
        	//System.out.println(answer);
        for(int i=0;i<answer.length;i++) {
        	System.out.print(answer[i]+" ");
        }
    }
    public static void main(String[] args){
    	int a[]=new int[] {1,5,2,6,3,7,4};
    	int commands[][]= {{2,5,3},{4,4,1},{1,7,3}};
    	
    	solution(a, commands);
    }
    
}

