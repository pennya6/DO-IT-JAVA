package study6;

import java.util.Scanner;

//�ܾ� ���� ������
//���� ���� ��� -> ������ ���Լ��� Ư¡ ���
public class backjoon_12605 {

	
	public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	IntStack stack=new IntStack();
	System.out.println("���� �� �ܾ��� ������ �Է��Ͻÿ� : ");
	int r=s.nextInt(); //���� �ܾ� ����
	
		while(true) {
			try {
				//�迭�� ������ ���� �Է¹ޱ�
				for(int i=0;i<r;i++) {
					
					String x=s.next();
					//�迭
					//������ ���� �̿� 
					//������ ���� 0�ϰ��� �߶� ���ÿ� push
					//���Ŀ� pop �ϸ� �ݴ�� ���
					
					//x�� ���ڿ� ��ĭ�� �������� �ɰ���
					String word[]=x.split("\\s");
					
					//word�� ���� ���ʴ�� �����ͼ� wo�� �־��
					String rword[]=new String[] {};
	
					for(int k=0;k<word.length-1;i++) {
						for(String wo:word) {
							//System.out.println(wo);
							//rword[1]=wo;
							//System.out.println(rword[k]);
							//stack.push(rword[k]);
							//stack.push(wo);
						}
					//stack.pop();
					}
					//for(int j=0;j<stack.size();j++) {
						//stack.pop();
					//}
					
				}	
			}catch(IntStack.OverflowIntStackX2Exception e) {
				System.out.println("������ ���� á���ϴ�.");
				break;
			}catch(IntStack.EmptyIntStackX2Exception e) {
				System.out.println("������ ����ֽ��ϴ�.");
				break;
			}
			
		}
	
	}
}

