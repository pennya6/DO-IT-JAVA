package chap2;
//3�� �Ҽ����� �Ǵ��ϴ� ����
public class P2_10 {

	public static void main(String[] args) {
	
		//������ Ƚ��
		int counter=0;
		//�Ҽ�����
		int ptr=0;
		//�Ҽ�����迭
		int []prime=new int[500];
	
		//prime[0]=2
		//2�� �Ҽ�
		prime[ptr++]=2;
		
		//Ȧ���� ���
		for(int n=3;n<=1000;n+=2) {
			int i;
			//ã�� �Ҽ��� �����ֱ�
			for(i=1;i<ptr;i++) {
				counter++; //�Ҽ��� �ƴϴ��� �ϴ� ����� ������ ī���� ���ϱ�
				if(n%prime[i]==0) {
					break; //ã�� �Ҽ��� �������ٸ� �Ҽ��� �ƴϴ�
				}
			}
			//���������� �ȳ��������ٸ�
			if(ptr==i) {
				prime[ptr++]=n;//�Ҽ�
			}
		}
		for(int i=0;i<ptr;i++) {
			System.out.println(prime[i]);
		}
		System.out.println(counter);
	}
}
