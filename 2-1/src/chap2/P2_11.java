package chap2;
//counter�� ������ ������ Ƚ���� �԰� ����
//1000������ �Ҽ�����
public class P2_11 {

	public static void main(String[] args) {
		//������ ������ Ƚ��
		int counter=0;
		//ã�� �Ҽ�����
		int ptr=0;
		//ã�� �Ҽ� �����ϴ� �迭
		int prime[]=new int[500];

		prime[ptr++]=2;
		prime[ptr++]=3;
		
		//Ȧ���� ���
		for(int n=5;n<=1000;n+=2) {
			boolean flag=false;
			//������ ������ � �Ҽ���
			//�����ٰ���� �������� �ʴ� ��쿡�� ����� �����ϱ� counter++�ؾ��Ѵ�. -> !flag���� ���
			//����
			for(int i=1;prime[i]*prime[i]<=n;i++) {
				//���� ������ ����Ƚ���� ����ϱ� ���ؼ�
				counter+=2;
				//������
				if(n%prime[i]==0) {
					flag=true;
					break;
				}
			}
			//������ ���� �������� counter���
			if(!flag) {
				prime[ptr++]=n;
				counter++;
			}
		}
		for(int i=0;i<ptr;i++) {
			System.out.println(prime[i]);
		}
		System.out.println(counter);
	}

}
